package com.ssafy.flody.service.boards;

import com.ssafy.flody.dto.request.Boards.BoardCreateRequestDto;

public interface BoardsService {
    boolean addBoard(BoardCreateRequestDto boardCreateRequestDto);
}
