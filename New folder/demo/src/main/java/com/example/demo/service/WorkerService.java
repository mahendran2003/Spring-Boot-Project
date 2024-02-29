package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Workers;
import com.example.demo.repository.WorkersRepository;

import lombok.Getter;
import lombok.Setter;

@Service
@Getter
@Setter
public class WorkerService {
    private WorkersRepository workersRepository;
    
    public WorkerService(WorkersRepository workersRepository) {
        this.workersRepository = workersRepository;
    }
    public Workers postWork(Workers workers)
    {
        return workersRepository.save(workers);
    }
    public List<Workers> getWorker()
    {
        return workersRepository.findAll();
    }
}
