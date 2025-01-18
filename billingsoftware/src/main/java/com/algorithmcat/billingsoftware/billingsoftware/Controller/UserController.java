package com.algorithmcat.billingsoftware.billingsoftware.Controller;

import com.algorithmcat.billingsoftware.billingsoftware.Model.User;
import com.algorithmcat.billingsoftware.billingsoftware.Service.UserService;
import com.algorithmcat.billingsoftware.billingsoftware.dto.RequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/createuser")
    public ResponseEntity<String> createUser(@RequestBody RequestDto requestDto){
        userService.saveUser(requestDto);
        return ResponseEntity.ok("User Created Successfully....!");
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.findAllUsers();
    }

    @GetMapping("/username/{username}")
    public User getUserByUsername(@PathVariable String username) {
        return userService.findByUsername(username);
    }

}
