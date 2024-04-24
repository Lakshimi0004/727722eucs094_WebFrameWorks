package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Door;
import com.example.demo.service.DoorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class DoorController {
   @Autowired
    public DoorService dService;

    @PostMapping("/api/door")
    public ResponseEntity<Door> postMethodName(@RequestBody Door c) {
        if(dService.getById(c.getDoorId())!=null){
            return new ResponseEntity<>(dService.getById(c.getDoorId()),HttpStatus.CREATED);
        }
        return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    @GetMapping("/api/door")
    public ResponseEntity<List<Door>> getMethodName() {
        if(dService.get()!=null){
            return new ResponseEntity<>(dService.get(),HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    @GetMapping("/api/door/{doorId}")
    public ResponseEntity<Door> getMethodName(@PathVariable int id) {
        if(dService.getById(id)!=null){
            return new ResponseEntity<>(dService.getById(id),HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @GetMapping("/api/door/accesstype/{accessType}")
    public ResponseEntity<List<Door>> getMethodName(@PathVariable String type) {
        if(dService.getByAccessType(type)!=null){
            return new ResponseEntity<>(dService.getByAccessType(type),HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
}
