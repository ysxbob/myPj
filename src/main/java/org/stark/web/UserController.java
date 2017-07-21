package org.stark.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.stark.domain.Result;
import org.stark.utils.ResultUtil;

/**
 * Created by shaoxiong on 2017/7/19.
 */
@RestController
public class UserController {
    @RequestMapping(value = "/log", method = RequestMethod.GET)
    public Result say() {
        return ResultUtil.success();
    }
}
