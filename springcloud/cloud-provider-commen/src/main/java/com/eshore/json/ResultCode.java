package com.eshore.json;

/**
 * 定义返回统一的格式
 * @author Adminstor
 */
public interface ResultCode {

    int SUCCESS = 200; //成功状态码
    int ERROR = 201;//失败状态码
    int AUTH = 300;//没有操作权限状态码
}
