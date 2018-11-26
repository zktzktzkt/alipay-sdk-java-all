package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.order.info.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2018-05-28 13:30:27
 */
public class KoubeiCateringOrderInfoCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 7817749877846226965L;

	/** 
	 * 是否需要重试,true-需要重试 ,false-不需要重试
	 */
	@ApiField("retry")
	private Boolean retry;

	public void setRetry(Boolean retry) {
		this.retry = retry;
	}
	public Boolean getRetry( ) {
		return this.retry;
	}

}
