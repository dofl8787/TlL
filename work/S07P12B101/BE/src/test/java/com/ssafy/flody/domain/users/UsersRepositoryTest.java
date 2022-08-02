package com.ssafy.flody.domain.users;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@WebAppConfiguration
@RunWith(SpringRunner.class)
@SpringBootTest
public class UsersRepositoryTest {

    @Autowired
    UsersRepository usersRepository;

    @After
    public void cleanup() {
        usersRepository.deleteAll();
    }

    @Test
    public void test_user() {
        String id = "ssafy";
        String password = "pass";

        usersRepository.save(Users.builder()
                .id(id)
                .password(password)
                .profile("none")
                .name("ssafy")
                .nickname("ssafy7th")
                .address("daejeon")
                .phone("01012345678")
                .admin(false)
                .build()
        );

        List<Users> usersList = usersRepository.findAll();

        Users users = usersList.get(0);
        assertThat(users.getId()).isEqualTo(id);
        assertThat(users.getPassword()).isEqualTo(password);
    }
}
