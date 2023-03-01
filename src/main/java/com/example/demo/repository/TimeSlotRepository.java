package com.example.demo.repository;

import com.example.demo.model.TimeSlot;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TimeSlotRepository extends CrudRepository<TimeSlot, Integer> {

    @Query(value = "SELECT * FROM time_slot WHERE ?1 < date_time AND date_time < ?2 AND service_professional_id = ?3", nativeQuery = true)
    public List<TimeSlot> findTimeSlotsInRange(LocalDate startDate, LocalDate endDate, Integer serviceProfessionalId);
}