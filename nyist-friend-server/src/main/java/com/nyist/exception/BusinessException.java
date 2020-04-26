package com.nyist.exception;


import java.text.MessageFormat;

/**
 * @author pengfei2.hu
 * @version V1.0
 * @date 2019/02/12 3:23 PM
 *
 * 自定义异常类
 */
public class BusinessException extends RuntimeException {

    public BusinessException(String msg)
    {
        super(msg);
    }

    public BusinessException(String str, Object... objects) {
        super(MessageFormat.format(str, objects));
    }

    public BusinessException(String msg,Throwable throwable)
    {
        super(msg,throwable);
    }

    public BusinessException(Throwable throwable) {
        super(throwable);
    }
}
