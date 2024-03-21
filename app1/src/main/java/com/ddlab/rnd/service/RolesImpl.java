package com.ddlab.rnd.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddlab.rnd.entity.RoleLookup;
import com.ddlab.rnd.repository.RoleRepository;

@Service
public class RolesImpl implements Roles {
	
	@Autowired
	private RoleRepository repo;

	@Override
	public List<RoleLookup> getRoleLookup() {
		Iterable<RoleLookup> iterable = repo.findAll();
		List<RoleLookup> result = new ArrayList<RoleLookup>();
		System.out.println("Result: "+result);
	    iterable.forEach(result::add);
	    return result;
	}

}
