package com.example.demo.controller;

import com.example.demo.model.TimeSlot;
import com.example.demo.service.TimeSlotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class TimeSlotController {

    @Autowired
    private TimeSlotService timeSlotService;

    @GetMapping("/timeSlots")
    public List<TimeSlot> getTimeSlotsInRange(@RequestParam(value = "startDate") LocalDate startDate,
                                              @RequestParam(value = "endDate") LocalDate endDate,
                                              @RequestParam(value = "serviceProfessionalId") Integer serviceProfessionalId) {
        System.out.println("endDate: " + endDate);
        return timeSlotService.getTimeSlotsInRange(startDate, endDate, serviceProfessionalId);
    }
}
