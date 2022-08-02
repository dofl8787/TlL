package com.ssafy.flody.dto.response.Licences;

import com.ssafy.flody.domain.licences.fields.Fields;
import lombok.Getter;

@Getter
public class FieldListResponseDto {
    private Long fieNo;
    private String obligfldnm;
    private Integer oblilgfldcd;

    public FieldListResponseDto(Fields entity){
        this.fieNo = entity.getFieNo();
        this.obligfldnm = entity.getObligfldnm();
        this.oblilgfldcd = entity.getObligfldcd();
    }
}
