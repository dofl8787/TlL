package com.ssafy.flody.domain.boards.scraps;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ScrapsId implements Serializable {
    private Long useNo;
    private Long boaNo;
}
