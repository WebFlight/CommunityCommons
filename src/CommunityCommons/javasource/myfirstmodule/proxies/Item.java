// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Item
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject itemMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Item";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Customer_Item("MyFirstModule.Customer_Item"),
		Item_Customer("MyFirstModule.Item_Customer");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Item(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.Item"));
	}

	protected Item(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject itemMendixObject)
	{
		if (itemMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.Item", itemMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.Item");

		this.itemMendixObject = itemMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Item.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.Item initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Item.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Item initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Item(context, mendixObject);
	}

	public static myfirstmodule.proxies.Item load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Item.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Item> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.Item> result = new java.util.ArrayList<myfirstmodule.proxies.Item>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.Item" + xpathConstraint))
			result.add(myfirstmodule.proxies.Item.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of Customer_Item
	 */
	public final java.util.List<myfirstmodule.proxies.Customer> getCustomer_Item() throws com.mendix.core.CoreException
	{
		return getCustomer_Item(getContext());
	}

	/**
	 * @param context
	 * @return value of Customer_Item
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<myfirstmodule.proxies.Customer> getCustomer_Item(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.Customer> result = new java.util.ArrayList<myfirstmodule.proxies.Customer>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.Customer_Item.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(myfirstmodule.proxies.Customer.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of Customer_Item
	 * @param customer_item
	 */
	public final void setCustomer_Item(java.util.List<myfirstmodule.proxies.Customer> customer_item)
	{
		setCustomer_Item(getContext(), customer_item);
	}

	/**
	 * Set value of Customer_Item
	 * @param context
	 * @param customer_item
	 */
	public final void setCustomer_Item(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<myfirstmodule.proxies.Customer> customer_item)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (myfirstmodule.proxies.Customer proxyObject : customer_item)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.Customer_Item.toString(), identifiers);
	}

	/**
	 * @return value of Item_Customer
	 */
	public final myfirstmodule.proxies.Customer getItem_Customer() throws com.mendix.core.CoreException
	{
		return getItem_Customer(getContext());
	}

	/**
	 * @param context
	 * @return value of Item_Customer
	 */
	public final myfirstmodule.proxies.Customer getItem_Customer(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Customer result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Item_Customer.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Customer.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Item_Customer
	 * @param item_customer
	 */
	public final void setItem_Customer(myfirstmodule.proxies.Customer item_customer)
	{
		setItem_Customer(getContext(), item_customer);
	}

	/**
	 * Set value of Item_Customer
	 * @param context
	 * @param item_customer
	 */
	public final void setItem_Customer(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Customer item_customer)
	{
		if (item_customer == null)
			getMendixObject().setValue(context, MemberNames.Item_Customer.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Item_Customer.toString(), item_customer.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return itemMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.Item that = (myfirstmodule.proxies.Item) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "MyFirstModule.Item";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
