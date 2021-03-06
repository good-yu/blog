package com.blog.utils;

import com.blog.entity.enums.ResultEnum;
import lombok.Data;

/**
 * Created by yuguidong on 2018/9/21.
 */
@Data
public class ResultMap {

    private Integer code;
    private String msg;
    private Object data;

    public ResultMap(){}

    public ResultMap(Integer code, String msg, Object data)
    {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResultMap(Integer code, String msg)
    {
        this.code = code;
        this.msg = msg;
    }

    public static ResultMap success(String mess,Object data) {
        return new ResultMap(ResultEnum.SUCCESS.getCode(),mess,data);
    }

    public static ResultMap success(Object data) {
        return new ResultMap(ResultEnum.SUCCESS.getCode(),ResultEnum.SUCCESS.getMsg(),data);
    }

    public static ResultMap success() {
        return new ResultMap(ResultEnum.SUCCESS.getCode(),ResultEnum.SUCCESS.getMsg(),null);
    }

    public static ResultMap error(String mess,Object data) {
        return new ResultMap(ResultEnum.ERROR.getCode(),mess,data);
    }

    public static ResultMap error(Object data) {
        return new ResultMap(ResultEnum.ERROR.getCode(),ResultEnum.ERROR.getMsg(),data);
    }

    public static ResultMap error() {
        return new ResultMap(ResultEnum.ERROR.getCode(),ResultEnum.ERROR.getMsg(),null);
    }

    public static ResultMap nulls() {
        return new ResultMap(ResultEnum.NULL.getCode(), ResultEnum.NULL.getMsg(), null);
    }

    public static ResultMap notice(String msg, Object data)
    {
        return new ResultMap(ResultEnum.NOTICE.getCode(), msg, data);
    }

    public static ResultMap warn(String msg, Object data)
    {
        return new ResultMap(ResultEnum.WARN.getCode(), msg, data);
    }

    public static ResultMap warn(Object data)
    {
        return new ResultMap(ResultEnum.WARN.getCode(), ResultEnum.WARN.getMsg(), data);
    }

    public static ResultMap lossParam()
    {
        return new ResultMap(ResultEnum.ERROR.getCode(), "参数缺省", null);
    }
}
