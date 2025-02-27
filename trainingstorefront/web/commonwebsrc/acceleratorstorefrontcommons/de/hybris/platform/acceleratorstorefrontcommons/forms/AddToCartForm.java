/*
 * [y] hybris Platform
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.acceleratorstorefrontcommons.forms;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


/**
 * Form for validating update field on cart page.
 */
public class AddToCartForm
{
	@NotNull(message = "{basket.error.quantity.notNull}")
	@Min(value = 0, message = "{basket.error.quantity.invalid}")
	@Digits(fraction = 0, integer = 10, message = "{basket.error.quantity.invalid}")
	private long qty = 1L;

	private String orderLineReferenceNew;

	public void setQty(final long quantity)
	{
		this.qty = quantity;
	}

	public long getQty()
	{
		return qty;
	}

	/**
	 * @return the orderLineReferenceNew
	 */
	public String getOrderLineReferenceNew()
	{
		return orderLineReferenceNew;
	}

	/**
	 * @param orderLineReferenceNew
	 *           the orderLineReferenceNew to set
	 */
	public void setOrderLineReferenceNew(final String orderLineReferenceNew)
	{
		this.orderLineReferenceNew = orderLineReferenceNew;
	}

}
