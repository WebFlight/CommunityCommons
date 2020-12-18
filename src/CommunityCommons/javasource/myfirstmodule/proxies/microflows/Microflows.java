// This file was generated by Mendix Studio Pro.
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
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("MyFirstModule.CreateImage").withParams(params).execute(context);
		return result == null ? null : myfirstmodule.proxies.ImageSpecialization.initialize(context, result);
	}
	public static myfirstmodule.proxies.TimePeriod createTimePeriod(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("MyFirstModule.CreateTimePeriod").withParams(params).execute(context);
		return result == null ? null : myfirstmodule.proxies.TimePeriod.initialize(context, result);
	}
	public static void downloadFileFromContentAsString(IContext context, myfirstmodule.proxies.StringFromFile _stringFromFile)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("StringFromFile", _stringFromFile == null ? null : _stringFromFile.getMendixObject());
		Core.microflowCall("MyFirstModule.DownloadFileFromContentAsString").withParams(params).execute(context);
	}
	public static system.proxies.Language dS_GetDefaultLanguage(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("MyFirstModule.DS_GetDefaultLanguage").withParams(params).execute(context);
		return result == null ? null : system.proxies.Language.initialize(context, result);
	}
	public static myfirstmodule.proxies.URLToDocument dS_URLToDocument(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("MyFirstModule.DS_URLToDocument").withParams(params).execute(context);
		return result == null ? null : myfirstmodule.proxies.URLToDocument.initialize(context, result);
	}
	public static myfirstmodule.proxies.VersionInfo dS_VersionInfo(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("MyFirstModule.DS_VersionInfo").withParams(params).execute(context);
		return result == null ? null : myfirstmodule.proxies.VersionInfo.initialize(context, result);
	}
	public static myfirstmodule.proxies.Container dSO_Container(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("MyFirstModule.DSO_Container").withParams(params).execute(context);
		return result == null ? null : myfirstmodule.proxies.Container.initialize(context, result);
	}
	public static myfirstmodule.proxies.Container dSO_RandomPasswordContainer(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("MyFirstModule.DSO_RandomPasswordContainer").withParams(params).execute(context);
		return result == null ? null : myfirstmodule.proxies.Container.initialize(context, result);
	}
	public static myfirstmodule.proxies.Container dSO_StringSimplifyContainer(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("MyFirstModule.DSO_StringSimplifyContainer").withParams(params).execute(context);
		return result == null ? null : myfirstmodule.proxies.Container.initialize(context, result);
	}
	public static void getApplicationURL(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MyFirstModule.GetApplicationURL").withParams(params).execute(context);
	}
	public static void getDimensions(IContext context, myfirstmodule.proxies.ImageSpecialization _imageSpecialization)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("ImageSpecialization", _imageSpecialization == null ? null : _imageSpecialization.getMendixObject());
		Core.microflowCall("MyFirstModule.GetDimensions").withParams(params).execute(context);
	}
	public static void hiMessage(IContext context, myfirstmodule.proxies.Entity _entity)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Entity", _entity == null ? null : _entity.getMendixObject());
		Core.microflowCall("MyFirstModule.HiMessage").withParams(params).execute(context);
	}
	public static void iVK_CreateAndMerge(IContext context, java.util.List<myfirstmodule.proxies.MergeTestString> _mergeTest)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		java.util.ArrayList<IMendixObject> listparam_mergeTest = null;
		if (_mergeTest != null)
		{
			listparam_mergeTest = new java.util.ArrayList<>();
			for (myfirstmodule.proxies.MergeTestString obj : _mergeTest)
				listparam_mergeTest.add(obj.getMendixObject());
		}
		params.put("MergeTest", listparam_mergeTest);

		Core.microflowCall("MyFirstModule.IVK_CreateAndMerge").withParams(params).execute(context);
	}
	public static void ivk_Customer_Clone(IContext context, myfirstmodule.proxies.Customer _customer)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Customer", _customer == null ? null : _customer.getMendixObject());
		Core.microflowCall("MyFirstModule.Ivk_Customer_Clone").withParams(params).execute(context);
	}
	public static void iVK_GeneratePDF(IContext context, myfirstmodule.proxies.RichTextEntity _richTextEntity)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("RichTextEntity", _richTextEntity == null ? null : _richTextEntity.getMendixObject());
		Core.microflowCall("MyFirstModule.IVK_GeneratePDF").withParams(params).execute(context);
	}
	public static void iVK_HTMLSanitize(IContext context, myfirstmodule.proxies.Container _container)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Container", _container == null ? null : _container.getMendixObject());
		Core.microflowCall("MyFirstModule.IVK_HTMLSanitize").withParams(params).execute(context);
	}
	public static void iVK_IsStringSimplified(IContext context, myfirstmodule.proxies.Container _container)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Container", _container == null ? null : _container.getMendixObject());
		Core.microflowCall("MyFirstModule.IVK_IsStringSimplified").withParams(params).execute(context);
	}
	public static void iVK_SanitizeRichText(IContext context, myfirstmodule.proxies.RichTextEntity _richTextEntity)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("RichTextEntity", _richTextEntity == null ? null : _richTextEntity.getMendixObject());
		Core.microflowCall("MyFirstModule.IVK_SanitizeRichText").withParams(params).execute(context);
	}
	public static boolean iVK_StoreURLToFileDocument(IContext context, myfirstmodule.proxies.URLToDocument _inputURLToDocument)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("inputURLToDocument", _inputURLToDocument == null ? null : _inputURLToDocument.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("MyFirstModule.IVK_StoreURLToFileDocument").withParams(params).execute(context);
	}
	public static void iVK_StringSimplify(IContext context, myfirstmodule.proxies.Container _container)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Container", _container == null ? null : _container.getMendixObject());
		Core.microflowCall("MyFirstModule.IVK_StringSimplify").withParams(params).execute(context);
	}
	public static void refreshView(IContext context, myfirstmodule.proxies.TimePeriod _timePeriod)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TimePeriod", _timePeriod == null ? null : _timePeriod.getMendixObject());
		Core.microflowCall("MyFirstModule.RefreshView").withParams(params).execute(context);
	}
	public static void saveAsPdf(IContext context, myfirstmodule.proxies.StringFromFile _stringFromFile)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("StringFromFile", _stringFromFile == null ? null : _stringFromFile.getMendixObject());
		Core.microflowCall("MyFirstModule.SaveAsPdf").withParams(params).execute(context);
	}
	public static void splitString(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("MyFirstModule.SplitString").withParams(params).execute(context);
	}
	public static myfirstmodule.proxies.MergeDocument sUB_createPDFDocument_1(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("MyFirstModule.SUB_createPDFDocument_1").withParams(params).execute(context);
		return result == null ? null : myfirstmodule.proxies.MergeDocument.initialize(context, result);
	}
	public static myfirstmodule.proxies.MergeDocument sUB_createPDFDocument_2(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("MyFirstModule.SUB_createPDFDocument_2").withParams(params).execute(context);
		return result == null ? null : myfirstmodule.proxies.MergeDocument.initialize(context, result);
	}
	public static void sUB_SanitizeRichText(IContext context, myfirstmodule.proxies.RichTextEntity _richTextEntity)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("RichTextEntity", _richTextEntity == null ? null : _richTextEntity.getMendixObject());
		Core.microflowCall("MyFirstModule.SUB_SanitizeRichText").withParams(params).execute(context);
	}
	public static void templatetest(IContext context, myfirstmodule.proxies.Entity _entity)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Entity", _entity == null ? null : _entity.getMendixObject());
		Core.microflowCall("MyFirstModule.templatetest").withParams(params).execute(context);
	}
	public static boolean test_Base64Decode(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("MyFirstModule.Test_Base64Decode").withParams(params).execute(context);
	}
	public static boolean test_Base64DecodeToFile(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("MyFirstModule.Test_Base64DecodeToFile").withParams(params).execute(context);
	}
	public static boolean test_Base64DecodeToFile_getFileSize(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("MyFirstModule.Test_Base64DecodeToFile_getFileSize").withParams(params).execute(context);
	}
	public static boolean test_Base64Encode(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("MyFirstModule.Test_Base64Encode").withParams(params).execute(context);
	}
	public static boolean test_Base64EncodeToFile(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("MyFirstModule.Test_Base64EncodeToFile").withParams(params).execute(context);
	}
	public static boolean test_Base64EncodeToFile_getFileSize(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("MyFirstModule.Test_Base64EncodeToFile_getFileSize").withParams(params).execute(context);
	}
	public static boolean test_CreateAndMerge(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("MyFirstModule.Test_CreateAndMerge").withParams(params).execute(context);
	}
	public static boolean test_EmptyName(IContext context, myfirstmodule.proxies.URLToDocument _inputURLToDocument)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("inputURLToDocument", _inputURLToDocument == null ? null : _inputURLToDocument.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("MyFirstModule.Test_EmptyName").withParams(params).execute(context);
	}
	public static boolean test_EncryptString(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("MyFirstModule.Test_EncryptString").withParams(params).execute(context);
	}
	public static boolean test_generateHmacSha256(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("MyFirstModule.Test_generateHmacSha256").withParams(params).execute(context);
	}
	public static boolean test_generateHmacSha256_hash(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("MyFirstModule.Test_generateHmacSha256_hash").withParams(params).execute(context);
	}
	public static boolean test_InvalidURL(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("MyFirstModule.Test_InvalidURL").withParams(params).execute(context);
	}
	public static boolean test_MaxFileSize(IContext context, myfirstmodule.proxies.URLToDocument _inputURLToDocument)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("inputURLToDocument", _inputURLToDocument == null ? null : _inputURLToDocument.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("MyFirstModule.Test_MaxFileSize").withParams(params).execute(context);
	}
	public static boolean test_StringFromFile_getFileSize(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("MyFirstModule.Test_StringFromFile_getFileSize").withParams(params).execute(context);
	}
	public static boolean test_StringFromPDF_WithEncoding(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("MyFirstModule.Test_StringFromPDF_WithEncoding").withParams(params).execute(context);
	}
	public static boolean test_StringToFile(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("MyFirstModule.Test_StringToFile").withParams(params).execute(context);
	}
	public static boolean test_StringToPDF_WithEncoding(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("MyFirstModule.Test_StringToPDF_WithEncoding").withParams(params).execute(context);
	}
	public static boolean test_TimerEnd(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("MyFirstModule.Test_TimerEnd").withParams(params).execute(context);
	}
	public static boolean test_URLToDocument_getFileSize(IContext context, myfirstmodule.proxies.URLToDocument _inputURLToDocument)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("inputURLToDocument", _inputURLToDocument == null ? null : _inputURLToDocument.getMendixObject());
		return (java.lang.Boolean) Core.microflowCall("MyFirstModule.Test_URLToDocument_getFileSize").withParams(params).execute(context);
	}
	public static boolean test_ValidURL(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("MyFirstModule.Test_ValidURL").withParams(params).execute(context);
	}
	public static java.lang.String vA_ModelVersion(IContext context, myfirstmodule.proxies.VersionInfo _versionInfo)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("VersionInfo", _versionInfo == null ? null : _versionInfo.getMendixObject());
		return (java.lang.String) Core.microflowCall("MyFirstModule.VA_ModelVersion").withParams(params).execute(context);
	}
	public static java.lang.Long vA_MonthsBetween(IContext context, myfirstmodule.proxies.TimePeriod _timePeriod)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TimePeriod", _timePeriod == null ? null : _timePeriod.getMendixObject());
		return (java.lang.Long) Core.microflowCall("MyFirstModule.VA_MonthsBetween").withParams(params).execute(context);
	}
	public static java.lang.String vA_RuntimeVersion(IContext context, myfirstmodule.proxies.VersionInfo _versionInfo)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("VersionInfo", _versionInfo == null ? null : _versionInfo.getMendixObject());
		return (java.lang.String) Core.microflowCall("MyFirstModule.VA_RuntimeVersion").withParams(params).execute(context);
	}
	public static java.lang.Long vA_YearsBetween(IContext context, myfirstmodule.proxies.TimePeriod _timePeriod)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("TimePeriod", _timePeriod == null ? null : _timePeriod.getMendixObject());
		return (java.lang.Long) Core.microflowCall("MyFirstModule.VA_YearsBetween").withParams(params).execute(context);
	}
}