package com.dailycodebuffer.Springboot.tutorial.service;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;

import com.dailycodebuffer.Springboot.tutorial.entity.Admin;
//import com.dailycodebuffer.Springboot.tutorial.entity.Department;
import com.dailycodebuffer.Springboot.tutorial.repository.AdminRepository;


public interface AdminService {

	Admin saveAdmin(Admin admin);
	
	
}
