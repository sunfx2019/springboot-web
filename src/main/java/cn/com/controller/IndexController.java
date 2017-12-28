package cn.com.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/5/6.
 */
@Controller
public class IndexController {

	@Value("${application.message:Hello World}")
	private String message = "Hello World";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("time", new Date());
		model.put("message", this.message);
		return "welcome";
	}

	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping("/user")
	@ResponseBody
	public List user() {
		List list = new ArrayList<>();
		list.add("ssssssss");
		return list;
	}

	@RequestMapping("/demo1")
	public String demo1() {
		return "redirect:/demo2";
	}

	@RequestMapping("/demo2")
	public String demo2() {
		return "demo2";
	}

}
