package org.groupfive.dao;

import org.groupfive.entity.Admin;

public interface AdminDao {
	/**
	 * 判斷是否能夠登陸成功
	 * @param admin
	 * @return
	 */
	public Admin login(Admin admin);
}
