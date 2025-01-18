package com.algorithmcat.billingsoftware.billingsoftware.Service;

import com.algorithmcat.billingsoftware.billingsoftware.Model.User;
import com.algorithmcat.billingsoftware.billingsoftware.dto.RequestDto;

import java.util.List;

public interface UserService {
    void saveUser(RequestDto requestDto);

    List<User> findAllUsers();


    User findByUsername(String username);
}
