package edu.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.ssm.mapper.TestMapper;

@Controller
public class TestController {
    @Autowired
    private TestMapper testMapper;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return String.valueOf(testMapper.select());
    }
}
