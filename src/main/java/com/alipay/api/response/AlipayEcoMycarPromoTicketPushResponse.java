package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.promo.ticket.push response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-28 10:34:14
 */
public class AlipayEcoMycarPromoTicketPushResponse extends AlipayResponse {

	private static final long serialVersionUID = 2835813457183453711L;

	/** 
	 * 处理结果返回码
	 */
	@ApiField("sp_apply_no")
	private String spApplyNo;

	public void setSpApplyNo(String spApplyNo) {
		this.spApplyNo = spApplyNo;
	}
	public String getSpApplyNo( ) {
		return this.spApplyNo;
	}

}
