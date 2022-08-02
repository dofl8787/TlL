package com.ssafy.flody.domain.licences.mfields;

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
@Table(name = "m_fields")
public class MFields {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mfNo;

    @NotNull
    private String mobligfldnm;

    @NotNull
    private int mobligfldcd;
}
