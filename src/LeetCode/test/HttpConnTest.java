package LeetCode.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class HttpConnTest {
    public void helper() throws Exception {
        // 创建 URL 对象
        URL url = new URL("www.bilibili.com");
        // 用 URL 创建 HttpURLConnection 对象
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        // 打开链接
        conn.connect();
        // 打印请求响应的头部信息
        Map<String, List<String>> header = conn.getHeaderFields();
        for (String key : header.keySet())
            System.out.println(key + ":" + header.get(key));
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
        String str = null;
        while ((str = br.readLine()) != null)
            System.out.println(str);
        conn.disconnect();//断开链接
    }
}
