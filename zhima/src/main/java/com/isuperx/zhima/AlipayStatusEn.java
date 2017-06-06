package com.isuperx.zhima;

/**
 * Created by Administrator on 2017/5/23.
 */
public enum AlipayStatusEn {

    成功(10000, "接口调用成功"),
    服务不可用(20000, "服务不可用"),
    授权权限不足(20001, "授权权限不足"),
    缺少必选参数(40001, "缺少必选参数"),
    非法的参数(40002, "非法的参数"),
    业务处理失败(40004, "业务处理失败"),
    权限不足(40006, "权限不足"),
    ;
    private int code;
    private String msg;

    AlipayStatusEn (int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
