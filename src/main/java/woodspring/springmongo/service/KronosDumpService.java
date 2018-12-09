package woodspring.springmongo.service;

import java.util.List;

import woodspring.springmongo.model.Kronos_Dump;

public interface KronosDumpService {
	
	Integer loadKronosDump(String filename);
	Kronos_Dump getKronoseByKcId(int kcId);
	List<Kronos_Dump> getKronoseByFirstname(String firstname);
	List<Kronos_Dump> getKronoseByLastname(String lastname);
	List<Kronos_Dump> getKronoseByFullName(String firstname, String lastname);

}
