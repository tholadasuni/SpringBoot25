package net.java.springboot.service;

import java.util.List;

import net.java.springboot.dto.UserDto;
import net.java.springboot.entity.User;

public interface UserService {
    UserDto createUser(UserDto user);

    UserDto getUserById(Long userId);

    List<UserDto> getAllUsers();

    UserDto updateUser(UserDto user);

    void deleteUser(Long userId);
}
