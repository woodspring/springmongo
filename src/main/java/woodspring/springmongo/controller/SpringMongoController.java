package woodspring.springmongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import woodspring.springmongo.model.Users;
import woodspring.springmongo.service.UsersService;


@Slf4j
@RestController
@RequestMapping(value="mongo")
public class SpringMongoController {
	
	@Autowired
	private UsersService userService;
	
	@GetMapping("/find")
	public Flux<Users> finAll() {
		log.debug(" findAll user ");
		Flux<Users> userF = userService.findAll();
		log.debug(" findAll user -->"+ userF.toString());
		return userF;
	}

	
	@GetMapping("/find/{userName}")
	public Flux<Users> findUsersByName(@RequestParam String userName)  {
		log.debug(" find  user by name ");
		Flux<Users> userF = userService.findUserByName( userName); 
		log.debug(" find  user by name  -->"+ userF.toString());
		return userF;
	}
	
	
	@GetMapping("/{id}")
	public Mono<Users> findUsersById(@RequestParam String id)  {
		log.debug(" find  user by id ");
		Mono<Users> userF = userService.findUserById( id);  
		log.debug(" find  user by id  -->"+ userF.toString());
		return userF;
	}
}
