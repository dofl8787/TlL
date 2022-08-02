package com.ssafy.flody.domain.users;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long useNo;

    @Column(unique = true, nullable = false)
    private String id;

    @NotNull
    private String password;

    @NotNull
    private String profile;

    @NotNull
    private String name;

    @NotNull
    private String nickname;

    private String address;

    @NotNull
    private String phone;

    private Boolean admin;
}
