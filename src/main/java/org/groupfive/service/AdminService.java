package org.groupfive.service;

import org.groupfive.entity.Admin;

public interface AdminService {
	/**
	 * 判斷是否能夠登陸成功
	 * @param admin
	 * @return
	 */
	public Admin login(Admin admin);
}
