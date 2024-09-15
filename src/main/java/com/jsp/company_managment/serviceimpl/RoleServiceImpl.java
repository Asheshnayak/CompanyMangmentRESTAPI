package com.jsp.company_managment.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.company_managment.entity.Role;
import com.jsp.company_managment.repository.RoleRepository;
import com.jsp.company_managment.service.RoleService;
@Service
public class RoleServiceImpl implements RoleService {
	
@Autowired	
private RoleRepository roleRepository;

@Override
public Role createRole(Role role) {
	return roleRepository.save(role);
}



}
