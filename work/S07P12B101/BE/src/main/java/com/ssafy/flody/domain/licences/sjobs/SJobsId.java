package com.ssafy.flody.domain.licences.sjobs;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class SJobsId implements Serializable {
    private Long serNo;
    private Long depNo;
}
