package com.ssafy.flody.dto.request.Flowers;

import com.ssafy.flody.domain.flowers.gardens.Gardens;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class GardenCreateRequestDto {
    private Long useNo;
    private Long floNo;
    private Integer exp;

    @Builder
    public GardenCreateRequestDto(Long useNo, Long floNo, Integer exp){
        this.useNo = useNo;
        this.floNo = floNo;
        this.exp = exp;
    }
    // DTO to ENTITY
    public Gardens toEntity(){
        return Gardens.builder()
                .useNo(useNo)
                .floNo(floNo)
                .exp(exp)
                .build();
    }
}
