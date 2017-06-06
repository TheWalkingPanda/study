package com.isuperx.zhima;

/**
 * Created by Administrator on 2017/5/23.
 */
public class AlipayReq {
    /**
     * 商户请求的唯一标志，64位长度的字母数字下划线组合。
     * 该标识作为对账的关键信息，商户要保证其唯一性，对于用户使用相同transaction_id的查询，
     * 芝麻在一天（86400秒）内返回首次查询数据，超过有效期的查询即为无效并返回异常，
     * 有效期内的重复查询不重新计费
     * 示例：201512100936588040000000465158
     */
    private String transaction_id;
    /**
     * 产品码，直接使用［示例］给出的值
     * 示例：w1010100000000002733
     */
    private String product_code;
    /**
     * 证件类型 目前支持三种IDENTITY_CARD(身份证),PASSPORT(护照),ALIPAY_USER_ID(支付宝uid)
     */
    private String cert_type;
    /**
     * 对应的证件号(未脱敏)或支付宝uid
     */
    private String cert_no;
    /**
     * 用户姓名 当证件类型为ALIPAY_USER_ID时不需要传入
     */
    private String name;
    /**
     * 350～950之间 业务判断的准入标准 建议业务确定一个稳定的判断标准 频繁的变更该标准可能导致接口被停用
     */
    private String admittance_score;
}
