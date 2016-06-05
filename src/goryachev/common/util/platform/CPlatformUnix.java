// Copyright (c) 2008-2016 Andy Goryachev <andy@goryachev.com>
package goryachev.common.util.platform;
import goryachev.common.util.CPlatform;
import java.io.File;


public class CPlatformUnix
	extends CPlatform
{
	protected File getSettingsFolderPrivate()
	{
		return new File(getUserHome(), "." + SETTINGS_FOLDER);
	}
}
