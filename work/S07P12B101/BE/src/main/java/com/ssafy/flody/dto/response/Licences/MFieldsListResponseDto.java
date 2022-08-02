package com.ssafy.flody.dto.response.Licences;

import com.ssafy.flody.domain.licences.mfields.MFields;
import lombok.Getter;

@Getter
public class MFieldsListResponseDto {
    private Long mfNo;
    private String mobligfldnm;
    private Integer moblilgfldcd;

    public MFieldsListResponseDto(MFields entity){
        this.mfNo = entity.getMfNo();
        this.mobligfldnm = entity.getMobligfldnm();
        this.moblilgfldcd = entity.getMobligfldcd();
    }
}
