package com.alti.diwithoutspring.cons;

public class MainTest {
    static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);

        userService.process();;
    }
}
