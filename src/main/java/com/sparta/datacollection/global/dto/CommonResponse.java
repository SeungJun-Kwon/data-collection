package com.sparta.datacollection.global.dto;

import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Getter
@Builder
public class CommonResponse<T> {

    String msg;
    T data;

    public static <T> CommonResponse<T> ofResponse(String msg, T data) {
        return CommonResponse.<T>builder()
            .msg(msg)
            .data(data)
            .build();
    }

    public static <T> ResponseEntity<CommonResponse<T>> ofResponseWithHttpStatus(String msg, T data,
        HttpStatus httpStatus) {
        CommonResponse<T> commonResponse = CommonResponse.ofResponse(msg, data);
        return ResponseEntity.status(httpStatus).body(commonResponse);
    }
}
