package com.example.demo.repository;

import com.example.demo.model.ServiceProfessional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceProfessionalRepository extends JpaRepository<ServiceProfessional, Integer> {

}