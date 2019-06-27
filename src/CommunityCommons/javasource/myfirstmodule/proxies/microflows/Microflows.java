// This file was generated by Mendix Modeler 7.23.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the MyFirstModule module
	public static myfirstmodule.proxies.ImageSpecialization createImage(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "MyFirstModule.CreateImage", params);
			return result == null ? null : myfirstmodule.proxies.ImageSpecialization.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static myfirstmodule.proxies.TimePeriod createTimePeriod(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "MyFirstModule.CreateTimePeriod", params);
			return result == null ? null : myfirstmodule.proxies.TimePeriod.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void downloadFileFromContentAsString(IContext context, myfirstmodule.proxies.StringFromFile _stringFromFile)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("StringFromFile", _stringFromFile == null ? null : _stringFromFile.getMendixObject());
			Core.execute(context, "MyFirstModule.DownloadFileFromContentAsString", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static system.proxies.Language dS_GetDefaultLanguage(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "MyFirstModule.DS_GetDefaultLanguage", params);
			return result == null ? null : system.proxies.Language.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static myfirstmodule.proxies.URLToDocument dS_URLToDocument(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "MyFirstModule.DS_URLToDocument", params);
			return result == null ? null : myfirstmodule.proxies.URLToDocument.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static myfirstmodule.proxies.Container dSO_Container(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "MyFirstModule.DSO_Container", params);
			return result == null ? null : myfirstmodule.proxies.Container.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static myfirstmodule.proxies.Container dSO_RandomPasswordContainer(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "MyFirstModule.DSO_RandomPasswordContainer", params);
			return result == null ? null : myfirstmodule.proxies.Container.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static myfirstmodule.proxies.Container dSO_StringSimplifyContainer(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "MyFirstModule.DSO_StringSimplifyContainer", params);
			return result == null ? null : myfirstmodule.proxies.Container.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void getApplicationURL(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "MyFirstModule.GetApplicationURL", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void getDimensions(IContext context, myfirstmodule.proxies.ImageSpecialization _imageSpecialization)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("ImageSpecialization", _imageSpecialization == null ? null : _imageSpecialization.getMendixObject());
			Core.execute(context, "MyFirstModule.GetDimensions", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void hiMessage(IContext context, myfirstmodule.proxies.Entity _entity)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Entity", _entity == null ? null : _entity.getMendixObject());
			Core.execute(context, "MyFirstModule.HiMessage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_CreateAndMerge(IContext context, java.util.List<myfirstmodule.proxies.MergeTestString> _mergeTest)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			java.util.ArrayList<IMendixObject> listparam_mergeTest = null;
			if (_mergeTest != null)
			{
				listparam_mergeTest = new java.util.ArrayList<IMendixObject>();
				for (myfirstmodule.proxies.MergeTestString obj : _mergeTest)
					listparam_mergeTest.add(obj.getMendixObject());
			}
			params.put("MergeTest", listparam_mergeTest);
			Core.execute(context, "MyFirstModule.IVK_CreateAndMerge", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void ivk_Customer_Clone(IContext context, myfirstmodule.proxies.Customer _customer)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Customer", _customer == null ? null : _customer.getMendixObject());
			Core.execute(context, "MyFirstModule.Ivk_Customer_Clone", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_GeneratePDF(IContext context, myfirstmodule.proxies.RichTextEntity _richTextEntity)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("RichTextEntity", _richTextEntity == null ? null : _richTextEntity.getMendixObject());
			Core.execute(context, "MyFirstModule.IVK_GeneratePDF", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_HTMLSanitize(IContext context, myfirstmodule.proxies.Container _container)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Container", _container == null ? null : _container.getMendixObject());
			Core.execute(context, "MyFirstModule.IVK_HTMLSanitize", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_IsStringSimplified(IContext context, myfirstmodule.proxies.Container _container)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Container", _container == null ? null : _container.getMendixObject());
			Core.execute(context, "MyFirstModule.IVK_IsStringSimplified", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_SanitizeRichText(IContext context, myfirstmodule.proxies.RichTextEntity _richTextEntity)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("RichTextEntity", _richTextEntity == null ? null : _richTextEntity.getMendixObject());
			Core.execute(context, "MyFirstModule.IVK_SanitizeRichText", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean iVK_StoreURLToFileDocument(IContext context, myfirstmodule.proxies.URLToDocument _inputURLToDocument)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("inputURLToDocument", _inputURLToDocument == null ? null : _inputURLToDocument.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "MyFirstModule.IVK_StoreURLToFileDocument", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_StringSimplify(IContext context, myfirstmodule.proxies.Container _container)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Container", _container == null ? null : _container.getMendixObject());
			Core.execute(context, "MyFirstModule.IVK_StringSimplify", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void refreshView(IContext context, myfirstmodule.proxies.TimePeriod _timePeriod)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("TimePeriod", _timePeriod == null ? null : _timePeriod.getMendixObject());
			Core.execute(context, "MyFirstModule.RefreshView", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void saveAsPdf(IContext context, myfirstmodule.proxies.StringFromFile _stringFromFile)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("StringFromFile", _stringFromFile == null ? null : _stringFromFile.getMendixObject());
			Core.execute(context, "MyFirstModule.SaveAsPdf", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void splitString(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "MyFirstModule.SplitString", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static myfirstmodule.proxies.MergeDocument sUB_createPDFDocument_1(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "MyFirstModule.SUB_createPDFDocument_1", params);
			return result == null ? null : myfirstmodule.proxies.MergeDocument.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static myfirstmodule.proxies.MergeDocument sUB_createPDFDocument_2(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "MyFirstModule.SUB_createPDFDocument_2", params);
			return result == null ? null : myfirstmodule.proxies.MergeDocument.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void sUB_SanitizeRichText(IContext context, myfirstmodule.proxies.RichTextEntity _richTextEntity)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("RichTextEntity", _richTextEntity == null ? null : _richTextEntity.getMendixObject());
			Core.execute(context, "MyFirstModule.SUB_SanitizeRichText", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void templatetest(IContext context, myfirstmodule.proxies.Entity _entity)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Entity", _entity == null ? null : _entity.getMendixObject());
			Core.execute(context, "MyFirstModule.templatetest", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean test_Base64Decode(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "MyFirstModule.Test_Base64Decode", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean test_Base64DecodeToFile(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "MyFirstModule.Test_Base64DecodeToFile", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean test_Base64DecodeToFile_getFileSize(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "MyFirstModule.Test_Base64DecodeToFile_getFileSize", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean test_Base64Encode(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "MyFirstModule.Test_Base64Encode", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean test_Base64EncodeToFile(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "MyFirstModule.Test_Base64EncodeToFile", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean test_Base64EncodeToFile_getFileSize(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "MyFirstModule.Test_Base64EncodeToFile_getFileSize", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean test_CreateAndMerge(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "MyFirstModule.Test_CreateAndMerge", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean test_EmptyName(IContext context, myfirstmodule.proxies.URLToDocument _inputURLToDocument)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("inputURLToDocument", _inputURLToDocument == null ? null : _inputURLToDocument.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "MyFirstModule.Test_EmptyName", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean test_EncryptString(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "MyFirstModule.Test_EncryptString", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean test_InvalidURL(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "MyFirstModule.Test_InvalidURL", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean test_MaxFileSize(IContext context, myfirstmodule.proxies.URLToDocument _inputURLToDocument)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("inputURLToDocument", _inputURLToDocument == null ? null : _inputURLToDocument.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "MyFirstModule.Test_MaxFileSize", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean test_StringFromFile_getFileSize(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "MyFirstModule.Test_StringFromFile_getFileSize", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean test_StringFromPDF_WithEncoding(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "MyFirstModule.Test_StringFromPDF_WithEncoding", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean test_StringToFile(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "MyFirstModule.Test_StringToFile", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean test_StringToPDF_WithEncoding(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "MyFirstModule.Test_StringToPDF_WithEncoding", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean test_URLToDocument_getFileSize(IContext context, myfirstmodule.proxies.URLToDocument _inputURLToDocument)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("inputURLToDocument", _inputURLToDocument == null ? null : _inputURLToDocument.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "MyFirstModule.Test_URLToDocument_getFileSize", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean test_ValidURL(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.Boolean)Core.execute(context, "MyFirstModule.Test_ValidURL", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.lang.Long vA_MonthsBetween(IContext context, myfirstmodule.proxies.TimePeriod _timePeriod)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("TimePeriod", _timePeriod == null ? null : _timePeriod.getMendixObject());
			return (java.lang.Long)Core.execute(context, "MyFirstModule.VA_MonthsBetween", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.lang.Long vA_YearsBetween(IContext context, myfirstmodule.proxies.TimePeriod _timePeriod)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("TimePeriod", _timePeriod == null ? null : _timePeriod.getMendixObject());
			return (java.lang.Long)Core.execute(context, "MyFirstModule.VA_YearsBetween", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}