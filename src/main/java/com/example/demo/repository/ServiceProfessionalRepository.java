package com.example.demo.repository;

import com.example.demo.model.ServiceProfessional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceProfessionalRepository extends JpaRepository<ServiceProfessional, Integer> {

    @Query(value = "SELECT s FROM ServiceProfessional s WHERE s.serviceSubcategory = :subCategory")
    List<ServiceProfessional> findByServiceSubcategory(@Param("subCategory") String subCategory);
}