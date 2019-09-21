package com.hyeon.makingtripback.service;

import com.hyeon.makingtripback.model.User;
import com.hyeon.makingtripback.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User getUserById(Long id) {
    return userRepository.findById(id).orElse(new User());
  }
}
