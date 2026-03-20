package com.alti.diwithoutspring.inter;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void process(){
        userRepository.save();
    }
}
