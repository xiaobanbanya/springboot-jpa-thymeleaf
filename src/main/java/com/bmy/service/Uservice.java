package com.bmy.service;

import com.bmy.bean.User;

import java.util.List;

public interface Uservice {
    public void save(User user);
    public void delete(Long id);
    public void update(User user);
    public List<User> findAll();
    public User findOne(Long id);

}
