/**
 * 
 */
package cn.chinamobile.iot.publicity.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xieanyue
 *
 */
public class Constants {
	
	/**
	 * 返回code and desc
	 */
	public static final String RESULT = "result";
	public static final String RESULT_NOTE = "resultNote";
	
	/**
	 * app return code
	 */
	public static int SUCCESS = 0;
	public static int SYS_ERROR = 1;
	
	public static Map<Integer, String> stateMap;
	static{
		stateMap = new HashMap<Integer, String>();
		stateMap.put(SUCCESS, "成功");
		stateMap.put(SYS_ERROR, "系统错误，请稍后重试");
		
	}
	
	public static void wrapDataWithStateMap(Map<String,Object> data, int result){
		data.put(RESULT, result);
		data.put(RESULT_NOTE, stateMap.get(result));
	}

}
