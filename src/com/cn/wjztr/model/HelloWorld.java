package com.cn.wjztr.model;
 
import java.io.Serializable;
 
public class HelloWorld implements Serializable{
 
	/**
	 * serialVersionUID:TODO（用一句话描述这个变量表示什么）
	 *
	 * @since 1.0.0
	 */
	private static final long serialVersionUID = 2303638650074878501L;
	/**
	 * 名字
	 */
	private String name;
	public HelloWorld() {
		
	}
	public HelloWorld(String name) {
		 this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
 
}
