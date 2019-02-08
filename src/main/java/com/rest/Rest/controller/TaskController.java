package com.rest.Rest.controller;

import com.rest.Rest.entity.Task;
import com.rest.Rest.repo.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import java.util.List;

@RestController
public class TaskController {



    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }





}
