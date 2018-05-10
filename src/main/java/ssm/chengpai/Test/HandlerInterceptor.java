package ssm.chengpai.Test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface HandlerInterceptor {  
	    boolean preHandle(  
	            HttpServletRequest request, HttpServletResponse response,   
	            Object handler)   
	            throws Exception;  
	  
	    void postHandle(  
	            HttpServletRequest request, HttpServletResponse response,   
	            Object handler, ModelAndView modelAndView)   
	            throws Exception;  
	  
	    void afterCompletion(  
	            HttpServletRequest request, HttpServletResponse response,   
	            Object handler, Exception ex)  
	            throws Exception;  
	}

