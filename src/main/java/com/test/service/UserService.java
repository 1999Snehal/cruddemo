package com.test.service;


import com.test.model.User;
import com.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    public boolean existsById;
    @Autowired
     UserRepository userRepository;

    public User createUser(User user){

        return userRepository.save(user);
    }

    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id)
    {
        return userRepository.findById(id);
    }

    public void deleteUser(Long id){
        userRepository.deleteAll();
    }

    public void deleteAllUsers() {
    }

    public User saveUser(User user) {
        return null;
    }

    public void deleteById(Long id) {
    }

    public boolean existsById(Long id) {
        return true;
    }
}
