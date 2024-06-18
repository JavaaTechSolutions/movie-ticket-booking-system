package com.jts.movie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jts.movie.convertor.UserConvertor;
import com.jts.movie.entities.User;
import com.jts.movie.exceptions.UserExist;
import com.jts.movie.repositories.UserRepository;
import com.jts.movie.request.UserRequest;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public String addUser(UserRequest userRequest) {
		if (userRepository.findByEmailId(userRequest.getEmailId()) != null) {
			throw new UserExist();
		}

		User user = UserConvertor.userDtoToUser(userRequest);

		userRepository.save(user);
		return "User Saved Successfully";
	}

}
