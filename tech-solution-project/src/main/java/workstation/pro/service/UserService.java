package workstation.pro.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import workstation.pro.model.User;
import workstation.pro.web.dto.UserRegistrationDto;

public interface UserService  extends UserDetailsService{
	
	User save(UserRegistrationDto registrationDto);

}
