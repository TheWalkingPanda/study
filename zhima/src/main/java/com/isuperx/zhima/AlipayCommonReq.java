package com.isuperx.zhima;

/**
 * Created by Administrator on 2017/5/23.
 */
public class AlipayCommonReq {
    /**
     * 支付宝分配给开发者的应用ID
     */
    private String app_id;
    /**
     * 接口名称
     */
    private String method;
    /**
     * 仅支持JSON
     */
    private String format;
    /**
     * 请求使用的编码格式，如utf-8,gbk,gb2312等
     */
    private String charset;
    /**
     * 商户生成签名字符串所使用的签名算法类型，目前支持RSA2和RSA，推荐使用RSA2
     */
    private String sign_type;
    /**
     * 商户请求参数的签名串
     */
    private String sign;
    /**
     * 发送请求的时间，格式"yyyy-MM-dd HH:mm:ss"
     */
    private String timestamp;
    /**
     * 调用的接口版本，固定为：1.0
     */
    private String version;
    /**
     *
     */
    private String app_auth_token;
    /**
     * 请求参数的集合，最大长度不限，除公共参数外所有请求参数都必须放在这个参数中传递，具体参照各产品快速接入文档
     */
    private String biz_content;

}
