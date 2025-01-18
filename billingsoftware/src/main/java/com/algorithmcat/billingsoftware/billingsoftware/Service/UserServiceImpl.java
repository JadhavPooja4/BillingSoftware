package com.algorithmcat.billingsoftware.billingsoftware.Service;

import com.algorithmcat.billingsoftware.billingsoftware.Model.User;
import com.algorithmcat.billingsoftware.billingsoftware.Repository.UserRepository;
import com.algorithmcat.billingsoftware.billingsoftware.dto.RequestDto;
import com.algorithmcat.billingsoftware.billingsoftware.dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public void saveUser(RequestDto requestDto) {

        Map<String, ?> requestAttributes = requestDto.getRequest();

        String userName = (String) requestAttributes.get("username");
        String password = (String) requestAttributes.get("password");
        String role = (String) requestAttributes.get("role");

        User user = new User();
        user.setUsername(userName);
        user.setPassword(password);
        user.setRole(role);

        User saveUser = userRepository.save(user);

        ResponseDto responseDTO = new ResponseDto();
        Map <String,User> map = new HashMap<>();
        map.put("User",saveUser);
        responseDTO.setResponse(map);

    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }


}
