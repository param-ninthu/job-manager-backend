package jobManager.chosen.controller;

import jobManager.chosen.model.Jobs;
import jobManager.chosen.service.JobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/jobs")
@CrossOrigin(origins = "http://localhost:3000")
public class JobsController {
    @Autowired
    private JobsService jobsService;

    @GetMapping
    public ResponseEntity<List<Jobs>> getAllJobs(){
        return new ResponseEntity<List<Jobs>>( jobsService.allJobs(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Jobs>> getSingleJob(@PathVariable long id){
        return new ResponseEntity<Optional<Jobs>>(jobsService.singleJob(id),HttpStatus.OK);
    }
}
