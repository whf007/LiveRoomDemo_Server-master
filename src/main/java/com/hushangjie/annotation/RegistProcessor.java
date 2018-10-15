/*
 * @author caojiayao 2017年6月29日 下午5:40:59
 */
package com.hushangjie.annotation;

import org.springframework.stereotype.Service;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * <p>
 * 处理器组成组件
 * <P>
 * 
 * @author caojiayao
 * @version $Id: RegistProcessor.java, v 0.1 2017年6月29日 下午5:40:59 caojiayao Exp
 *          $
 */
@Retention(RUNTIME)
@Target(TYPE)
@Documented
@Service
public @interface RegistProcessor {

	/** 服务名 **/
	String[] value() default "";

}
