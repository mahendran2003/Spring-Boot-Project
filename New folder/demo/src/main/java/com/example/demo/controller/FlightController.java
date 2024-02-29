package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Flight;
import com.example.demo.service.FlightService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;





@RestController
public class FlightController {
    private FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }
    @PostMapping("path/flight")
    public Flight postMethodName(@RequestBody Flight flight) {

        
        return  flightService.postFlight(flight);
    }
    @GetMapping("path/get/Flight")
    public List<Flight> getMethodName() {
        return flightService.getFlight();
    }
    @GetMapping("path/sort/{name}")
    public List<Flight> getMod(@PathVariable String name) {
        return flightService.pageSort(name);
    }
    
    @GetMapping("page/{offset}/{pageSize}")
    public List<Flight> getName(@PathVariable int offset, @PathVariable int pageSize) {
        return flightService.pageFlight(offset, pageSize);
    }
    @GetMapping("page/{offset}/{pageSize}/{name}")
    public Page<Flight> getMethod(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String name) {
        return flightService.pageDis(offset,pageSize,name);
    }
    
    
    
    
}
