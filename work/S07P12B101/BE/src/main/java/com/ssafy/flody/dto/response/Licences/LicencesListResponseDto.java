package com.ssafy.flody.dto.response.Licences;

import com.ssafy.flody.domain.licences.Licences;
import lombok.Getter;

@Getter
public class LicencesListResponseDto {
    private Long licNo;
    private Long fieNo;
    private Long mfNo;
    private Long serNo;
    private String jmfldnm;
    private Integer jmcd;
    private String qualgbcd;

    public LicencesListResponseDto(Licences entity){
        this.licNo = entity.getLicNo();
        this.fieNo = entity.getFieNo();
        this.mfNo = entity.getMfNo();
        this.serNo = entity.getSerNo();
        this.jmfldnm = entity.getJmfldnm();
        this.jmcd = entity.getJmcd();
        this.qualgbcd = entity.getQualgbcd();
    }
}
