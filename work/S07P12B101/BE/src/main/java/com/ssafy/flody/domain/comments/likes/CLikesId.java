package com.ssafy.flody.domain.comments.likes;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class CLikesId implements Serializable {
    private Long comNo;
    private Long useNo;
}
