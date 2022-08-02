package com.ssafy.flody.domain.boards.pictures;

import com.ssafy.flody.domain.boards.Boards;
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
public class Pictures {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long picNo;

    @NotNull
    @ManyToOne(targetEntity = Boards.class)
    @JoinColumn(name = "boa_no")
    private Long boaNo;

    @NotNull
    private String order;

    @NotNull
    private String url;
}
