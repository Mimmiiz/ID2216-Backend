package com.example.demo.controller;

import com.example.demo.model.ServiceProfessional;
import com.example.demo.service.ServiceProfessionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ServiceProfessionalController {

    @Autowired
    private ServiceProfessionalService serviceProfessionalService;

    @GetMapping("/serviceProfessionals")
    public ServiceProfessional getServiceProfessional(@RequestParam(value = "id") Integer id) {
        return serviceProfessionalService.getServiceProfessionalById(id);
    }

    @GetMapping(value = "/allserviceprofessionals")
    public List<ServiceProfessional> getServiceProfessional(@RequestParam(value = "service_subcategory") String subCategory) {
        return serviceProfessionalService.getServiceProfessional(subCategory);
    }

    @PostMapping(value = "/saveserviceProfessional")
    public ResponseEntity<String> save(@RequestBody ServiceProfessional serviceprofessional){
        try {
            serviceProfessionalService.save(serviceprofessional);
        } catch (Exception e) {
            return new ResponseEntity<>("{}", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>("{}", HttpStatus.OK);
    }

}
