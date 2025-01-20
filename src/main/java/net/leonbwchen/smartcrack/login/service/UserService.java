package net.leonbwchen.smartcrack.login.service;

import net.leonbwchen.smartcrack.login.entity.User;

/**
 * @author Seven
 */
public interface UserService {
    /**
     * 创建用户
     * @param user
     */
    public void createUser(User user);

    /**
     * 用户登录
     *
     * @param origin
     * @return
     */
    public boolean userLogin(User origin);
}
