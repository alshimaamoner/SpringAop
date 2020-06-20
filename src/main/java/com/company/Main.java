package com.company;

import com.company.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        ShapeService shapeService=applicationContext.getBean("shapeService", ShapeService.class);
       // System.out.println(shapeService.getCircle().getName());
        shapeService.getCircle().setName("Circle2");
      // shapeService.getCircle().getStatus();
    }
}
