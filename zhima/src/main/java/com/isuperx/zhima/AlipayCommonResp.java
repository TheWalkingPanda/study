package com.isuperx.zhima;

/**
 * Created by Administrator on 2017/5/23.
 */
public class AlipayCommonResp {
    /**
     * 网关返回码
     * 示例：40004
     */
    private String code;
    /**
     * 网关返回码描述
     * 示例：Business Failed
     */
    private String msg;
    /**
     * 业务返回码
     * 示例：ACQ.TRADE_HAS_SUCCESS
     */
    private String sub_code;
    /**
     * 业务返回码描述
     * 示例：交易已被支付
     */
    private String sub_msg;

    private String sign;
}
