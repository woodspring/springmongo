package woodspring.springmongo.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import woodspring.springmongo.model.Users;

public interface UsersService {
	
	Mono<Users> createUser(Users users); 
	
	Mono<Users > updateUser(Users user, String id);
	
	Flux<Users > findAll();
	
	Mono<Users> findUserById(String id);
	
	Flux<Users > findUserByName(String name);
	
	Flux<Users> findByStatus(String status);
	
	Mono<Void> delete(String id);

}
