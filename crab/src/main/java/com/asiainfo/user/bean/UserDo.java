package com.asiainfo.user.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息类
 * 与数据库中crab_user表对应
 * @author xtsora
 *
 */
public class UserDo implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer uid;
	
	private String userName;
	
	private String passWord;
	
	private String phone;
	
	private String notes;
	
	private String ext;
	
	private String createName;
	
	private Date createTime;
	
	private String modifyName;
	
	private Date modifyTime;

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getExt() {
		return ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getModifyName() {
		return modifyName;
	}

	public void setModifyName(String modifyName) {
		this.modifyName = modifyName;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
