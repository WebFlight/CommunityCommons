// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class PdfOverlay extends system.proxies.FileDocument
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.PdfOverlay";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		MarginTop("MarginTop"),
		MarginLeft("MarginLeft"),
		MarginRight("MarginRight"),
		MarginBottom("MarginBottom"),
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size");

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

	public PdfOverlay(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.PdfOverlay"));
	}

	protected PdfOverlay(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject pdfOverlayMendixObject)
	{
		super(context, pdfOverlayMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.PdfOverlay", pdfOverlayMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.PdfOverlay");
	}

	/**
	 * @deprecated Use 'PdfOverlay.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.PdfOverlay initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.PdfOverlay.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.PdfOverlay initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.PdfOverlay(context, mendixObject);
	}

	public static myfirstmodule.proxies.PdfOverlay load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.PdfOverlay.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.PdfOverlay> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.PdfOverlay> result = new java.util.ArrayList<myfirstmodule.proxies.PdfOverlay>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.PdfOverlay" + xpathConstraint))
			result.add(myfirstmodule.proxies.PdfOverlay.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of MarginTop
	 */
	public final java.math.BigDecimal getMarginTop()
	{
		return getMarginTop(getContext());
	}

	/**
	 * @param context
	 * @return value of MarginTop
	 */
	public final java.math.BigDecimal getMarginTop(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.MarginTop.toString());
	}

	/**
	 * Set value of MarginTop
	 * @param margintop
	 */
	public final void setMarginTop(java.math.BigDecimal margintop)
	{
		setMarginTop(getContext(), margintop);
	}

	/**
	 * Set value of MarginTop
	 * @param context
	 * @param margintop
	 */
	public final void setMarginTop(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal margintop)
	{
		getMendixObject().setValue(context, MemberNames.MarginTop.toString(), margintop);
	}

	/**
	 * @return value of MarginLeft
	 */
	public final java.math.BigDecimal getMarginLeft()
	{
		return getMarginLeft(getContext());
	}

	/**
	 * @param context
	 * @return value of MarginLeft
	 */
	public final java.math.BigDecimal getMarginLeft(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.MarginLeft.toString());
	}

	/**
	 * Set value of MarginLeft
	 * @param marginleft
	 */
	public final void setMarginLeft(java.math.BigDecimal marginleft)
	{
		setMarginLeft(getContext(), marginleft);
	}

	/**
	 * Set value of MarginLeft
	 * @param context
	 * @param marginleft
	 */
	public final void setMarginLeft(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal marginleft)
	{
		getMendixObject().setValue(context, MemberNames.MarginLeft.toString(), marginleft);
	}

	/**
	 * @return value of MarginRight
	 */
	public final java.math.BigDecimal getMarginRight()
	{
		return getMarginRight(getContext());
	}

	/**
	 * @param context
	 * @return value of MarginRight
	 */
	public final java.math.BigDecimal getMarginRight(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.MarginRight.toString());
	}

	/**
	 * Set value of MarginRight
	 * @param marginright
	 */
	public final void setMarginRight(java.math.BigDecimal marginright)
	{
		setMarginRight(getContext(), marginright);
	}

	/**
	 * Set value of MarginRight
	 * @param context
	 * @param marginright
	 */
	public final void setMarginRight(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal marginright)
	{
		getMendixObject().setValue(context, MemberNames.MarginRight.toString(), marginright);
	}

	/**
	 * @return value of MarginBottom
	 */
	public final java.math.BigDecimal getMarginBottom()
	{
		return getMarginBottom(getContext());
	}

	/**
	 * @param context
	 * @return value of MarginBottom
	 */
	public final java.math.BigDecimal getMarginBottom(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.MarginBottom.toString());
	}

	/**
	 * Set value of MarginBottom
	 * @param marginbottom
	 */
	public final void setMarginBottom(java.math.BigDecimal marginbottom)
	{
		setMarginBottom(getContext(), marginbottom);
	}

	/**
	 * Set value of MarginBottom
	 * @param context
	 * @param marginbottom
	 */
	public final void setMarginBottom(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal marginbottom)
	{
		getMendixObject().setValue(context, MemberNames.MarginBottom.toString(), marginbottom);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.PdfOverlay that = (myfirstmodule.proxies.PdfOverlay) obj;
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
		return "MyFirstModule.PdfOverlay";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
