package com.sample.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class Http {
	public static void main(String[] args) {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet("http://targethost/homepage");
		CloseableHttpResponse response1 = null;
		// The underlying HTTP connection is still held by the response object
		// to allow the response content to be streamed directly from the
		// network
		// socket.
		// In order to ensure correct deallocation of system resources
		// the user MUST either fully consume the response content or abort
		// request
		// execution by calling CloseableHttpResponse#close().
		// 建立的http连接，仍旧被response1保持着，允许我们从网络socket中获取返回的数据
		// 为了释放资源，我们必须手动消耗掉response1或者取消连接（使用CloseableHttpResponse类的close方法）

		try {
			response1= httpclient.execute(httpGet);
			System.out.println(response1.getStatusLine());
			HttpEntity entity1 = response1.getEntity();
			// do something useful with the response body
			// and ensure it is fully consumed
			EntityUtils.consume(entity1);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				response1.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
