package com.example.demo.controller;

import com.example.demo.model.ServiceProfessional;
import com.example.demo.service.ServiceProfessionalService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<ServiceProfessional> getServiceProfessional() {
        return serviceProfessionalService.getServiceProfessional();
    }

    @PostMapping(value = "/saveserviceProfessional")
    public void save(@RequestBody ServiceProfessional serviceprofessional){
        serviceProfessionalService.save(serviceprofessional);
    }

}
