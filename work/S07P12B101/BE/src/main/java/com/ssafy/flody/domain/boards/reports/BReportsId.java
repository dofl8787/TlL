package com.ssafy.flody.domain.boards.reports;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class BReportsId implements Serializable {
    private Long useNo;
    private Long boaNo;
}
