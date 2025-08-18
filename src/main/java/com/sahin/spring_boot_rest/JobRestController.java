package com.sahin.spring_boot_rest;


import com.sahin.spring_boot_rest.model.JobPost;
import com.sahin.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId){
        return jobService.getJob(postId);
    }

    @PostMapping("jobPost")
    public JobPost addJob(@RequestBody JobPost jobPost){

        jobService.addJob(jobPost);
        return jobService.getJob(jobPost.getPostId());
    }
}
