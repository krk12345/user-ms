package com.edurek.userms.rest;

import com.edurek.userms.model.User;
import com.edurek.userms.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by hamid on 01-Apr-18.
 */
@RestController
public class UserRS {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserRS.class);

    @Autowired
    private UserService userService;

/*    @Autowired
    public UserRS(UserService userService) {
        this.userService = userService;
    }*/

    @GetMapping("/users")
    public List<User> getAllUsers() {
        LOGGER.info("inside getAllUsers");
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public User getSingleUser(@PathVariable Integer id) {
        LOGGER.info("inside getSingleUser, id: {}", id);
        return userService.getSingleUserData(id);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable Integer id) {
        LOGGER.info("inside deleteUser, id: {}", id);
        userService.deleteUser(id);
    }

    @PostMapping("/users")
    public void addUser(@RequestBody User user) {
        LOGGER.info("inside addUser, user: {}", user);
        userService.addUser(user);
    }

    @PutMapping("/users/{id}")
    public void modifyUser(@PathVariable Integer id, @RequestBody User user) {
        LOGGER.info("inside modifyUser, user: {}", user);
        userService.modifyUser(id, user);
    }

}
