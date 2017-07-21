package org.stark.exception;

import org.stark.enums.ResultEnum;

/**
 * Created by shaoxiong on 2017/7/19.
 */
public class MyException extends RuntimeException{
    private Integer code;

    public MyException(ResultEnum resulEnum) {
        super(resulEnum.getMsg());
        this.code = resulEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
