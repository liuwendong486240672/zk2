package com.liuwendong.utils;

import javax.servlet.http.HttpServletRequest;

/*
 * Web工具类
 * */
public class WebUtil {
	public boolean getString(HttpServletRequest request, String name, String defaultValue){
		
			
		return false;
	    //实现代码
		
	}
	//方法2：获取url上的参数，返回整数类型，如果没有该参数或该参数不是整形值，则返回默认值 (5分)
	public int getInt(){
		return 0;
	    //实现代码
	}
	//方法3：获取url上的参数，返回布尔类型，如果没有该参数或该参数不是布尔类型，则返回false  (5分)
	public boolean getBoolean(){
		return false;
	    //实现代码
	}
	//方法4：获取当前请求地址，注意参数不能丢 (5分)
	public String getUrl(HttpServletRequest request){
		return null;
	    //实现代码
	}
	//方法5：给定一个Cookie名获得取Cookie值 (5分)
	public String getCookieValue(){
		return null;
	    //实现代码
	}
}
