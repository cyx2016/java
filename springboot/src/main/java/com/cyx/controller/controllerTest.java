package com.cyx.controller;
import com.cyx.dao.userTest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class controllerTest {
    /**
     * 查询action，返回所有查询数据
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/show",method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public userTest show() throws Exception{
        userTest user = new userTest();
        user.setName("cyx");
        user.setNo("001");
        System.out.println("测试成功");
        return user;
    }
}
