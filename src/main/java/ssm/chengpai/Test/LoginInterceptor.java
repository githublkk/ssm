package ssm.chengpai.Test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import ssm.chengpai.dao.TestDao;

public class LoginInterceptor implements HandlerInterceptor {
	@Autowired
	private TestDao dao;
	public void afterCompletion(HttpServletRequest Request, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
         
          System.out.println("执行方法后");
  		
  		System.out.println("请求时的完整URL"+Request.getRequestURL());
  		System.out.println("资源名部分"+Request.getRequestURI());
  		System.out.println("ip"+Request.getRemoteAddr());
  		
  		System.out.println(dao.selectList());
  		
  		System.out.println(Request.getSession().getAttribute("msg"));
          
	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
         System.out.println("执行方法中");
	}

	public boolean preHandle(HttpServletRequest Request, HttpServletResponse Response, Object object) throws Exception {
		// TODO Auto-generated method stub
		 System.out.println("执行方法前");
		 
		 Request.getSession().setAttribute("msg", "123456");
		return true;
	}

}
