package com.cyx.learnBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//ʹ�ù�����Been
@Service
public class UseFunctionService {
    @Autowired
    FunctionService functionService;

    public String SayHello(String word){
        return functionService.sayhello(word);
    }
}
