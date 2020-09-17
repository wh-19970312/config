package com.eshore.json;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * 统一返回格式
 * @author admin
 */
@Data
public class Result {
    private Boolean success;
    private Integer code;
    private String message;
    private Map<String, Object> data = new HashMap();

    private Result(){}


    public static Result ok(){
       Result result = new Result();
        result.setSuccess(true);
        result.setCode( ResultCode.SUCCESS);
        result.setMessage("操作成功");
        return result;
    }


    public static Result error(){
        Result result = new Result();
        result.setSuccess(false);
        result.setCode(ResultCode.ERROR);
        result.setMessage("操作失败");
        return result;
    }
    //没有权限的
    public static Result warin(){
         Result result = new Result();
        result.setSuccess(false);
        result.setCode(ResultCode.AUTH);
        result.setMessage("操作失败");
        return result;
    }
    //使用链式编程
    public Result success(Boolean success){
        this.setSuccess(success);
        return this;
    }

    public Result message(String message){
        this.setMessage(message);
        return this;
    }

    public Result code(Integer code){
        this.setCode(code);
        return this;
    }

    public Result data(String key, Object value){
        this.data.put(key, value);
        return this;
    }

    public Result data(Map<String, Object> map){
        this.setData(map);
        return this;
    }
}
