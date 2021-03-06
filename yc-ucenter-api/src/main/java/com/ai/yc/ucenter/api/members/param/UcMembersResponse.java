package com.ai.yc.ucenter.api.members.param;


import java.util.Map;

import com.ai.yc.ucenter.api.members.param.base.UcBaseResponse;

/**
 * Ucenter-用户信息查询结果类<br>
 * Date: 2016年11月1日 <br>
 * Copyright (c) 2016 asiainfo.com <br>
 *
 * @author mengbo
 */
public class UcMembersResponse extends UcBaseResponse {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Map<?, ?> date;

	public Map<?, ?> getDate() {
		return date;
	}

	public void setDate(Map<?, ?> date) {
		this.date = date;
	}
	
	



}
