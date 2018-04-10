package com.edurek.userms.service;

import com.edurek.userms.dao.UserDao;
import com.edurek.userms.model.User;
import com.edurek.userms.rest.UserRS;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hamid on 01-Apr-18.
 */
@Service
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAllUsers() {
        LOGGER.info("inside getAllUsers");
        return userDao.getAllUsers();
    }

    @Override
    public User getSingleUserData(Integer id) {
        LOGGER.info("inside getSingleUserData");
        return userDao.getSingleUserData(id);
    }

    @Override
    public void addUser(User user) {
        LOGGER.info("inside addUser");
        userDao.addUser(user);
    }

    @Override
    public void modifyUser(Integer id, User user) {
        LOGGER.info("inside modifyUser");
        userDao.modifyUser(id, user);
    }

    @Override
    public void deleteUser(Integer id) {
        LOGGER.info("inside deleteUser");
        userDao.deleteUser(id);
    }
}
