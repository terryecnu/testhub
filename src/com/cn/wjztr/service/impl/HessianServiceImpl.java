package com.cn.wjztr.service.impl;
 
import com.cn.wjztr.model.HelloWorld;
import com.cn.wjztr.service.HessianService;
/**
 * 
 * 
 * 类名称：HessianServiceImpl
 * 类描述：对外提供服务的接口的实现
 * 创建人：<span style="font-family: Arial, Helvetica, sans-serif;">wodediqizhang@163.com</span>
 * 修改时间：2016-6-7 下午4:47:40
 * Modification History:
 * =============================================================================
 *   Author         Date          Description
 *   ------------ ---------- ---------------------------------------------------
 *   ghb           2016-6-7        创建文档 
 * =============================================================================
 * @version 1.0.0
 *
 */
public class HessianServiceImpl implements HessianService {
	
	@Override
	public HelloWorld sayHelloWorld() {
		// TODO Auto-generated method stub
		return new HelloWorld("hello，World");
	}
 
}
