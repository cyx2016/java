package com.cyx.learnBoot;

import org.springframework.stereotype.Service;

//��д������Been
@Service
class FunctionService {
    public String sayhello(String word){
        return "hello"+word+" !";
    }

}
