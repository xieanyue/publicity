/**
 * 
 */
package cn.chinamobile.iot.publicity.service.impl;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.chinamobile.iot.publicity.beans.Product;
import cn.chinamobile.iot.publicity.mapper.product.ProductMapper;
import cn.chinamobile.iot.publicity.service.ProductService;

/**
 * @author xieanyue
 *
 */
@Service(ProductService.SERVICE_NAME)
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductMapper mapper;
	
	@Override
	public List<Map<String, Object>> queryProductList(Map<String,Object> params) {
		return mapper.queryProductList(params);
	}

	@Override
	public Map<String, Object> queryProduct(Map<String, Object> params) {
		return mapper.queryProduct(params);
	}

	@Override
	public String queryProductPics(Map<String, Object> params) {
		return mapper.queryProductPics(params);
	}
	
}
