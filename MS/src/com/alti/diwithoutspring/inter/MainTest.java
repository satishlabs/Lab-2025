package com.alti.diwithoutspring.inter;

public class MainTest {
    static void main(String[] args) {
        UserRepository userRepository = new MySQLRepository();
        UserService userService = new UserService(userRepository);

        userService.process();
    }
}
