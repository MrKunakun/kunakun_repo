package cn.kunakun.di.sett;

import java.util.Date;

public class BasePojo {
	private Date createDate;
	private Date updateDate;
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "BasePojo [createDate=" + createDate + ", updateDate="
				+ updateDate + "]";
	}
	
	
	
}
