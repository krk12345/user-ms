package com.edurek.userms.dao;

import com.edurek.userms.model.User;

import java.util.List;

/**
 * Created by hamid on 01-Apr-18.
 */
public interface UserDao {

    List<User> getAllUsers();
    User getSingleUserData(Integer id);
    void addUser(User user);
    void modifyUser(Integer id, User user);
    void deleteUser(Integer id);
}
