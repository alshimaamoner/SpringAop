package com.company.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspect {
//    @Before("execution(public String getName())")
//    public void beforeAdvice(){
//        System.out.println("Before Calling Method ......");
//    }

//@Before("execution(public * get*())")
//public void beforeAdvice(){
//    System.out.println("Before Calling Method ......");
//}
//@Before("execution( * get*())")
//public void beforeAdvice(){
//    System.out.println("Before Calling Method ......");
//}

//@Before("getAll() && getAllPointCut() ")
//public void beforeAdvice(){
//    System.out.println("Before Calling Method ......");
//}

//@Before("getAll() && getAllPointCut()  ")
//public void beforeAdvice(JoinPoint joinPoint){
//    System.out.println("JoinPoint is : "+joinPoint.toString());
//    Object object=joinPoint.getTarget();
//    System.out.println(object.toString());
//}

@Pointcut("execution(public * get*())")
public void getAll(){}

@Pointcut("within(com.company.model.Circle)")
public void getAllPointCut(){ }
//@Around("getAllPointCut()")
//public Object getAllAroundAdvice(ProceedingJoinPoint joinPoint) {
//    Object returnObject=null;
//    System.out.println("Before.....");
//    try {
//        returnObject=joinPoint.proceed();
//        System.out.println("After......");
//    } catch (Throwable throwable) {
//        System.out.println("After Throwing");
//    }
//    System.out.println("After Finally......");
//    return returnObject;
//}

    //Custom Annotation
    @Around("@annotation(com.company.customAnnotation.Loggable)")
    public Object getAllAroundAdvice(ProceedingJoinPoint joinPoint) {
        Object returnObject=null;
        System.out.println("Before.....");
        try {
            returnObject=joinPoint.proceed();
            System.out.println("After......");
        } catch (Throwable throwable) {
            System.out.println("After Throwing");
        }
        System.out.println("After Finally......");
        return returnObject;
    }

//@Pointcut("args(com.company.model.Triangle)")
//@Before("args(name)")
//public void setPointCut(String name){
//    System.out.println("Setter called : " +name);
//}
//
//@After("args(name)")
//public void setPointCutAfter(String name){
//        System.out.println("After Calling Setter  : " +name);
//    }
//
//@AfterReturning(pointcut = "args(name)",returning = "status")
//public void setPointCutAfterReturn(String name,String status){
//        System.out.println("After Returning call Setter  : " + name +"and status is "+status);
//    }
// @AfterThrowing(pointcut = "args(name)",throwing = "exception")
//public void setPointCutAfterReturn(String name,Throwable exception){
//        System.out.println("After Returning call Setter  : " + name +"and Exception  is "+exception.getMessage());
//    }


}
