/**
 * 
 */
package cn.chinamobile.iot.publicity.service;

import java.util.List;
import java.util.Map;

import cn.chinamobile.iot.publicity.beans.Product;

/**
 * @author xieanyue
 *
 */
public interface ProductService {
	String SERVICE_NAME = "productService";
	
	public List<Map<String, Object>> queryProductList(Map<String,Object> params);
	
	public Map<String, Object> queryProduct(Map<String,Object> params);

	public String queryProductPics(Map<String, Object> params);
}
