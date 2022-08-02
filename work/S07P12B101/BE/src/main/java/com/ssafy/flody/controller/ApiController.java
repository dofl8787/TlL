package com.ssafy.flody.controller;

import com.ssafy.flody.config.JwtTokenProvider;
import com.ssafy.flody.domain.users.Users;
import com.ssafy.flody.domain.users.UsersRepository;
import com.ssafy.flody.dto.request.Boards.BoardCreateRequestDto;
import com.ssafy.flody.dto.request.Boards.CommentCreateRequestDto;
import com.ssafy.flody.dto.request.Boards.CommentUpdateRequestDto;
import com.ssafy.flody.dto.request.Groups.*;
import com.ssafy.flody.dto.request.Users.*;
import com.ssafy.flody.service.users.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.crypto.password.PasswordEncoder;


import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class ApiController {
    private static final String SUCCESS = "SUCCESS";
    private static final String FAIL = "FAIL";
    private static final String ERROR = "ERROR";

    private final UsersService usersService;
    private final UsersRepository usersRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtTokenProvider jwtTokenProvider;

    // TEST
    @GetMapping("/test")
    public ResponseEntity<String> testController(@RequestParam String option) {
        return getStringResponseEntity(option);
    }

    // USER
    @GetMapping("/users")
    public ResponseEntity<Map<String, Object>> UserList() {
        Map<String, Object> result = new HashMap<>();
        HttpStatus status;

        try {
            if (!usersService.findUsers().isEmpty()) {
                result.put("users", usersService.findUsers());
                result.put("msg", SUCCESS);
            } else {
                result.put("msg", FAIL);
            }
            status = HttpStatus.ACCEPTED;
        } catch (Exception e) {
            result.put("msg", ERROR);
            status = HttpStatus.INTERNAL_SERVER_ERROR;
        }

        return new ResponseEntity<>(result, status);
    }

    @GetMapping("/user")
    public ResponseEntity<Map<String, Object>> UserDetails(@RequestParam Long id) {
        return getMapResponseEntity(id);
    }

/*
    @PostMapping("/user")
    public ResponseEntity<String> UserAdd(@RequestBody UserCreateRequestDto requestDto) {
        String result;
        HttpStatus status;

        try {
            if (usersService.addUser(requestDto) != 0L) {
                result = SUCCESS;
            } else {
                result = FAIL;
            }
            status = HttpStatus.ACCEPTED;
        } catch (Exception e) {
            result = e.getMessage();
            status = HttpStatus.INTERNAL_SERVER_ERROR;
        }

        return new ResponseEntity<>(result, status);
    }
*/
    @PostMapping("/user")
    public ResponseEntity<String> UserAdd(@RequestBody UserCreateRequestDto requestDto) {
        String result;
        HttpStatus status;
        try {
            if (usersService.addUser(requestDto) != 0L) {
                result = SUCCESS;
            } else {
                result = FAIL;
            }
            status = HttpStatus.ACCEPTED;
        } catch (Exception e) {
            result = e.getMessage();
            status = HttpStatus.INTERNAL_SERVER_ERROR;
        }

        return new ResponseEntity<>(result, status);
    }
/*    @PostMapping("/user")
    public Users UserAdd(@RequestBody UserCreateRequestDto requestDto) {
        return usersRepository.save(Users.builder()
                .id(requestDto.getId())
                .name(requestDto.getName())
                .password(passwordEncoder.encode(requestDto.getPassword()))
                .admin(requestDto.getAdmin())
                .phone(requestDto.getPhone())
                .address(requestDto.getAddress())
                .nickname(requestDto.getNickname())
                .profile(requestDto.getProfile())
                .build());
    }*/

    @PutMapping("/user")
    public ResponseEntity<String> UserModify(@RequestBody UserUpdateRequestDto requestDto) {
        return getStringResponseEntity(requestDto);
    }

    @DeleteMapping("/user")
    public ResponseEntity<String> UserRemove(@RequestParam Long id) {
        // header에서 token을 추출해 id값을 지정하는 방식으로 변경 예정
        return getStringResponseEntity(id);
    }

    //로그인
    @PostMapping("/user/login")
    //public ResponseEntity<String> UserLogin(@RequestBody UserLoginRequestDto requestDto) {
    public String UserLogin(@RequestBody UserLoginRequestDto requestDto) {
        Users member = usersRepository.findById(requestDto.getId())
                .orElseThrow(() -> new IllegalArgumentException("가입되지 않은 ID 입니다."));
        if (!passwordEncoder.matches(requestDto.getPassword(), member.getPassword())){
            throw new IllegalArgumentException("잘못된 비밀번호입니다.");
        }
        return jwtTokenProvider.createToken(member.getId());
        //return getStringResponseEntity(requestDto);
    }

    @GetMapping("/user/follows")
    public ResponseEntity<Map<String, Object>> UserFollowList(@RequestParam Long id) {
        // header에서 token을 추출해 id값을 지정하는 방식으로 변경 예정
        return getMapResponseEntity(id);
    }

    @GetMapping("/user/follow")
    public ResponseEntity<String> UserFollow(@RequestParam Long id) {
        return getStringResponseEntity(id);
    }

    @GetMapping("/user/likes")
    public ResponseEntity<Map<String, Object>> UserLikeList(@RequestParam Long id) {
        // header에서 token을 추출해 id값을 지정하는 방식으로 변경 예정
        return getMapResponseEntity(id);
    }

    @GetMapping("/user/scraps")
    public ResponseEntity<Map<String, Object>> UserScrapList(@RequestParam Long id) {
        // header에서 token을 추출해 id값을 지정하는 방식으로 변경 예정
        return getMapResponseEntity(id);
    }

    @GetMapping("/user/schedules")
    public ResponseEntity<Map<String, Object>> UserScheduleList(@RequestParam Long id) {
        // header에서 token을 추출해 id값을 지정하는 방식으로 변경 예정
        return getMapResponseEntity(id);
    }

    @GetMapping("/user/schedule")
    public ResponseEntity<Map<String, Object>> UserScheduleDetails(@RequestParam Long id) {
        return getMapResponseEntity(id);
    }

    @PostMapping("/user/schedule")
    public ResponseEntity<String> UserScheduleAdd(@RequestBody UserScheduleCreateRequestDto requestDto) {
        return getStringResponseEntity(requestDto);
    }

    @PutMapping("/user/schedule")
    public ResponseEntity<String> UserScheduleModify(@RequestBody UserScheduleUpdateRequestDto requestDto) {
        return getStringResponseEntity(requestDto);
    }

    @DeleteMapping("/user/schedule")
    public ResponseEntity<String> UserScheduleRemove(@RequestParam Long id) {
        return getStringResponseEntity(id);
    }

    @GetMapping("/user/goals")
    public ResponseEntity<Map<String, Object>> UserGoalList(@RequestParam Long id) {
        // header에서 token을 추출해 id값을 지정하는 방식으로 변경 예정
        return getMapResponseEntity(id);
    }

    @GetMapping("/user/goal")
    public ResponseEntity<Map<String, Object>> UserGoalDetails(@RequestParam Long id) {
        return getMapResponseEntity(id);
    }

    @PostMapping("/user/goal")
    public ResponseEntity<String> UserGoalAdd(@RequestBody UserGoalCreateRequestDto requestDto) {
        return getStringResponseEntity(requestDto);
    }

    @PutMapping("/user/goal")
    public ResponseEntity<String> UserGoalModify(@RequestBody UserGoalUpateRequestDto requestDto) {
        return getStringResponseEntity(requestDto);
    }

    @DeleteMapping("/user/goal")
    public ResponseEntity<String> UserGoalRemove(@RequestParam Long id) {
        return getStringResponseEntity(id);
    }

    // GROUP
    @GetMapping("/groups")
    public ResponseEntity<Map<String, Object>> GroupList(@RequestParam(defaultValue = "default") String keyword) {
        return getMapResponseEntity(keyword);
    }

    @GetMapping("/group")
    public ResponseEntity<Map<String, Object>> GroupDetails(@RequestParam Long id) {
        return getMapResponseEntity(id);
    }

    @PostMapping("/group")
    public ResponseEntity<String> GroupAdd(@RequestBody GroupCreateRequestDto requestDto) {
        return getStringResponseEntity(requestDto);
    }

    @PutMapping("/group")
    public ResponseEntity<String> GroupModify(@RequestBody GroupUpdateRequestDto requestDto) {
        return getStringResponseEntity(requestDto);
    }

    @DeleteMapping("/group")
    public ResponseEntity<String> GroupRemove(@RequestParam Long id) {
        // header에서 token을 추출해 id값을 지정하는 방식으로 변경 예정
        return getStringResponseEntity(id);
    }

    @GetMapping("/group/schedules")
    public ResponseEntity<Map<String, Object>> GroupScheduleList(@RequestParam Long id) {
        // header에서 token을 추출해 id값을 지정하는 방식으로 변경 예정
        return getMapResponseEntity(id);
    }

    @GetMapping("/group/schedule")
    public ResponseEntity<Map<String, Object>> GroupScheduleDetails(@RequestParam Long id) {
        return getMapResponseEntity(id);
    }

    @PostMapping("/group/schedule")
    public ResponseEntity<String> GroupScheduleAdd(@RequestBody GroupScheduleCreateRequestDto requestDto) {
        return getStringResponseEntity(requestDto);
    }

    @PutMapping("/group/schedule")
    public ResponseEntity<String> GroupScheduleModify(@RequestBody GroupScheduleUpdateRequestDto requestDto) {
        return getStringResponseEntity(requestDto);
    }

    @DeleteMapping("/group/schedule")
    public ResponseEntity<String> GroupScheduleRemove(@RequestParam Long id) {
        return getStringResponseEntity(id);
    }

    @GetMapping("/group/goals")
    public ResponseEntity<Map<String, Object>> GroupGoalList(@RequestParam Long id) {
        // header에서 token을 추출해 id값을 지정하는 방식으로 변경 예정
        return getMapResponseEntity(id);
    }

    @GetMapping("/group/goal")
    public ResponseEntity<Map<String, Object>> GroupGoalDetails(@RequestParam Long id) {
        return getMapResponseEntity(id);
    }

    @PostMapping("/group/goal")
    public ResponseEntity<String> GroupGoalAdd(@RequestBody GroupGoalCreateRequestDto requestDto) {
        return getStringResponseEntity(requestDto);
    }

//    GroupGoalUpdateRequestDto 추가 필요
//    @PutMapping("/group/goal")
//    public ResponseEntity<String> GroupGoalModify(@RequestBody GroupGoalUpateRequestDto requestDto) {
//        return getStringResponseEntity(requestDto);
//    }

    @DeleteMapping("/group/goal")
    public ResponseEntity<String> GroupGoalRemove(@RequestParam Long id) {
        return getStringResponseEntity(id);
    }

    // Board
    @GetMapping("/boards")
    public ResponseEntity<Map<String, Object>> BoardList(@RequestParam String category) {
        // 개인 피드는 여기에 RequestParam 걸어서 option처럼 주는게 어떨까 싶습니다.
        // 추가로 정렬도 RequestParam으로 주면 좋을 것 같습니다.
        return getMapResponseEntity(category);
    }

    @GetMapping("/board")
    public ResponseEntity<Map<String, Object>> BoardDetails(@RequestParam Long id) {
        return getMapResponseEntity(id);
    }

    @PostMapping("/board")
    public ResponseEntity<String> BoardAdd(@RequestBody BoardCreateRequestDto requestDto) {
        return getStringResponseEntity(requestDto);
    }

    @PutMapping("/board")
    public ResponseEntity<String> BoardModify(@RequestBody BoardCreateRequestDto requestDto) {
        return getStringResponseEntity(requestDto);
    }

    @DeleteMapping("/board")
    public ResponseEntity<String> BoardRemove(@RequestParam Long id) {
        return getStringResponseEntity(id);
    }

    @GetMapping("/board/like")
    public ResponseEntity<String> BoardLike(@RequestParam Long id) {
        return getStringResponseEntity(id);
    }

    @GetMapping("/board/scrap")
    public ResponseEntity<String> BoardScrap(@RequestParam Long id) {
        return getStringResponseEntity(id);
    }

    @GetMapping("/board/report")
    public ResponseEntity<String> BoardReport(@RequestParam Long id) {
        return getStringResponseEntity(id);
    }

    @GetMapping("/comments")
    public ResponseEntity<Map<String, Object>> CommentList(@RequestParam Long id) {
        return getMapResponseEntity(id);
    }

    // COMMENT
    @GetMapping("/comment")
    public ResponseEntity<Map<String, Object>> CommentDetails(@RequestParam Long id) {
        return getMapResponseEntity(id);
    }

    @PostMapping("/comment")
    public ResponseEntity<String> CommentAdd(@RequestBody CommentCreateRequestDto requestDto) {
        return getStringResponseEntity(requestDto);
    }

    @PutMapping("/comment")
    public ResponseEntity<String> CommentModify(@RequestBody CommentUpdateRequestDto requestDto) {
        return getStringResponseEntity(requestDto);
    }

    @DeleteMapping("/comment")
    public ResponseEntity<String> CommentRemove(@RequestParam Long id) {
        return getStringResponseEntity(id);
    }

    @GetMapping("/comment/like")
    public ResponseEntity<String> CommentLike(@RequestParam Long id) {
        return getStringResponseEntity(id);
    }

    // DIRECT MESSAGE
    @GetMapping("/direct-messages")
    public ResponseEntity<Map<String, Object>> DMessageList(@RequestParam Long id) {
        // header에서 token을 추출해 id값을 지정하는 방식으로 변경 예정
        return getMapResponseEntity(id);
    }

    @GetMapping("/direct-message")
    public ResponseEntity<Map<String, Object>> DMessageDetails(@RequestParam Long id) {
        return getMapResponseEntity(id);
    }

//    DMessage 관련 Dto 추가 생성 필요
//    @PostMapping("/direct-message")
//    public ResponseEntity<String> DMessageAdd(@RequestBody DMessageCreateRequestDto requestDto) {
//        return getStringResponseEntity(requestDto);
//    }

//    @PutMapping("/direct-message")
//    public ResponseEntity<String> DMessageModify(@RequestBody DMessageUpdateRequestDto requestDto) {
//        return getStringResponseEntity(requestDto);
//    }

    @DeleteMapping("/direct-message")
    public ResponseEntity<String> DMessageRemove(@RequestParam Long id) {
        return getStringResponseEntity(id);
    }

    // FLOWER
    @GetMapping("/flowers")
    public ResponseEntity<Map<String, Object>> FlowerList(@RequestParam Long id) {
        // header에서 token을 추출해 id값을 지정하는 방식으로 변경 예정
        return getMapResponseEntity(id);
    }

    @GetMapping("/flower")
    public ResponseEntity<Map<String, Object>> FlowerDetails(@RequestParam Long id) {
        return getMapResponseEntity(id);
    }

//    Flower 관련 Dto 추가 생성 필요
//    @PostMapping("/flower")
//    public ResponseEntity<String> FlowerAdd(@RequestBody FlowerCreateRequestDto requestDto) {
//        return getStringResponseEntity(requestDto);
//    }

//    @PutMapping("/flower")
//    public ResponseEntity<String> FlowerModify(@RequestBody FlowerUpdateRequestDto requestDto) {
//        return getStringResponseEntity(requestDto);
//    }

    @DeleteMapping("/flower")
    public ResponseEntity<String> FlowerRemove(@RequestParam Long id) {
        return getStringResponseEntity(id);
    }

    // LICENSE
    @GetMapping("/licenses")
    public ResponseEntity<Map<String, Object>> LicenseList(@RequestParam Long id) {
        // header에서 token을 추출해 id값을 지정하는 방식으로 변경 예정
        // 여기에 filter 처리를 위한 parameter도 추가 예정
        return getMapResponseEntity(id);
    }

    @GetMapping("/license")
    public ResponseEntity<Map<String, Object>> LicenseDetails(@RequestParam Long id) {
        return getMapResponseEntity(id);
    }

//    License 관련 Dto 추가 생성 필요
//    @PostMapping("/license")
//    public ResponseEntity<String> LicenseAdd(@RequestBody LicenseCreateRequestDto requestDto) {
//        return getStringResponseEntity(requestDto);
//    }

//    @PutMapping("/license")
//    public ResponseEntity<String> LicenseModify(@RequestBody LicenseUpdateRequestDto requestDto) {
//        return getStringResponseEntity(requestDto);
//    }

    @DeleteMapping("/license")
    public ResponseEntity<String> LicenseRemove(@RequestParam Long id) {
        return getStringResponseEntity(id);
    }


    // COMMON METHODS
    public ResponseEntity<Map<String, Object>> getMapResponseEntity(Object obj) {
        Map<String, Object> result = new HashMap<>();
        HttpStatus status;

        try {
            if ("test".equals(obj) || obj.equals(1L)) {
                result.put("item", obj);
                result.put("msg", SUCCESS);
            } else {
                result.put("item", obj);
                result.put("msg", FAIL);
            }
            status = HttpStatus.ACCEPTED;
        } catch (Exception e) {
            result.put("item", obj);
            result.put("msg", ERROR);
            status = HttpStatus.INTERNAL_SERVER_ERROR;
        }

        return new ResponseEntity<>(result, status);
    }

    public ResponseEntity<String> getStringResponseEntity(Object obj) {
        String result;
        HttpStatus status;

        try {
            result = obj.toString();
            if ("test".equals(obj) || obj.equals(1L)) {
//                result = SUCCESS;
            } else {
//                result = FAIL;
            }
            status = HttpStatus.ACCEPTED;
        } catch (Exception e) {
            result = ERROR;
            status = HttpStatus.INTERNAL_SERVER_ERROR;
        }

        return new ResponseEntity<>(result, status);
    }
}
