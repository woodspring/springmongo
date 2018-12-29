package woodspring.springmongo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import woodspring.springmongo.model.Kronos_Dump;
import woodspring.springmongo.service.AdDataService;
import woodspring.springmongo.service.KronosDumpService;



@RestController
@RequestMapping("/spring")
public class SpringController {
	
	@Autowired
	KronosDumpService kcService;
	
	@Autowired
	AdDataService adDataService;
	
	
	@GetMapping("/kronos/load")
	public String loadKronoseDump() {
		String retStr = "Loading item: " ;
		int loadNo = kcService.loadKronosDump("C_Kronos.CSV");
		retStr += loadNo;
		return retStr;
		
	}
	
	@GetMapping("/kronos/find/{kcId}")
	public String getKronoseByKcId(@PathVariable int kcId) {
		String retStr = " getKC by kcId: "+ kcId+" " ;
		retStr += kcService.getKronoseByKcId(kcId);
		
		return retStr;
		
	}
	
	@GetMapping("/kronos/find/firstname/{firstname}")
	public String getKronoseByFirstname(@PathVariable String firstname) {
		StringBuilder retStr = new StringBuilder();
		retStr.append(" getKC by firstname: "+ firstname+" =>");
		List<Kronos_Dump> kcList = (List<Kronos_Dump>) kcService.getKronoseByFirstname(firstname); 
		kcList.stream().forEach(item -> retStr.append(item+ " \n\n "));
		
		
		return retStr.toString();
		
	}
	
	
	@GetMapping("/kronos/find/lastname/{lastname}")
	public String getKronoseByLastname(@PathVariable String lastname) {
		StringBuilder retStr = new StringBuilder();
		retStr.append(" getKC by lastname: "+ lastname+" =>");
		List<Kronos_Dump> kcList = (List<Kronos_Dump>) kcService.getKronoseByLastname(lastname); 
		kcList.stream().forEach(item -> retStr.append(item+ " \n\n "));
		
		
		return retStr.toString();
		
	}
	
	@GetMapping("/kronos/find/fullname/{firstname}/{lastname}")
	public String getKronoseByLFullName(@PathVariable String firstname, @PathVariable String lastname) {
		StringBuilder retStr = new StringBuilder();
		retStr.append(" getKC by FULLNAME: "+ firstname+" "+ lastname +" =>");
		List<Kronos_Dump> kcList = (List<Kronos_Dump>) kcService.getKronoseByFullName(firstname, lastname); 
		kcList.stream().forEach(item -> retStr.append(item+ " \n\n "));
		
		return retStr.toString();
		
	}
	
	@GetMapping("/AD_ALL")
	public String load_AdAll() {
		String retStr = "Loading item: " ;
		int loadNo = (int) adDataService.readADFile("AD_ALL.xls");
		retStr += loadNo;
		return retStr;
		
	}
	

}
