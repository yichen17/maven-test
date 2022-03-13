package com.yichen.parent.controller;

import com.yichen.constants.DayConstants;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Qiuxinchao
 * @version 1.0
 * @date 2021/10/19 17:33
 * @describe
 */
@RestController
public class TestController {

    @RequestMapping("/show")
    public String show(){
        return DayConstants.NOW;
    }

}
