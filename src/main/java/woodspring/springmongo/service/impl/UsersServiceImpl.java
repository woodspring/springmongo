package woodspring.springmongo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import woodspring.springmongo.model.Users;
import woodspring.springmongo.repository.UserRepository;
import woodspring.springmongo.service.UsersService;


@Service
@ToString
@Slf4j
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public Mono<Users> createUser(Users users) {
		return userRepository.insert( users);
	}

	@Override
	public Mono<Users> updateUser(Users user, String id) {
		return userRepository.findById( id).doOnSuccess( findUser -> {
			Users aUser = (Users)findUser; 
			findUser.setName( user.getName());
			findUser.setAge( user.getAge());
			findUser.setStatus( user.getStatus());
			userRepository.save(findUser).subscribe();
		});
	}

	@Override
	public Flux<Users> findAll() {
		return userRepository.findAll();
	}

	@Override
	public Mono<Users> findUserById(String id) {
		return userRepository.findById(id);
	}

	@Override
	public Flux<Users> findUserByName(String name) {
		return userRepository.findByName( name);
	}

	@Override
	public Flux<Users> findByStatus(String status) {
		return userRepository.findByStatus(status);
		
	}

	@Override
	public Mono<Void> delete(String id) {
		return userRepository.deleteById(id);
	}

}
