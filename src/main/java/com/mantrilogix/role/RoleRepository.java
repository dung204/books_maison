package com.mantrilogix.role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mantrilogix.role.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}