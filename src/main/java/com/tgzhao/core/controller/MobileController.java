package com.tgzhao.core.controller;

import com.tgzhao.core.common.MobileDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by tgzhao on 16/5/27.
 */

@Controller
@RequestMapping("/")
public class MobileController {

    @Autowired
    private MobileDefinition mobileDefinition;
    public MobileDefinition getMobileDefinition() {
        return mobileDefinition;
    }

    @ResponseBody
    @RequestMapping("/do")
    public Object service(@RequestParam(value = "service", required = false) String service,
                          @RequestParam(value = "data", required = false) String data, HttpServletRequest request) {

        String ser = service;
        String da = data;
        HttpServletRequest req = request;
        MobileDefinition mobileDefinition11 = getMobileDefinition();
        return mobileDefinition11.getKtvAvatar().toString(); // "hello world";
    }
}
