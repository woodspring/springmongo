package woodspring.springmongo.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import woodspring.springmongo.model.Users;


@Repository
public interface UserRepository extends ReactiveMongoRepository<Users, String> {
	
	Flux<Users> findByName(String name);
	
	Flux<Users> findByNameAndDeleteIsFalse( String name);
	
	Flux<Users> findByStatus(String status);
	
	Flux<Users> findByStatusAndDeleteIsFalse( String name);
	
	Mono<Users> findByIdAndDeleteIsFalse(String id);

}
