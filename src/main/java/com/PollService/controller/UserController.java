package com.PollService.controller;
import com.PollService.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping(value = "/exist/{userId}")
    public Boolean checkUserExist(@PathVariable Integer userId) {
        return userService.checkUserConfirmed(userId);
    }
    @GetMapping(value = "/registration/{userId}")
    public Boolean readUserRegistration(@PathVariable Integer userId) {
        return userService.checkUserRegistration(userId);
    }
}
