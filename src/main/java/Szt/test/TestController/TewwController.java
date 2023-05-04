package Szt.test.TestController;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.dev33.satoken.stp.StpUtil;
@Controller
public class TewwController {

@RequestMapping(value = "/hello", method = RequestMethod.GET)
@ResponseBody
public String hello(@RequestParam("name") String name){
	int i = 1;
	int j = 1;
	int c = i + j;
	return name;
}

@RequestMapping(value = "/sztpost", method = RequestMethod.POST)
@ResponseBody
public String sztpost(@RequestBody Ceshi ceshi){
	if(StpUtil.isLogin())
	{
	return ceshi.sd+ceshi.sdd;
	}else{
		return "szt去死吧";
	}
}

@RequestMapping(value = "/islog", method = RequestMethod.POST)
@ResponseBody
public String islog(@RequestBody Ceshi ceshi){
	StpUtil.login(1001);  
	return ceshi.sd+ceshi.sdd;
}
}


