package com.example.ResponseUtils.response.error;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
@Getter
public enum ErrorResponseStatus {

    BAD_REQUEST_WRONG_TAG_EXCEPTION(HttpStatus.BAD_REQUEST, "잘못된 태그"),
    BAD_REQUEST_MISSING_VALUE(HttpStatus.BAD_REQUEST, "데이터 누락"),
    BAD_REQUEST_MISSING_COURSE_GATHERING_BOTH(HttpStatus.BAD_REQUEST, "코스, 번개방 아이디 둘 중 하나는 필수입니다."),

    UNAUTHORIZED_WRONG_SOCIAL_TYPE(HttpStatus.UNAUTHORIZED, "잘못된 소셜 타입"),
    UNAUTHORIZED_INVALID_SOCIAL_TOKEN(HttpStatus.UNAUTHORIZED, "잘못된 소셜 토큰"),
    FAILED_TO_FIND_AVAILABLE_RSA(HttpStatus.UNAUTHORIZED, "일치하는 공개키 없음"),
    FAILED_TO_APPLE_LOGIN(HttpStatus.UNAUTHORIZED, "잘못된 APPPLE ID"),

    NOT_FOUND_USER_EXCEPTION(HttpStatus.NOT_FOUND, "회원 정보 없음"),
    NOT_FOUND_COURSE_EXCEPTION(HttpStatus.NOT_FOUND, "코스 정보 없음"),
    NOT_FOUND_GATHERING_EXCEPTION(HttpStatus.NOT_FOUND, "번개방 정보 없음"),
    NOT_FOUND_PASSWORD_EXCEPTION(HttpStatus.NOT_FOUND, "비밀번호 불일치"),


    CONFLICT_DUPLICATED_NICKNAME(HttpStatus.CONFLICT, "중복된 닉네임"),
    CONFLICT_CANNOT_PARTICIPATE(HttpStatus.CONFLICT, "이미 참여중이거나 모집이 완료된 번개방"),
    CONFLICT_ALREADY_PARTICIPATED(HttpStatus.CONFLICT, "이미 참여 인증이 완료된 번개방");

    private final HttpStatus code;
    private final String message;
}
