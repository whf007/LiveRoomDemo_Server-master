package com.hushangjie.service;
/**
 * Created by Administrator on 2018/10/15.
 *
 * @program: rtmp-demo
 * @description:
 * @author: whf
 * @create: on 2018/10/15.
 * @program: rtmp-demo
 * @description:
 * @author: whf
 * @create: on 2018/10/15.
 **/

/**
 * @program: rtmp-demo
 * @description:
 * @author: whf
 * @create: on 2018/10/15.
 **/

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wuranghao on 2017/4/14.
 */


@Aspect
@Component
public class HttpAspect {
    private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public * com.hushangjie.controller.*.*(..))")
    public void log() {
    }

    /**
     * @Before 在方法执行之前执行
     * */
    @Before("log()")
    public void doBefore(JoinPoint joinPoint) {
        logger.info("doBefore"); //记录http请求
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        //从request中获取http请求的url/请求的方法类型／响应该http请求的类方法／IP地址／请求中的参数 //url
        logger.info("url={}",request.getRequestURI());
        //method
        logger.info("method={}",request.getMethod());
        //ip
        logger.info("ip={}",request.getRemoteAddr());
        //类方法
        logger.info("class_method={}",joinPoint.getSignature().getDeclaringTypeName()+ "."+joinPoint.getSignature().getName());
        //参数
        logger.info("args={}",joinPoint.getArgs());

    }

    /**
     * @After在方法执行之后执行
     * */
    @AfterReturning(returning = "object",pointcut = "log()")
    public void doAfterReturning(Object object){
        logger.info("student={}",object);
    }

}
