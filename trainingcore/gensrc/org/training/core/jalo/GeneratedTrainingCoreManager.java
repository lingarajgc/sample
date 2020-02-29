/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Feb 27, 2020 10:10:59 AM                    ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.order.AbstractOrderEntry;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.core.constants.TrainingCoreConstants;
import org.training.core.jalo.ApparelProduct;
import org.training.core.jalo.ApparelSizeVariantProduct;
import org.training.core.jalo.ApparelStyleVariantProduct;
import org.training.core.jalo.ElectronicsColorVariantProduct;

/**
 * Generated class for type <code>TrainingCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTrainingCoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("productSpeciality", AttributeMode.INITIAL);
		tmp.put("isBuyable", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("orderLineReferenceNew", AttributeMode.INITIAL);
		tmp.put("orderLineReferenceTestHard", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.AbstractOrderEntry", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return TrainingCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.isBuyable</code> attribute.
	 * @return the isBuyable - Product is buyable
	 */
	public Boolean isIsBuyable(final SessionContext ctx, final Product item)
	{
		return (Boolean)item.getProperty( ctx, TrainingCoreConstants.Attributes.Product.ISBUYABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.isBuyable</code> attribute.
	 * @return the isBuyable - Product is buyable
	 */
	public Boolean isIsBuyable(final Product item)
	{
		return isIsBuyable( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.isBuyable</code> attribute. 
	 * @return the isBuyable - Product is buyable
	 */
	public boolean isIsBuyableAsPrimitive(final SessionContext ctx, final Product item)
	{
		Boolean value = isIsBuyable( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.isBuyable</code> attribute. 
	 * @return the isBuyable - Product is buyable
	 */
	public boolean isIsBuyableAsPrimitive(final Product item)
	{
		return isIsBuyableAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.isBuyable</code> attribute. 
	 * @param value the isBuyable - Product is buyable
	 */
	public void setIsBuyable(final SessionContext ctx, final Product item, final Boolean value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Product.ISBUYABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.isBuyable</code> attribute. 
	 * @param value the isBuyable - Product is buyable
	 */
	public void setIsBuyable(final Product item, final Boolean value)
	{
		setIsBuyable( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.isBuyable</code> attribute. 
	 * @param value the isBuyable - Product is buyable
	 */
	public void setIsBuyable(final SessionContext ctx, final Product item, final boolean value)
	{
		setIsBuyable( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.isBuyable</code> attribute. 
	 * @param value the isBuyable - Product is buyable
	 */
	public void setIsBuyable(final Product item, final boolean value)
	{
		setIsBuyable( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.orderLineReferenceNew</code> attribute.
	 * @return the orderLineReferenceNew
	 */
	public String getOrderLineReferenceNew(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, TrainingCoreConstants.Attributes.AbstractOrderEntry.ORDERLINEREFERENCENEW);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.orderLineReferenceNew</code> attribute.
	 * @return the orderLineReferenceNew
	 */
	public String getOrderLineReferenceNew(final AbstractOrderEntry item)
	{
		return getOrderLineReferenceNew( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.orderLineReferenceNew</code> attribute. 
	 * @param value the orderLineReferenceNew
	 */
	public void setOrderLineReferenceNew(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.AbstractOrderEntry.ORDERLINEREFERENCENEW,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.orderLineReferenceNew</code> attribute. 
	 * @param value the orderLineReferenceNew
	 */
	public void setOrderLineReferenceNew(final AbstractOrderEntry item, final String value)
	{
		setOrderLineReferenceNew( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.orderLineReferenceTestHard</code> attribute.
	 * @return the orderLineReferenceTestHard
	 */
	public String getOrderLineReferenceTestHard(final SessionContext ctx, final AbstractOrderEntry item)
	{
		return (String)item.getProperty( ctx, TrainingCoreConstants.Attributes.AbstractOrderEntry.ORDERLINEREFERENCETESTHARD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOrderEntry.orderLineReferenceTestHard</code> attribute.
	 * @return the orderLineReferenceTestHard
	 */
	public String getOrderLineReferenceTestHard(final AbstractOrderEntry item)
	{
		return getOrderLineReferenceTestHard( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.orderLineReferenceTestHard</code> attribute. 
	 * @param value the orderLineReferenceTestHard
	 */
	public void setOrderLineReferenceTestHard(final SessionContext ctx, final AbstractOrderEntry item, final String value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.AbstractOrderEntry.ORDERLINEREFERENCETESTHARD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOrderEntry.orderLineReferenceTestHard</code> attribute. 
	 * @param value the orderLineReferenceTestHard
	 */
	public void setOrderLineReferenceTestHard(final AbstractOrderEntry item, final String value)
	{
		setOrderLineReferenceTestHard( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productSpeciality</code> attribute.
	 * @return the productSpeciality - Product designed for some special feature
	 */
	public String getProductSpeciality(final SessionContext ctx, final Product item)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedProduct.getProductSpeciality requires a session language", 0 );
		}
		return (String)item.getLocalizedProperty( ctx, TrainingCoreConstants.Attributes.Product.PRODUCTSPECIALITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productSpeciality</code> attribute.
	 * @return the productSpeciality - Product designed for some special feature
	 */
	public String getProductSpeciality(final Product item)
	{
		return getProductSpeciality( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productSpeciality</code> attribute. 
	 * @return the localized productSpeciality - Product designed for some special feature
	 */
	public Map<Language,String> getAllProductSpeciality(final SessionContext ctx, final Product item)
	{
		return (Map<Language,String>)item.getAllLocalizedProperties(ctx,TrainingCoreConstants.Attributes.Product.PRODUCTSPECIALITY,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productSpeciality</code> attribute. 
	 * @return the localized productSpeciality - Product designed for some special feature
	 */
	public Map<Language,String> getAllProductSpeciality(final Product item)
	{
		return getAllProductSpeciality( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productSpeciality</code> attribute. 
	 * @param value the productSpeciality - Product designed for some special feature
	 */
	public void setProductSpeciality(final SessionContext ctx, final Product item, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedProduct.setProductSpeciality requires a session language", 0 );
		}
		item.setLocalizedProperty(ctx, TrainingCoreConstants.Attributes.Product.PRODUCTSPECIALITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productSpeciality</code> attribute. 
	 * @param value the productSpeciality - Product designed for some special feature
	 */
	public void setProductSpeciality(final Product item, final String value)
	{
		setProductSpeciality( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productSpeciality</code> attribute. 
	 * @param value the productSpeciality - Product designed for some special feature
	 */
	public void setAllProductSpeciality(final SessionContext ctx, final Product item, final Map<Language,String> value)
	{
		item.setAllLocalizedProperties(ctx,TrainingCoreConstants.Attributes.Product.PRODUCTSPECIALITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productSpeciality</code> attribute. 
	 * @param value the productSpeciality - Product designed for some special feature
	 */
	public void setAllProductSpeciality(final Product item, final Map<Language,String> value)
	{
		setAllProductSpeciality( getSession().getSessionContext(), item, value );
	}
	
}
