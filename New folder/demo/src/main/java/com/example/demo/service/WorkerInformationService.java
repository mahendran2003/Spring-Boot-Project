package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.WorkersInformation;
import com.example.demo.repository.WorkersInformationRepository;

import lombok.Getter;
import lombok.Setter;

@Service
@Getter
@Setter
public class WorkerInformationService {
    private WorkersInformationRepository workersInformationRepository;
    
    public WorkerInformationService(WorkersInformationRepository workersInformationRepository) {
        this.workersInformationRepository = workersInformationRepository;
    }
    public WorkersInformation postWorkerInfo(WorkersInformation workersInformation)
    {
        return workersInformationRepository.save(workersInformation);
    }
    public List< WorkersInformation> getWorkerInfo()
    {
        return workersInformationRepository.findAll();
    }

}
