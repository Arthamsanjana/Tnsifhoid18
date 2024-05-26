package com.dailycodebuffer.Springboot.tutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dailycodebuffer.Springboot.tutorial.entity.Admin;
import com.dailycodebuffer.Springboot.tutorial.service.AdminService;
//import com.dailycodebuffer.Springboot.tutorial.service.AdminService;


@RestController
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	
	@PostMapping("/admin")
	public Admin saveAdmin(@RequestBody Admin admin) {
		
		return adminService.saveAdmin(admin);
	}

}
