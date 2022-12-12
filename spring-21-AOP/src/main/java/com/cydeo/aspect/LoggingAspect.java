package com.cydeo.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger; //The Simple Logging Facade for Java (SLF4J) serves as a simple facade or abstraction for various logging frameworks
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class LoggingAspect {

    Logger logger = LoggerFactory.getLogger(LoggingAspect.class);


    //define jointpoint by created pointcut
/*    @Pointcut("execution(* com.cydeo.controller.CourseController.*(..))")
    public void myPointcut(){}

    @Before("myPointcut()")
    public void log(){
        logger.info("Info log........");
    }*/
/*    @Before("execution(* com.cydeo.controller.CourseController.*(..))")
    public void log(){
        logger.info("Info log........");
    }*/
 /*   @Pointcut("execution(* com.cydeo.repository.CourseRepository.findById(*))")
    public void courseRepositoryFindByIdPC(){}

    @Before("courseRepositoryFindByIdPC()")
    public void beforeCourseRepositoryFindById(JoinPoint joinPoint){
        logger.info("Before -> Method: {}, Arguments: {}, Target: {}"
                , joinPoint.getSignature(),joinPoint.getArgs(),joinPoint.getTarget());
    }*/

/*    @Pointcut("within(com.cydeo.controller..*)")
    public void anyControllerOperation(){}

    @Pointcut("@within(org.springframework.stereotype.Service)")
    public void anyServiceOperation(){}

    @Before("anyControllerOperation() || anyServiceOperation()")
    public void beforeControllerOreServiceAdvice(JoinPoint joinPoint){
        logger.info("Before -> Method: {}, Arguments: {}, Target: {}"
                , joinPoint.getSignature(),joinPoint.getArgs(),joinPoint.getTarget());

    }*/
/*    @Pointcut("@annotation(org.springframework.web.bind.annotation.DeleteMapping)")
    public void anyDeleteControllerOperation(){}


    @Before("anyDeleteControllerOperation()")
    public void beforeDeleteMappingAnnotation(JoinPoint joinPoint) {
        logger.info("Before -> Method: {}, Arguments: {}, Target: {}"
                , joinPoint.getSignature(), joinPoint.getArgs(), joinPoint.getTarget());
    }*/

  /*  @Pointcut("@annotation(com.cydeo.annotation.LoggingAnnotation)")
    public void loggingAnnotationPC(){

    }
    @Before("loggingAnnotationPC()")
    public void beforeLoggingAnnotation(JoinPoint joinPoint) {
        logger.info("Before -> Method: {}, Arguments: {}, Target: {}"
                , joinPoint.getSignature(), joinPoint.getArgs(), joinPoint.getTarget());

    }*/

    @Pointcut("@annotation(org.springframework.web.bind.annotation.GetMapping)")
    public void afterReturningGetMappingAnnotation() {
    }

  /*  @AfterReturning(pointcut = "afterReturningGetMappingAnnotation()", returning = "result")
    public void afterReturningGetMappingOperation(JoinPoint jointPoint, Object result){
logger.info("After Returning  -> Method:{}, Result: {}", jointPoint.getSignature(), result.toString());
    }*/

    @AfterReturning(pointcut = "afterReturningGetMappingAnnotation()", returning = "results")
    public void afterReturningGetMappingOperation(JoinPoint jointPoint, List< Object> results) {
        logger.info("After Returning  -> Method:{}, Results: {}", jointPoint.getSignature(), results.toString());
    }
}