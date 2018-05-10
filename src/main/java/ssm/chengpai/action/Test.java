package ssm.chengpai.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import ssm.chengpai.bean.Duty;
import ssm.chengpai.service.Service;

@Controller
@RequestMapping(value = "/SchDepartment")
@Api(value = "部门管理",description = "", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
@Validated

public class Test {
  @Autowired
  private Service service;
	 @ApiOperation(value = "部门添加", notes = "条件：无", produces = MediaType.APPLICATION_JSON_VALUE)
	 @RequestMapping(value="/insertDepartment" ,method = { RequestMethod.GET }, produces = MediaType.APPLICATION_JSON_VALUE)
	 @ResponseBody
     public  List<Duty> fingaaa(HttpServletResponse response ,
    		 @ApiParam(required = true, value = "学生姓名", defaultValue = "") @RequestParam(required = false) String student_name
    		 ) {
	     System.out.println("gggggggggggg"+student_name);
		 response.addHeader("Access-Control-Allow-Origin", "*");
		 Map<String,Object> map =new HashMap<String,Object>();
		 map.put("ee", "喜欢你");
		 map.put("bb", "喜欢你");
	/*	 Duty d=null;
		 
		 d.getDutyName();*/
		 
		return service.list();
	 }
	/* @RequestMapping("/update.do")
	 public void update() {
		 Duty d=new Duty();
		 d.setDutyId(2);
		 d.setDutyName("鲁班");
		 service.update(d);
	 }*/
	 /*
	  * -Dcatalina.base="E:\apache-tomcat-9.0.0.M19-windows-x64\apache-tomcat-9.0.0.M19" -Dcatalina.home="E:\apache-tomcat-9.0.0.M19-windows-x64\apache-tomcat-9.0.0.M19" -Dwtp.deploy="C:\Users\Administrator\workspace" -Djava.endorsed.dirs="E:\apache-tomcat-9.0.0.M19-windows-x64\apache-tomcat-9.0.0.M19\endorsed"
	  */
}
