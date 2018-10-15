package com.hushangjie.resp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

import static org.eclipse.jdt.internal.compiler.codegen.ConstantPool.ToString;

/**
 * 
 * <p>
 * 响应基础类
 * <p>
 * 
 * @author caojiayao
 * @version $Id: Response.java, v 0.1 2017年9月25日 下午7:53:56 caojiayao Exp $
 */
@Getter
@Setter
@ToString
public class Response implements Serializable {

    /**  **/
    private static final long serialVersionUID = 8038498242104218313L;

    /** 响应时间 **/

    private String            currencyTime     = new Date().getTime()+"";
    /** 响应CODE **/
    private String            responseCode;

    /** 响应信息 **/
    private String            responseMessage;

    /** 签名 **/
    private String            sign;

    /** 加签类型 **/
    private String            signType;

    /** 描述 **/
    private String            memo;
    /** 描述 **/
    private String            type;

}
