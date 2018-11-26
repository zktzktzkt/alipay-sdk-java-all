package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运动单日汇总信息
 *
 * @author auto create
 * @since 1.0, 2018-11-13 21:12:33
 */
public class ExerciseDailySummaryOpenModel extends AlipayObject {

	private static final long serialVersionUID = 5239383787118246344L;

	/**
	 * 时长：单位秒
	 */
	@ApiField("duration")
	private Long duration;

	/**
	 * 目标类型:CARDIO，MUSCLE，FLEXIBILITY
	 */
	@ApiField("type")
	private String type;

	public Long getDuration() {
		return this.duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
