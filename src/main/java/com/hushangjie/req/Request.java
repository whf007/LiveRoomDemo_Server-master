package com.hushangjie.req;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class Request {



    /** 请求时间 **/
    String requestTime  ;

    /** 签名 **/
    String sign;
    


    /** 用户标识号 **/
    String symbol;

    /** 备注 **/
    String memo;
    

}
