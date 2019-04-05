package com.example.tcm.util;

public interface ErrorConstants {
    ErrorCodeTO PARAM_ERROR = new ErrorCodeTO(0001, "参数异常");
    ErrorCodeTO USER_UNEXISTS = new ErrorCodeTO(0002, "店家不存在");
}
