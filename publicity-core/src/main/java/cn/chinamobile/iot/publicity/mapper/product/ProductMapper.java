/**
 * 
 */
package cn.chinamobile.iot.publicity.mapper.product;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import cn.chinamobile.iot.publicity.beans.Product;

/**
 * @author xieanyue
 *
 */
@Repository
public interface ProductMapper {

	List<Map<String, Object>> queryProductList(Map<String, Object> params);

	Map<String, Object> queryProduct(Map<String, Object> params);

	String queryProductPics(Map<String, Object> params);

}
