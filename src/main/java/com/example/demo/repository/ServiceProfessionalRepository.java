package com.example.demo.repository;

import com.example.demo.model.ServiceProfessional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceProfessionalRepository extends CrudRepository<ServiceProfessional, Integer> {

}