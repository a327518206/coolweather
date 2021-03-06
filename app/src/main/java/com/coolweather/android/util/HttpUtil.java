package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**网络交互工具类,发送请求
 * Created by Administrator on 2017/6/16.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
