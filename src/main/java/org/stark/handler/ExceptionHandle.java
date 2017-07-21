package org.stark.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.stark.domain.Result;
import org.stark.enums.ResultEnum;
import org.stark.exception.MyException;
import org.stark.utils.ResultUtil;

/**
 * Created by shaoxiong on 2017/7/19.
 */
@ControllerAdvice
public class ExceptionHandle {
    private Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        if (e instanceof MyException) {
            return ResultUtil.error(((MyException) e).getCode(), e.getMessage());
        }else {
            logger.error("error:{}",e.getMessage());
            return ResultUtil.error(ResultEnum.UNKNOWN_ERROR.getCode(), ResultEnum.UNKNOWN_ERROR.getMsg());
        }

    }
}
