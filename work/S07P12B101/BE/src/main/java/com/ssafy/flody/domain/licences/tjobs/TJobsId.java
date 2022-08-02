package com.ssafy.flody.domain.licences.tjobs;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class TJobsId implements Serializable {
    private Long fieNo;
    private Long mfNo;
    private Long depNo;
}
