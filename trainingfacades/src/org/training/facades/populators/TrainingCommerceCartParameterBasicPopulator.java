/**
 *
 */
package org.training.facades.populators;

import de.hybris.platform.commercefacades.order.converters.populator.CommerceCartParameterBasicPopulator;
import de.hybris.platform.commercefacades.order.data.AddToCartParams;
import de.hybris.platform.commerceservices.service.data.CommerceCartParameter;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;


/**
 * @author personnel-practice
 *
 */
public class TrainingCommerceCartParameterBasicPopulator extends CommerceCartParameterBasicPopulator
{
	@Override
	public void populate(final AddToCartParams addToCartParams, final CommerceCartParameter parameter) throws ConversionException
	{
		// XXX Auto-generated method stub
		super.populate(addToCartParams, parameter);
		parameter.setOrderLineReferenceNew(addToCartParams.getOrderLineReferenceNew());
	}

}
