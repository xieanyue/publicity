/**
 * 
 */
package cn.chinamobile.iot.publicity.beans;

/**
 * @author xieanyue
 *
 */
public class Product {
	private int productId;
	private String productName;
	private String productDesc;
	private String docUrl;//宣传册
	private String pageUrl;//宣传折页
	private String pptUrl;//宣传ppt
	private String thumbnailUrl;//缩略图
	private String pptToPdfUrl;//宣传ppt->pdf
	
	private String testString;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public String getDocUrl() {
		return docUrl;
	}
	public void setDocUrl(String docUrl) {
		this.docUrl = docUrl;
	}
	
	
	public String getPageUrl() {
		return pageUrl;
	}
	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}
	public String getPptUrl() {
		return pptUrl;
	}
	public void setPptUrl(String pptUrl) {
		this.pptUrl = pptUrl;
	}
	public String getThumbnailUrl() {
		return thumbnailUrl;
	}
	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}
	public String getPptToPdfUrl() {
		return pptToPdfUrl;
	}
	public void setPptToPdfUrl(String pptToPdfUrl) {
		this.pptToPdfUrl = pptToPdfUrl;
	}
	public String getTestString() {
		return testString;
	}
	public void setTestString(String testString) {
		this.testString = testString;
	}
	
	
}
