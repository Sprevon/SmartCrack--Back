package net.leonbwchen.smartcrack.login.controller;

import net.leonbwchen.smartcrack.login.entity.User;
import net.leonbwchen.smartcrack.login.service.UserService;
import net.leonbwchen.smartcrack.utils.HTTPResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Seven
 */
@CrossOrigin
@RestController
@RequestMapping("/sc")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "/login")
    @ResponseBody
    public HTTPResult login(@RequestBody User origin){
        boolean correctPass = userService.userLogin(origin);
        String message = correctPass ? "登录成功" : "用户名或密码错误";
        int code = correctPass ? 200 : 500;
        return new HTTPResult(message, code);
    }

    @PostMapping(value = "/test")
    @ResponseBody
    public HTTPResult test(){
        return HTTPResult.buildSuccess();
    }
}
