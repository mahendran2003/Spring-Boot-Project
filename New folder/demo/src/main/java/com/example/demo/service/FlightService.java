package com.example.demo.service;

import java.util.List;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Flight;
import com.example.demo.repository.FlightRepository;

import lombok.Getter;
import lombok.Setter;

@Service
@Getter
@Setter
public class FlightService {
    private FlightRepository flightRepository;
    
    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }
    public Flight postFlight(Flight flight)
    {
        return flightRepository.save(flight);
    }
    public List<Flight> getFlight()
    {
        return flightRepository.findAll();
    }
    public List<Flight> pageSort(String name)
    {
        return flightRepository.findAll(Sort.by(name));
    }
    public List<Flight> pageFlight(int offset,int pageSize)
    {
        return flightRepository.findAll(PageRequest.of(offset, pageSize)).getContent();
    }
    public Page<Flight> pageDis(int offset,int pageSize,String name)
    {
        return flightRepository.findAll(PageRequest.of(offset, pageSize, Sort.Direction.ASC, name));
    }

}
