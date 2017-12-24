package com.cyx.learnBoot;


import com.cyx.service.AopConfig;
import com.cyx.service.DemoAnnotationService;
import com.cyx.service.DemoMethodService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        /*UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService);
        System.out.println(useFunctionService.SayHello(" cyx"));
        context.close();*/

        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        demoAnnotationService.add();
        demoMethodService.add();
        context.close();
    }
}
