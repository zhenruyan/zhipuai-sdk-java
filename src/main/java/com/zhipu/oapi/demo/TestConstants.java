package com.zhipu.oapi.demo;

public class TestConstants {
    // V2用户API KEY（请登录开放平台获取 https://maas.aminer.cn ）
    public static String API_KEY = "699d00f6fff5476bb08207c12329cb78";
    // V2用户PUBLIC KEY（请登录开放平台获取 https://maas.aminer.cn ）
    public  static String PUBLIC_KEY = "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAIKV2voEt2YddqB3wgXovkICz1LGKdpVnmFPaNepTnF/Q0UWs6DErgkI+rp6vHEDkGy3rOEQCQ/VncVoQboQkl8CAwEAAQ==";
    // V3 api key
    public static final String testKeyV3 = "29368361dfef6c629bbd8177bdc06fe1";
    // V3 api secret
    public static final String testSecretV3 = "dzYUDwms9spdJnMU";
    public static final String onlineKeyV3 = "4b723e1372a8870b7a55a1efdf07167b";
    public static final String onlineSecretV3 = "CBOojhvRVim74p2z";


    // 请求地址
    public static String MODEL_REQUEST_URL = "https://maas.aminer.cn/api/paas/model/v2/open/engines/chatglm_qa_6b/chatglm_6b";

    // 获取token 请求地址
    public static String AUTH_TOKEN_URL = "https://maas.aminer.cn/api/paas/passApiToken/createApiToken";

    public static String QUERY_RESULT_URL = "https://maas.aminer.cn/api/paas/request-task/query-request-task-result";

    public static final String sseModelUrl = "https://open.bigmodel.cn/api/paas/v3/model-api/{model}/sse-invoke";
    public static final String ssModelUrlDev = "https://test-maas.aminer.cn/stage-api/paas/v3/model-api/{model}/sse-invoke";

}
