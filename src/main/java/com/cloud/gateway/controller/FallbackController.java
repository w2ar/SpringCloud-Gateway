package com.cloud.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

@RestController
public class FallbackController {

	@RequestMapping("/clientFallback")
	public String fallback() {
		JSONObject r = new JSONObject();
		r.put("state", "9999");
		r.put("msg", "Cleint --> 系统错误，请求失败");
		return r.toJSONString();
	}
}
