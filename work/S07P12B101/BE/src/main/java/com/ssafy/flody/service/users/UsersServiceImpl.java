package com.ssafy.flody.service.users;

import com.ssafy.flody.domain.users.Users;
import com.ssafy.flody.domain.users.UsersRepository;
import com.ssafy.flody.dto.request.Users.UserCreateRequestDto;
import com.ssafy.flody.dto.response.Users.UserInfoResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UsersServiceImpl implements UsersService{
    private final UsersRepository usersRepository;

    private PasswordEncoder passwordEncoder;
    @Override
    public List<UserInfoResponseDto> findUsers() {
        List<Users> entityList = usersRepository.findAll();
        List<UserInfoResponseDto> list = new ArrayList<>();
        for (Users user: entityList) {
            list.add(new UserInfoResponseDto(user));
        }
        return list;
    }

    @Override
    @Transactional()
    public Long addUser(UserCreateRequestDto requestDto) {
        String encodePw = passwordEncoder.encode(requestDto.getPassword());
        requestDto.setPassword(encodePw);
        return usersRepository.save(requestDto.toEntity()).getUseNo();
    }

    @Override
    public UserDetails loadUserByUserid(String id) throws UsernameNotFoundException {
        return (UserDetails) usersRepository.findById(id)
                .orElseThrow(() -> new UsernameNotFoundException("사용자를 찾을 수 없습니다."));
    }
}
