package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FengdieSuccessRespModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.sites.sync response.
 * 
 * @author auto create
 * @since 1.0, 2018-08-19 16:17:26
 */
public class AlipayMarketingToolFengdieSitesSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3192675487778354188L;

	/** 
	 * 返回站点升级是否成功
	 */
	@ApiField("data")
	private FengdieSuccessRespModel data;

	public void setData(FengdieSuccessRespModel data) {
		this.data = data;
	}
	public FengdieSuccessRespModel getData( ) {
		return this.data;
	}

}
