/**
 * 
 */
package com.ahstu.cles.entity;

/**
 * @description 词汇
 * @author 何章伟
 * @createDate 2017年6月12日 下午5:26:54
 * @version ver1.0
 * 
 */
public class Vocabular extends BaseTerm{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2709202773616787927L;
	//属性
	//3.简称
	private String abbr;

	public Vocabular(String en, String[] cn,String abbr) {
		super(en, cn);
		//给abbr赋值
		this.abbr=abbr;
	}
	public String getAbbr(){
		return abbr;
	}
	public void setAbbr(String abbr){
		this.abbr=abbr;
	}
}
