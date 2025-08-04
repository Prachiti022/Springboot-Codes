package in.elite.JPA;

 import java.util.Iterator;
 import java.util.List;
 import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import in.elite.JPA.DAO.UserRepository;
import in.elite.JPA.Entities.User;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "in.elite.JPA.DAO")
public class BootJPAExampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootJPAExampleApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		
//		// Create Table and add record
//		User u1 = new User();
//		u1.setName("Prachiti");
//		u1.setCity("USA");
//		u1.setStatus("Working");
//		
//		User user1 = userRepository.save(u1);
//		System.out.println(user1);
//		
//		User u2 = new User();
//		u2.setName("Uma");
//		u2.setCity("Delhi");
//		u2.setStatus("Sleeping");
//		
//		User u3 = new User();
//		u3.setName("Sanchita");
//		u3.setCity("Mumbai");
//		u3.setStatus("Billionaire");
//		
//		List<User> users = List.of(u2, u3);
//		Iterable<User> resultIterable = userRepository.saveAll(users);
//		
//		resultIterable.forEach(user->{
//			System.out.println(user);
//		});
		
		// Find and return a record
//		Optional<User> optional = userRepository.findById(2);
//		User user = optional.get();
//		System .out.println(user);
		
		// Update a particular record using Id
//		Optional<User> optional = userRepository.findById(2);
//		User user = optional.get();
//		user.setStatus("Millionaire");
//		User updateResult = userRepository.save(user);
//		System.out.println(updateResult);
		
		// Get all data from database
//		Iterable<User> itr = userRepository.findAll();
//      for (User user : itr) {
//          System.out.println(user);
//      }	
		
		// Delete user data from table
//		userRepository.deleteById(6);
		
		// Delete all
//		Iterable<User> allusers = userRepository.findAll();
//		allusers.forEach(user->System.out.println(user));
//		userRepository.deleteAll(allusers);
		
		//Return all users
//		List <User> allUser = userRepository.getAllUser();
//		allUser.forEach(e->{System.out.println(e);});
		
		// Find by name
//		List <User> allUser = userRepository.getAllUser();
//		allUser.forEach(e->{
//			System.out.println(e);
//		});
//		List<User> userByName = userRepository.getUserByName("Uma");
//		userByName.forEach(e->{
//			System.out.println(e);
//		});
		
		// Find by name and city
		List<User> usersByNameAndCity = userRepository.getUserByNameAndCity("Sanchita", "Mumbai");
		usersByNameAndCity.forEach(user->System.out.println(user.getName() + "from" + user.getCity()));
		userRepository.getUsers().forEach(e->{System.out.println(e);});
		
	}
}
