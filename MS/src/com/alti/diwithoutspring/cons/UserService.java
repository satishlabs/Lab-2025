package com.alti.diwithoutspring.cons;

public class UserService {
    private final UserRepository userRepository;

    // Dependency injected via constructor
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void process(){
        userRepository.save();
    }

}
