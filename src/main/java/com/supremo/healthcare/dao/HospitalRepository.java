package com.supremo.healthcare.dao;

import com.supremo.healthcare.model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital,String> {

}
