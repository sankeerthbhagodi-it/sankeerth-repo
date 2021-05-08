package com.supremo.healthcare.dao;

import com.supremo.healthcare.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends JpaRepository<Role,String> {
}
