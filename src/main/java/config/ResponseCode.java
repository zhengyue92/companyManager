package config;

/**
 * 返回码的枚举
 * @author zheng_000
 *
 */
public enum ResponseCode {
	
	/**
	 * 执行成功
	 */
	SUCCESS(200,"执行成功"),
	
	/**
	 * 参数错误
	 */
	BAD_REQUEST(400, "参数错误"),
	
	/**
	 * 未登录
	 */
    UNAUTHORIZED(401, "未登录"),
    
    /**
     * 没有权限
     */
    FORBIDDEN(403, "没有权限"),
    
    /**
     * 操作失败
     */
    EXPECTATION_FAILED(417, "操作失败"),
    
    /**
     * 系统异常
     */
	SERVER_ERROR(500, "系统异常"),
	
	/**
	 * 用户名或密码错误
	 */
	BAD_CREDENTIALS(1002,"用户名或密码错误"),
	
	/**
	 * 用户被锁定
	 */
	USER_LOCKED(1003, "用户被锁定"),
	
	/**
	 * 用户登录过期
	 */
	REDENTIALS_Expired(1005, "您的账户登录过期,请重新登录"),
	;
	public int code;
	
	public String reasonPhrase;
	
	ResponseCode(int code, String reasonPhrase){
		this.code = code;
		this.reasonPhrase = reasonPhrase;
	}

	public int code() {
		return code;
	}

	public String reasonPhrase() {
		return reasonPhrase;
	}
	
}
