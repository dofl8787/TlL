package com.ssafy.flody.domain.licences.fields;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Fields {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fieNo;

    @NotNull
    private String obligfldnm;

    @NotNull
    private int obligfldcd;
}
