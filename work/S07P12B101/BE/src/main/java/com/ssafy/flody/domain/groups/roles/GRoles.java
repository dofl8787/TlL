package com.ssafy.flody.domain.groups.roles;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "g_roles")
public class GRoles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long grNo;

    @NotNull
    private String name;
}
