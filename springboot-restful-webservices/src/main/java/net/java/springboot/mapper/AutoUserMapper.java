package net.java.springboot.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import net.java.springboot.dto.UserDto;
import net.java.springboot.entity.User;

@Mapper
public interface AutoUserMapper {

    AutoUserMapper MAPPER = Mappers.getMapper(AutoUserMapper.class);

    UserDto mapToUserDto(User user);

    User mapToUser(UserDto userDto);
}
