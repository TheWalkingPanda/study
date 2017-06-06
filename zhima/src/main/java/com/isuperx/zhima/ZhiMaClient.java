package com.isuperx.zhima;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.ZhimaCreditScoreBriefGetRequest;
import com.alipay.api.response.ZhimaCreditScoreBriefGetResponse;

/**
 * Created by Administrator on 2017/5/23.
 */
public class ZhiMaClient {

    public static void main(String[] args) throws AlipayApiException {

        String serverUrl = "https://openapi.alipay.com/gateway.do";
        String appId = "";
        String appPrivateKey = "";
        String format = "json";
        String charset = "";
        String alipayPublicKey = "";
        String signType = "RSA2";

        AlipayClient alipayClient = new DefaultAlipayClient(serverUrl, appId, appPrivateKey, format, charset, alipayPublicKey, signType);
        ZhimaCreditScoreBriefGetRequest request = new ZhimaCreditScoreBriefGetRequest();
        request.setBizContent("{" +
                "    \"transaction_id\":\"201512100936588040000000465158\"," +
                "    \"product_code\":\"w1010100000000002733\"," +
                "    \"cert_type\":\"IDENTITY_CARD\"," +
                "    \"cert_no\":\"5425211970****0009\"," +
                "    \"name\":\"张三\"," +
                "    \"admittance_score\":650" +
                "  }");
        ZhimaCreditScoreBriefGetResponse response = alipayClient.execute(request);
        if(response.isSuccess()){
            System.out.println("调用成功");
        } else {
            System.out.println("调用失败");
        }
    }

}
