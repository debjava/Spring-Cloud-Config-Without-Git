package com.ddlab.rnd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ddlab.rnd.entity.RoleLookup;

@Repository
public interface RoleRepository extends CrudRepository<RoleLookup, Integer> {

}
