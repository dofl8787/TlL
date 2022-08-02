package com.ssafy.flody.domain.flowers.gardens;

import com.ssafy.flody.domain.flowers.Flowers;
import com.ssafy.flody.domain.users.Users;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Gardens {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long garNo;

    @NotNull
    @ManyToOne(targetEntity = Flowers.class)
    @JoinColumn(name = "flo_no")
    private Long floNo;

    @NotNull
    @ManyToOne(targetEntity = Users.class)
    @JoinColumn(name = "use_no")
    private Long useNo;

    @NotNull
    private Date startDate;

    private Date endDate;

    @NotNull
    private int exp;
}
