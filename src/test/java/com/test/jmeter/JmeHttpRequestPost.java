package com.test.jmeter;

import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.apache.commons.io.IOUtils;
import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

public class JmeHttpRequestPost extends AbstractJavaSamplerClient {

	private String number = "number";
	private String number_value = "18134536460";

	/*
	 * 参数化，number
	 */
	@Override
	public Arguments getDefaultParameters() {
		Arguments params = new Arguments();
		params.addArgument(number, number_value);
		return params;
	}

	/*
	 * 运行方法
	 */
	public SampleResult runTest(JavaSamplerContext arg0) {
		SampleResult sr = new SampleResult();
		try {
			/* 参数获取 */
			String number = arg0.getParameter("number");
			sr.sampleStart();
			/* 请求地址 */
			String URL = "http://ip:port/WSSPort/";
			/* 请求报文 */
			String Json = "";
			Json = "{" + "\"TcpCont\":{" + "\"ServiceCode\":\"/ServiceBus/custView/cust/cust001\"," + "\"SrcSysID\":\"100000\"," + "\"TransactionID\":\"3b236e76-4662-4df6-8c61-46a8e3d2df56\","
					+ "\"MsgId\":\"\"" + "}," + "\"SvcCont\":{" + "\"SOO\":[" + "{" + "\"PUB_REQ\":{" + "\"PAGE_INDEX\":\"1\"," + "\"PAGE_SIZE\":\"5\"," + "\"SVC_CONT_VER\":\"1.0\","
					+ "\"TYPE\":\"QRY_CUST_INFO\"" + "}," + "\"RETURN_OBJECTS\":{" + "\"ACCOUNT\":{" + "\"FIELDS\":\"\"" + "}," + "\"CONTACT\":{" + "\"FIELDS\":\"\"" + "}," + "\"CUST\":{"
					+ "\"FIELDS\":\"\"" + "}," + "\"CUST_BRAND_LABEL\":{" + "\"FIELDS\":\"\"" + "}," + "\"CUST_POINT\":{" + "\"FIELDS\":\"\"" + "}," + "\"MANAGER\":{"
					+ "\"FIELDS\":\"CHANNEL_MEMBER_ID,MEMBER_NBR,CHANNEL_MEMBER_NAME,PHONE\"" + "}," + "\"PARTY_CENTIFICATION\":{" + "\"FIELDS\":\"\"" + "}," + "\"TB_PTY_CERTIF_ID_VAR_INFO\":{"
					+ "\"FIELDS\":\"\"" + "}," + "\"CUST_SPEC_INFO\":{" + "\"FIELDS\":\"\"" + "}" + "}," + "\"CUST_REQ\":{" + "\"CUST_ID\":\":getCustId(" + number + ",'4','',551)\","
					+ "\"LATN_ID\":\"551\"," + "\"PASSWORD\":\"\"" + "}" + "}" + "]" + "}" + "}";
			/* 调用post请求方法 */
			String postResult = doHttpPost(Json, URL);
			/* 设置响应报文内容 */
			sr.setResponseData(postResult, null);
			sr.setDataType(SampleResult.TEXT);
			sr.setSuccessful(true);
			sr.sampleEnd();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return sr;
	}

	/**
	 * doHttpPost：http发送json报文形式的post请求 @param xmlInfo 请求报文 @param URL
	 * 请求地址 @return String 响应内容 @exception
	 */
	public static String doHttpPost(String xmlInfo, String URL) {
		byte[] xmlData = xmlInfo.getBytes();
		InputStream instr = null;
		try {
			URL url = new URL(URL);
			URLConnection urlCon = url.openConnection();
			urlCon.setDoOutput(true);
			urlCon.setDoInput(true);
			urlCon.setUseCaches(false);
			urlCon.setRequestProperty("Content-Type", "text/xml");
			urlCon.setRequestProperty("Content-length", String.valueOf(xmlData.length));
			DataOutputStream printout = new DataOutputStream(urlCon.getOutputStream());
			printout.write(xmlData);
			printout.flush();
			printout.close();
			instr = urlCon.getInputStream();
			byte[] bis = IOUtils.toByteArray(instr);
			String ResponseString = new String(bis, "UTF-8");
			if ((ResponseString == null) || ("".equals(ResponseString.trim()))) {
				System.out.println("返回空");
			}
			return ResponseString;

		} catch (Exception e) {
			e.printStackTrace();
			return "0";
		} finally {
			try {
				instr.close();
			} catch (Exception ex) {
				return "0";
			}
		}
	}
}