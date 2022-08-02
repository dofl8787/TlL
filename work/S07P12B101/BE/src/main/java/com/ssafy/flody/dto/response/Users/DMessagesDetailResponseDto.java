package com.ssafy.flody.dto.response.Users;

import com.ssafy.flody.domain.dmessages.DMessages;
import lombok.Getter;

import java.util.Date;

@Getter
public class DMessagesDetailResponseDto {
    private Long dmNo;
    private Long sender;
    private Long receiver;
    private Boolean type;
    private String content;
    private Date time;
    private Boolean like;
    private Boolean check;

    public DMessagesDetailResponseDto(DMessages entity){
        this.dmNo = entity.getDmNo();
        this.sender = entity.getSender();
        this.receiver = entity.getReceiver();
        this.type = entity.getType();
        this.content = entity.getContent();
        this.time = entity.getTime();
        this.like = entity.getLike();
        this.check = entity.getCheck();
    }
}
