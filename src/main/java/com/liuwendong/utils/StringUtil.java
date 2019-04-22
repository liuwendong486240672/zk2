package com.liuwendong.utils;
/*
 * 字符串工具类
 * */
public class StringUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//方法1：判断源字符串是否有值，空引号(空白字符串)也算没值	
		String str = " s";
			if(!str.equals(null)){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
			
		String str2 = "asdfsd";
			if(str.equals(null)){
				System.out.println("yes");
			}else{
				
				System.out.println("no");
			}
		//方法3：判断是否为手机号码 	
		String str3 = "13514698563";
		String reg = "/^1[0-9]{10}/";
		if(!str3.equals(reg)){
			System.out.println("是手机号");
		}else{
			System.out.println("不是手机号");
		}
		//判断是否为邮箱
		
		String str4="486240672@qq.com";
		String reg2 = "/^[0-9]@[a-z].com/";
		if(!str4.equals(reg2)){
			System.out.println("是邮箱");
		}else{
			System.out.println("不是邮箱");
		}

		
		String arr= "abcdefg";
		for (int i = 0; i < arr.length(); i++) {
			for (int j = 0; j < arr.length(); j++) {
				if(i<j){
					int t;
					t=i;
					i=j;
					j=t;
					
				}
			}
		}
			System.out.println(arr);
		
	}

	

}
