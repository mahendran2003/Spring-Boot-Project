package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.WorkersInformation;
import com.example.demo.service.WorkerInformationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;




@RestController
public class WorkerInformationController {
    private WorkerInformationService workerInformationService;

    public WorkerInformationController(WorkerInformationService workerInformationService) {
        this.workerInformationService = workerInformationService;
    }
    @PostMapping("path/workinfo")
    public WorkersInformation postMethodName(@RequestBody WorkersInformation workersInformation) {
        
        return workerInformationService.postWorkerInfo(workersInformation);
    }
    @GetMapping("path/get/workerinfo")
    public List<WorkersInformation> getMethodName() {
        return workerInformationService.getWorkerInfo();
    }
    
    
}
