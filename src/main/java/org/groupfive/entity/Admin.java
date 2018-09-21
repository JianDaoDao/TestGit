package org.groupfive.entity;

import java.util.Date;
import java.util.List;


public class Admin {
	private int Aid;
	private String Aname;
	private String Aaccount;
	private String Apsw;
	private String Atel;
	private String Aemail;
	private Date Adate;
	
	public Admin() {
	}
	
	public Admin(int aid, String aname, String aaccount, String apsw,
			String atel, String aemail, Date adate) {
		this.Aid = aid;
		this.Aname = aname;
		this.Aaccount = aaccount;
		this.Apsw = apsw;
		this.Atel = atel;
		this.Aemail = aemail;
		this.Adate = adate;
	}


	public Admin(int aid, String aname, String atel, String aemail) {
		this.Aid = aid;
		this.Aname = aname;
		this.Atel = atel;
		this.Aemail = aemail;
	}
	public Admin(String aaccount, String apsw) {
		this.Aaccount = aaccount;
		this.Apsw = apsw;
	}
	public Admin(int aid, String apsw) {
		this.Aid = aid;
		this.Apsw = apsw;
	}
	public Admin(int aid) {
		this.Aid = aid;
	}
	public int getAid() {
		return Aid;
	}
	public void setAid(int aid) {
		Aid = aid;
	}
	public String getAname() {
		return Aname;
	}
	public void setAname(String aname) {
		Aname = aname;
	}
	public String getAaccount() {
		return Aaccount;
	}
	public void setAaccount(String aaccount) {
		Aaccount = aaccount;
	}
	public String getApsw() {
		return Apsw;
	}
	public void setApsw(String apsw) {
		Apsw = apsw;
	}
	public String getAtel() {
		return Atel;
	}
	public void setAtel(String atel) {
		Atel = atel;
	}
	public String getAemail() {
		return Aemail;
	}
	public void setAemail(String aemail) {
		Aemail = aemail;
	}
	public Date getAdate() {
		return Adate;
	}
	public void setAdate(Date adate) {
		Adate = adate;
	}
	
}
