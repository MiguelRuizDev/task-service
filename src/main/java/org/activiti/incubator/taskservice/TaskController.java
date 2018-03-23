package org.activiti.incubator.taskservice;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;


import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    TaskRepository db; //injection

    @RequestMapping(path="/tasks/{id}/suspend", method=RequestMethod.POST) //whenever you don't know which one to use
    public Task suspendTask(@PathVariable("id") Long id){
        Task task = db.findById(id).get();

        //change staste
        if(task.getState() == State.ACTIVE){
            task.setState(State.SUSPENDED);
        }else{

        }
        //save modified object in db

        db.save(task);
        return task;
    }



}

