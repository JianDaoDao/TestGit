package org.groupfive.service.impl;

import javax.annotation.Resource;

import org.groupfive.dao.AdminDao;
import org.groupfive.entity.Admin;
import org.groupfive.service.AdminService;
import org.springframework.stereotype.Service;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
	@Resource
	private AdminDao adminDao;
	
	public Admin login(Admin admin) {
		return adminDao.login(admin);
	}

}
