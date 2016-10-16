package com.atlassian.confluence.hooks;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.apache.commons.io.IOUtils;

/** 
 * @desc this class will hold all the Web elements and methods of the Login Page
 * @author Esteban Balvin estebillan@gmail.com
*/

public class ConfluenceConfig {

	/**
	 * @desc This method load the properties to be used in the project
	 */
	private static final Properties CONFLUENCE_CONFIG;
	static {
		FileInputStream stream = null;
		CONFLUENCE_CONFIG = new Properties();
		try {
			stream = new FileInputStream("confluence.properties");
			CONFLUENCE_CONFIG.load(stream);
			
		} catch (final FileNotFoundException e) {
			e.printStackTrace();
		} catch (final IOException e) {
			e.printStackTrace();
		} finally {
			IOUtils.closeQuietly(stream);
		}
	}

	// Declaration of variables to load the values from the properties
	public final static String HOST_URL = CONFLUENCE_CONFIG.getProperty("url.application");
	public final static String ADMIN_USERNAME = CONFLUENCE_CONFIG.getProperty("admin.username");
	public final static String ADMIN_PASSWORD = CONFLUENCE_CONFIG.getProperty("admin.password");


}
