package com.ssafy.flody.domain.dmessages.likes;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class DLikesId implements Serializable {
    private Long dmNo;
    private Long useNo;
}
