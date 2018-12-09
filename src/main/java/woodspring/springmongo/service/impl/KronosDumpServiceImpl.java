package woodspring.springmongo.service.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import woodspring.springmongo.model.Kronos_Dump;
import woodspring.springmongo.model.builder.KronosDumpBuilder;
import woodspring.springmongo.repository.KronosDumpRepository;
import woodspring.springmongo.service.KronosDumpService;

@Service
@Slf4j
public  class KronosDumpServiceImpl implements KronosDumpService {

	
	@Autowired
	KronosDumpRepository kcDumpRepository;
	
	static int recNo =0;
	
	//static String pathStr = "classpath:NYGH//";
	static String pathStr = "//home//woodspring//workspace-201811//SpringMongo//src//main//resources//NYGH//";
	
	@Override
	public Integer loadKronosDump(String filename) {
		
	    Path path = null;
	    recNo = 0;
		try {

			path = Paths.get(pathStr+filename);
			//StringBuilder data = new StringBuilder();
			//int loadedNo =0;
			Stream<String> lines = Files.lines(path);
			lines.forEach(line -> {
				//String[] fields = line.split("\t");
				if (line.length() < 3) return;
				if (line.contains("##") ) {} else {
				String empId = line.substring(0, 9);
				String firstname = line.substring(10,28);
				String lastname = line.substring(31, 49);
				String phone = line.substring(50, 69);
				
				String h_comp = line.substring(215, 218);
				String h_vp = line.substring(219, 229);
				String h_site=line.substring(230, 240);
				String h_prog = line.substring(241, 271);
				String h_dep = line.substring(272, 302);
				String h_subdep = line.substring(303, 333);
				String h_title = line.substring(334, 364);
				
				String p_cvp = line.substring(365, 374);
				String p_site=line.substring(375, 385);
				String p_prog = line.substring(386, 391);
				String p_dep = line.substring(392, 397);
				String p_subdep = line.substring(398, 426);
				String p_title = line.substring(427, 457);
				String p_union = line.substring(458, 463);

				
				String email = line.substring(532, 607);
				String reportTo = line.substring( 608, 617);
				if ( reportTo.contains("1")) {
				System.out.println("line:["+ line+"] length:"+line.length());
				System.out.println("empId:["+ empId+"] firstname:["+firstname+"] lastname:["+lastname+"] phone:["+phone+"]");
				System.out.println("h_comp:["+ h_comp+"] h_vp:["+ h_vp+"] h_site:["+ h_site+"] h_prog:["+ h_prog+"]");
				System.out.println("reportTo:["+ reportTo+"] length:["+ line.length()+"] report length:"+ reportTo.trim().length());
				}
				//System.out.println("reportTo:["+ reportTo+"] length:["+ line.length()+"] report length:"+ reportTo.trim().length());
				Kronos_Dump dDump = new KronosDumpBuilder()
				.setCkId(Integer.valueOf(empId.trim()))
				.setFirstname(firstname)
				.setLastname(lastname)
				.setTelphone(phone)
				.setH_Comp(h_comp).setH_VP(h_vp).setH_Site(h_site).setH_Prog(h_prog).setH_Dep(h_dep).setH_Subdep(h_subdep).setH_Title(h_title)
				.setP_CVP(p_cvp).setP_Site(p_site).setP_Prog(p_prog).setP_Dep(p_dep).setP_Subdep(p_subdep).setP_Title(p_title).setP_Union(p_union)
				.setEmail(email)
				.setReportTo((reportTo == null) ? "--" : reportTo)
				.build();

//				Kronos_Dump dDump = new Kronos_DumpBuilder()
//												.setCkId(Integer.valueOf(fields[0]))
//												.setFirstname(fields[1])
//												.setLastname(fields[2])
//												.setTelphone(fields[3])
//												.setOrgLev6(fields[4])
//												.setOrgLev7(fields[5])
//												.setLabLev5(fields[6])
//												.setLabLev7(fields[7])
//												.build();
				//System.out.println("line:["+line+"] dDumo:["+dDump.toString()+"]");
				log.info("line:[{}]=> dDump:[{}]", line, dDump.toString());
					Kronos_Dump dDumpRet = kcDumpRepository.insert(dDump);
				log.info("return:[{}]", dDumpRet);	
					recNo++;
				}
				});
			
			lines.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    	          

	    //Assert.assertEquals(expectedData, data.toString().trim());
		return Integer.valueOf(recNo);	
	}

	@Override
	public Kronos_Dump getKronoseByKcId(int kcId) {
		Kronos_Dump kcDump = new Kronos_Dump();
		kcDump = kcDumpRepository.findByCkId(kcId);
		return kcDump;
	}
	
	@Override
	public List<Kronos_Dump> getKronoseByFirstname(String firstname) {
		List<Kronos_Dump> kcDumpList = new ArrayList<Kronos_Dump>();
		kcDumpList = kcDumpRepository.findByFirstNameLike(firstname);
		return kcDumpList;
	}
	
	@Override
	public List<Kronos_Dump> getKronoseByLastname(String lastname) {
		List<Kronos_Dump> kcDumpList = new ArrayList<Kronos_Dump>();
		kcDumpList = kcDumpRepository.findByLastNameLike(lastname);
		return kcDumpList;
	}
	
	@Override
	public List<Kronos_Dump> getKronoseByFullName(String firstname, String lastname) {
		List<Kronos_Dump> kcDumpList = new ArrayList<Kronos_Dump>();
		kcDumpList = kcDumpRepository.findCKByFullName(firstname, lastname);
		return kcDumpList;
	}

}
