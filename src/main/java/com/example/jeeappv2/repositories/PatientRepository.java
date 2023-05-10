package com.example.jeeappv2.repositories;

import com.example.jeeappv2.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface PatientRepository extends JpaRepository<Patient,Long> {
    Page<Patient> findByNomContaining(String kw, Pageable pageable);
}
