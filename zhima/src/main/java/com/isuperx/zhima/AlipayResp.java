package com.isuperx.zhima;

/**
 * Created by Administrator on 2017/5/23.
 */
public class AlipayResp {
    /**
     * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
     * 示例：201512100936588040000000465158
     */
    private String biz_no;
    /**
     * 准入判断结果 Y=准入,N=不准入,N/A=无法评估该用户的信用
     */
    private String is_admittance;
}
