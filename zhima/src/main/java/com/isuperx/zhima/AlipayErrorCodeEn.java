package com.isuperx.zhima;

/**
 * Created by Administrator on 2017/5/23.
 */
public enum AlipayErrorCodeEn {
    API_PRODUCT_NOT_MATCH("API_PRODUCT_NOT_MATCH", "输入的产品码不正确"),
    INVALID_TRANSACTION_ID("INVALID_TRANSACTION_ID", "业务流水号不正确"),
    NO_VALID_ARRANGEMENT("NO_VALID_ARRANGEMENT", "无有效合约"),
    INVALID_PARAMETER("INVALID_PARAMETER", "参数有误"),
    TRANSACTION_ID_EXPIRED("TRANSACTION_ID_EXPIRED", "业务流水号已过期"),
    TRANSACTION_ID_REPEAT("TRANSACTION_ID_REPEAT", "相同业务流水号但业务参数不一致，请求被拒绝"),
    TRANSACTIONID_CLOSE("TRANSACTIONID_CLOSE", "对应的流水超时关闭"),
    ADMITTANCE_SCORE_NUM_LIMITED("ADMITTANCE_SCORE_NUM_LIMITED", "调用的目标分数量过多，请求被拒绝"),
    SYSTEM_ERROR("SYSTEM_ERROR", "系统繁忙"),
    ;

    private String code;

    private String desc;

    AlipayErrorCodeEn (String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode () {
        return code;
    }

    public String getDesc () {
        return desc;
    }
}
