package com.yong.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**  
 * @Title: Test.java
 * @Prject: springMVCMybatis
 * @Package: com.yong.demo.controller
 * @Description: TODO
 * @author: zhengyong
 * @date: 2018年8月6日 下午2:22:55
 * @version: V1.0  
 */

@Controller
@RequestMapping("/test")
public class Test {

	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public String index(){
		System.out.println("进来了");
		return "index";
	}
}
