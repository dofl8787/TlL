package com.ssafy.flody.domain.flowers;

import com.ssafy.flody.domain.flowers.categories.FCategories;
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
public class Flowers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long floNo;

    @NotNull
    @ManyToOne(targetEntity = FCategories.class)
    @JoinColumn(name = "fc_no")
    private Long fcNo;

    @NotNull
    private String name;

    private String content;

    @NotNull
    private String url;
}
