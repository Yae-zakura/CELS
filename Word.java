/**
 * 
 */
package com.ahstu.cles.entity;

/**
 * @description 单词
 * @author 何章伟
 * @createDate 2017年6月12日 下午5:24:27
 * @version ver1.0
 * 
 */
public class Word extends BaseTerm {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2379849156242279307L;

	/**
	 * @return the first
	 */
	

	// 属性
	// 首字母
	private Character first;

	public Word(String en, String[] cn) {
		super(en, cn);
		// 初始化首字母
		this.first = en.toUpperCase().charAt(0);
	}
	public Character getFirst() {
			return first;
		}
}
