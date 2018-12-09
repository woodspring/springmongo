package woodspring.springmongo.repository;

import woodspring.springmongo.model.Kronos_Dump;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface KronosDumpRepository extends MongoRepository<Kronos_Dump, Integer>{

	
	Kronos_Dump findByCkId(Integer ckId);
    
    List<Kronos_Dump> findByFirstNameLike(String firstName);
 
    List<Kronos_Dump> findByLastNameLike(String lastName);
 
    // Supports native JSON query string
    @Query("{firstName:{ $regex : '?0', $options : '' }, lastName: { $regex : '?1', $options : '' }}")
    List<Kronos_Dump> findCKByFullName(String firstname, String lastname);
 
}
