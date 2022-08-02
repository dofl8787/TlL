package com.ssafy.flody.service.users;

import com.ssafy.flody.dto.request.Users.UserCreateRequestDto;
import com.ssafy.flody.dto.response.Users.UserInfoResponseDto;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public interface UsersService {
    public List<UserInfoResponseDto> findUsers();

    public Long addUser(UserCreateRequestDto requestDto);

    UserDetails loadUserByUserid(String id) throws UsernameNotFoundException;
}
