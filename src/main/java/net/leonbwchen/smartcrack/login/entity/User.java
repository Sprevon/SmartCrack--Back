package net.leonbwchen.smartcrack.login.entity;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author Seven
 */
public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = -3669421027076653231L;

    private String userId;
    private String username;
    private String password;
    private String authority;
    private String department;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
