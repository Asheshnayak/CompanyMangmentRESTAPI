package com.jsp.company_managment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.company_managment.entity.Role;

public interface RoleRepository extends JpaRepository<Role,Long>  {
	public Role findByName(String name);
}
