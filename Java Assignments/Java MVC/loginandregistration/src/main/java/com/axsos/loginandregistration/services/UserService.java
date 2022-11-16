package com.axsos.loginandregistration.services;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.axsos.loginandregistration.models.LoginUser;
import com.axsos.loginandregistration.models.User;
import com.axsos.loginandregistration.repositories.UserRepository;




@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepo;
    
	 public User findUserByEmail(String email) {
	     Optional<User> optionalDojo = userRepo.findByEmail(email);
	     if(optionalDojo.isPresent()) {
	         return optionalDojo.get();
	     } else {
	         return null;
	     }
	 }
	 public User findUserById(long id) {
	     Optional<User> optionalDojo = userRepo.findById(id);
	     if(optionalDojo.isPresent()) {
	         return optionalDojo.get();
	     } else {
	         return null;
	     }
	 }
	 public List<User> allUsers() {
	     return userRepo.findAll();
	 }
    
	 
    public User register(User newUser, BindingResult result) {
        
    	Optional<User> potentialUser = userRepo.findByEmail(newUser.getEmail());
    	// Reject if email is taken (present in database)
    	if (potentialUser.isPresent()) {
    		result.rejectValue("email", "Matches", "Email already exists");
    	}
    	// Reject if password doesn't match confirmation
    	if(!newUser.getPassword().equals(newUser.getConfirm())) {
    	    result.rejectValue("confirm", "Matches", "The Confirm Password must match Password!");
    	}
    	
    	String toCheckPattern = newUser.getUserName();
    	if (!toCheckPattern.matches("[a-zA-Z]+")) {
    		 result.rejectValue("userName", "Matches", "Must contain letters only");
		}
    	// Return null if result has errors
    	if (result.hasErrors()) {
    		return null;
    	}
    	else {
    		// Hash and set password, save user to database
        	String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
        	newUser.setPassword(hashed);
        	userRepo.save(newUser);
            return newUser;
    	} 
    }
    public User login(LoginUser newLogin, BindingResult result) {

    	// Find user in the DB by email
    	Optional<User> potentialUser = userRepo.findByEmail(newLogin.getEmail());
    	// Reject if NOT present
    	if (!potentialUser.isPresent()) {
    		result.rejectValue("email", "Matches", "Unknown email");
    		return null;
    	}
    	
    	User user = potentialUser.get();
    	// Reject if BCrypt password match fails
    	if(!BCrypt.checkpw(newLogin.getPassword(), user.getPassword())) {
    	    result.rejectValue("password", "Matches", "Invalid Password!");
    	}
    	// Return null if result has errors
    	if (result.hasErrors()) {
    		return null;
    	}
    	else {
			return user;
		}
    }
    
    
}

