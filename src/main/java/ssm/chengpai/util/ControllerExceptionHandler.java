package ssm.chengpai.util;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/** 通过此注解声明此类为一个全局异常处理类型 */
@ControllerAdvice
public class ControllerExceptionHandler {
	/**
	 * 当spring发现系统出现异常了,且异常的 类型为ServiceException类型,此时就会 回调此方法,并将异常值传递给这个方法,
	 * 这时我们就可以在此方法中对业务异常进行 统一处理,例如封装到jsonResult,然后 写到客户端告诉用户.
	 */
	@ExceptionHandler(ServiceException.class)
	@ResponseBody
	public Map<String, Object> handleServiceException(ServiceException e) {
		e.printStackTrace();
		// 将异常封装到JsonResult
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("message", e.getMessage());
		return map;
		// this.state=ERROR;
		// this.message=e.getMessage();
	}

	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public Map<String, Object> handleRuntimeException(RuntimeException e) {
		System.out.println("handleRuntimeException");
		Map<String, Object> map = new HashMap<>();
		map.put("message", "系统内部错误,请联系开发者！");
		e.printStackTrace();
		return map;
	}
}
