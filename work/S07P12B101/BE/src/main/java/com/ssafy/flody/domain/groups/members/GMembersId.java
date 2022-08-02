package com.ssafy.flody.domain.groups.members;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class GMembersId implements Serializable {
    private Long useNo;
    private Long groNo;
    private Long grNo;
}
