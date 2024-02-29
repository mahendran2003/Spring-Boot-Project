package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Workers;
import com.example.demo.service.WorkerService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;




@RestController
public class WorkersController {
    private WorkerService workerService;

   
    public WorkersController(WorkerService workerService) {
        this.workerService = workerService;
    }
    
    @PostMapping("path/worker")
    public Workers postMethodName(@RequestBody Workers workers) {
        return workerService.postWork(workers);
    }
    @GetMapping("path/get/work")
    public List<Workers> getMethodName() {
        return workerService.getWorker();
    }
    
    
}
