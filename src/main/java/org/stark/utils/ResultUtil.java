package org.stark.utils;

import org.omg.CORBA.Object;
import org.stark.domain.Result;

/**
 * Created by shaoxiong on 2017/7/19.
 */
public class ResultUtil {
    public static Result success(Object obj){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("success");
        result.setData(obj);
        return result;
    }
    public static Result success(){
        return success(null);
    }
    public static Result error(Integer code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
