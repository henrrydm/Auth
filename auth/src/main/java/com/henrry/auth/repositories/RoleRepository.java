package com.henrry.auth.repositories;

import java.util.List;

import com.henrry.auth.models.Role;

import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long>{
    List<Role> findAll();
    
    List<Role> findByName(String name);   
}
