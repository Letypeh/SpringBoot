package com.example.Login.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Login.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{

}
