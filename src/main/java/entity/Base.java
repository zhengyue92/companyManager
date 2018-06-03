package entity;

import java.io.Serializable;
import java.util.Map;
/**
 * 返回体
 * @author zheng_000
 *
 */
public class Base  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * 返回状态码
	 */
	private Integer code;
	
	/**
	 * 返回信息
	 */
	private String message;

	/**
	 * 返回数据
	 */
	private Map<String, Object> data;
	
	
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Map<String, Object> getData() {
		return data;
	}
	public void setData(Map<String, Object> data) {
		this.data = data;
	}


	@Override
	public String toString() {
		return "{\"code\":" + code + ",\"message\":\"" + message + "\",\"data\":{}}";
	}
	
	
}
