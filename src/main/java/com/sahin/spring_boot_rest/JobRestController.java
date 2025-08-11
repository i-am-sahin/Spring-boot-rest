package com.sahin.spring_boot_rest;


import com.sahin.spring_boot_rest.model.JobPost;
import com.sahin.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobRestController {

    @Autowired
    private JobService jobService;

    @GetMapping("jobPosts")
//    @ResponseBody -->annotation in Spring Boot tells a controller method to directly write its return value to the HTTP response body,
    public List<JobPost> getAllJobs() {
        return jobService.getAllJobs();
    }
}
