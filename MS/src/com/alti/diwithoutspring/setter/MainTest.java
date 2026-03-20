package com.alti.diwithoutspring.setter;



public class MainTest {
    static void main(String[] args) {

        UserService userService = new UserService();
        userService.setUserRepository(new UserRepository());
        userService.process();
    }
}
