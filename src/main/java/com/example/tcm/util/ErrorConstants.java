package com.example.tcm.util;

public interface ErrorConstants {
    ErrorCodeTO PARAM_ERROR = new ErrorCodeTO(0001, "参数异常");
    ErrorCodeTO USER_UNEXISTS = new ErrorCodeTO(0002, "店家不存在");
    ErrorCodeTO ADD_STORE_FAILED = new ErrorCodeTO(0003, "添加店家失败");
    ErrorCodeTO UPDATE_STORE_FAILED = new ErrorCodeTO(0004, "添加店家失败");
    ErrorCodeTO DELETE_STORE_FAILED = new ErrorCodeTO(0005, "删除店家失败");
}
