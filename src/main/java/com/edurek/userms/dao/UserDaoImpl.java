package com.edurek.userms.dao;

import com.edurek.userms.model.User;
import com.edurek.userms.service.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by hamid on 01-Apr-18.
 */
@Repository
public class UserDaoImpl implements UserDao {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserDaoImpl.class);
    private Map<Integer, User> map = new HashMap<>();
    private static AtomicInteger idCount = new AtomicInteger(10);

    public UserDaoImpl() {
        map.put(1, new User(1, "Karneedi"));
        map.put(2, new User(2, "Prakash"));
        map.put(3, new User(3, "Shoban"));
        map.put(4, new User(4, "Rohit"));
    }

    @Override
    public List<User> getAllUsers() {
        LOGGER.info("inside getAllUsers");
        List<User> userList = new ArrayList<>(map.values());
        return userList;
    }

    @Override
    public User getSingleUserData(Integer id) {
        LOGGER.info("inside getSingleUserData, id: {}", id);
        User user = map.get(id);

        return user;
    }

    @Override
    public void addUser(User user) {
        LOGGER.info("inside addUser");
        map.put(idCount.incrementAndGet(), user);
    }

    @Override
    public void modifyUser(Integer id, User user) {
        LOGGER.info("inside modifyUser");
        map.put(id, user);
    }

    @Override
    public void deleteUser(Integer id) {
        LOGGER.info("inside deleteUser");
        map.remove(id);
    }
}
