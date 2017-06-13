/**
 * 
 */
package com.ahstu.cles.entity;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @description 
 * @author 何章伟
 * @createDate 2017年6月12日 下午5:30:55
 * @version ver1.0
 * 
 */
public class BaseTerm implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -763303109170216366L;
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((en == null) ? 0 : en.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseTerm other = (BaseTerm) obj;
		if (en == null) {
			if (other.en != null)
				return false;
		} else if (!en.equals(other.en))
			return false;
		return true;
	}
	public String getEn() {
		return en;
	}
	public void setEn(String en) {
		this.en = en;
	}
	public String[] getCn() {
		return cn;
	}
	public void setCn(String[] cn) {
		this.cn = cn;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BaseTerm [en=").append(en).append(", cn=").append(Arrays.toString(cn)).append(", id=")
				.append(id).append("]");
		return builder.toString();
	}
	//填写共同属性
	//1.英文
	private String en;
	//2.中文
	private String[] cn;
	//3.标识符
	private Long id;
	public BaseTerm() {
		super();
	}
	public BaseTerm(String en, String[] cn) {
		super();
		this.en = en;
		this.cn = cn;
	}
	
}
