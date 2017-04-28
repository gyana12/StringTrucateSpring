package org.com.shop.impl;

import org.apache.commons.lang3.StringUtils;
import org.com.shop.service.SubscriptionService;
import org.springframework.stereotype.Component;

@Component
public class SubscriptionServiceImpl implements SubscriptionService{

	private static String additionalText = " ... (truncated) ... ";
	@Override
	public String truncate(String orderDetails, int maxChars) {
				
		return StringUtils.abbreviateMiddle(orderDetails, additionalText, maxChars);	
	}

}
