package net.leonbwchen.smartcrack.login.dao;

import net.leonbwchen.smartcrack.login.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Seven
 */
@Mapper
public interface UserMapper {
    /**
     * 根据ID查询用户
     * @param userId
     * @return
     */
    User selectUser(String userId);

    /**
     * 创建用户
     * @param user
     */
    void createUser(User user);

    /**
     * 统计用户名对于用户数量
     * @param username
     * @return
     */
    int countUsername(String username);
}
