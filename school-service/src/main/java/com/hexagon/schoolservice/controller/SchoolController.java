package com.hexagon.schoolservice.controller;

import com.hexagon.schoolservice.entity.School;
import com.hexagon.schoolservice.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RequestMapping(value = "/school")
@RestController
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public School addSchool(@RequestBody School school){
        return schoolService.addSchool(school);
    }
    @GetMapping
    public List<School> fetchSchools(){
        return  schoolService.fetchSchools();
    }
    @GetMapping("/{id}")
    public School fetchSchoolById(@PathVariable int id){
        return schoolService.fetchSchoolById(id);
    }
}