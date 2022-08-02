package com.ssafy.flody.domain.groups.members;

import com.ssafy.flody.domain.groups.Groups;
import com.ssafy.flody.domain.groups.roles.GRoles;
import com.ssafy.flody.domain.users.Users;
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
@Table(name = "g_members")
@IdClass(GMembersId.class)
public class GMembers {
    @Id
    @NotNull
    @ManyToOne(targetEntity = Users.class)
    @JoinColumn(name = "use_no")
    private Long useNo;

    @Id
    @NotNull
    @ManyToOne(targetEntity = Groups.class)
    @JoinColumn(name = "gro_no")
    private Long groNo;

    @Id
    @NotNull
    @ManyToOne(targetEntity = GRoles.class)
    @JoinColumn(name = "gr_no")
    private Long grNo;
}
