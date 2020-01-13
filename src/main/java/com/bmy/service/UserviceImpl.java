package com.bmy.service;

import com.bmy.bean.User;
import com.bmy.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserviceImpl implements Uservice {
    @Autowired
    UserDao ud;

    @Override
    public void save(User user) {
        ud.save(user);
    }

    @Override
    public void delete(Long id) {
ud.deleteById(id);
    }

    @Override
    public void update(User user) {
ud.saveAndFlush(user);
    }

    @Override
    public List<User> findAll() {
        return ud.findAll();
    }

    @Override
    public User findOne(Long id) {
        Optional<User> user = ud.findById(id);
        if(user.isPresent()){
            return user.get();
        }
return null;
    }
}
