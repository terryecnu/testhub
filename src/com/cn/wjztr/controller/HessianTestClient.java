package com.cn.wjztr.controller;

import java.net.MalformedURLException;

import com.caucho.hessian.client.HessianProxyFactory;
import com.cn.wjztr.model.HelloWorld;
import com.cn.wjztr.service.HessianService;

/**
 * 
 * 
 * 类名称：HessianTestClient 类描述： 创建人：wodediqizhang@163.com 修改时间：2016-6-7 下午4:57:11
 * Modification History:
 * =============================================================================
 * Author Date Description ------------ ----------
 * --------------------------------------------------- ghb 2016-6-20 创建文档
 * =============================================================================
 * 
 * @version 1.0.0
 *
 */
public class HessianTestClient {
	public static void main(String[] args) {
		// 在服务器端的web.xml文件中配置的HessianServlet映射的访问URL地址
		String url = "http://127.0.0.1:18080/HessianTest/ServiceServlet";
		HessianProxyFactory factory = new HessianProxyFactory();
		HessianService service = null;
		try {
			service = (HessianService) factory.create(HessianService.class, url);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 创建IService接口的实例对象
		HelloWorld helloWorld = service.sayHelloWorld();
		// 调用Hessian服务器端的ServiceImpl类中的getUser方法来获取一个User对象
		System.out.println(helloWorld.getName());
	}
}
