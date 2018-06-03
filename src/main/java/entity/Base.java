package entity;

import java.io.Serializable;
import java.util.Map;
/**
 * ������
 * @author zheng_000
 *
 */
public class Base  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * ����״̬��
	 */
	private Integer code;
	
	/**
	 * ������Ϣ
	 */
	private String message;

	/**
	 * ��������
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
