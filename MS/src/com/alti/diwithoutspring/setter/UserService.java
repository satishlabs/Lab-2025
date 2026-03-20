package com.alti.diwithoutspring.setter;


public class UserService {
    private UserRepository userRepository;

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void process(){
       userRepository.save();
    }
}
