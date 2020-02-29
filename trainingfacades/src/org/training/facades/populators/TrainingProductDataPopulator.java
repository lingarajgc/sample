/**
 *
 */
package org.training.facades.populators;

import de.hybris.platform.commercefacades.product.converters.populator.ProductPopulator;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;


/**
 * @author personnel-practice
 *
 */
public class TrainingProductDataPopulator extends ProductPopulator
{

	@Override
	public void populate(final ProductModel source, final ProductData target)
	{
		super.populate(source, target);
		//target.setProductSpeciality(source.getProductSpeciality());
		target.setProductSpeciality("ABC");
	}
}
