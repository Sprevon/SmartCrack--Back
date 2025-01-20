package net.leonbwchen.smartcrack.login.service.impl;

import net.leonbwchen.smartcrack.login.dao.UserMapper;
import net.leonbwchen.smartcrack.login.entity.User;
import net.leonbwchen.smartcrack.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author Seven
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 创建用户
     *
     * @param user
     */
    @Override
    public void createUser(User user) {
        userMapper.createUser(user);
    }

    /**
     * 用户登录
     *
     * @param origin
     * @return
     */
    @Override
    public boolean userLogin(User origin) {
        String username = origin.getUsername();
        if (noUsername(username)) {
            return false;
        }
        User stand = userMapper.selectUser(username);
        return Objects.equals(origin.getPassword(), stand.getPassword());
    }

    private boolean noUsername(String username){
        int count = userMapper.countUsername(username);
        return count == 0;
    }
}
