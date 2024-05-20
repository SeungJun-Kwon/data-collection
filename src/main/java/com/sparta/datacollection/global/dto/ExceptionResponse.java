package com.sparta.datacollection.global.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ExceptionResponse {

    String msg;
    int httpCode;
}
