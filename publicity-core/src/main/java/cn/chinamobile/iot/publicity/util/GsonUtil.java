/**
 * 
 */
package cn.chinamobile.iot.publicity.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * <p>Title:GsonUtil</p>
 * <p>Description:</p>
 * <p>Company:IOT</p>
 * @author xieanyue
 * @date 上午9:50:54
 */
public class GsonUtil {
	// gson工具
	public final static Gson gson = new GsonBuilder()
			.setDateFormat("yyyy-MM-dd HH:mm:ss SSS")
			.setPrettyPrinting()
			.disableHtmlEscaping()
			.create();
}
