package com.common.Exception;

/**
 * 业务报错
 * 
 * @author wwn
 *
 */
public class BusinessException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 错误码
	 */
	private String code;
	/**
	 * 信息
	 */
	private String message;
	/**
	 * 状态 -1，报错；1 返回成功
	 */
	private Integer status = -1;

	public BusinessException() {

	}

	public BusinessException(String message) {
		super();
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}
