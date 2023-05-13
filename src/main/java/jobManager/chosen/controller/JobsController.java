package jobManager.chosen.controller;

import jobManager.chosen.model.Jobs;
import jobManager.chosen.repo.JobsRepository;
import jobManager.chosen.service.JobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/jobs")
@CrossOrigin(origins = "http://127.0.0.1:5173")
public class JobsController {
    @Autowired
    private JobsService jobsService;
    @Autowired
    private JobsRepository jobsRepository;

    @GetMapping
    public Page<Jobs> getAllJobs(Pageable pageable, @RequestParam(required = false) String search) {
        if (search != null && !search.isEmpty()) {
            return jobsRepository.findByName(search, pageable);
        } else {
            return jobsRepository.findAll(pageable);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Jobs>> getSingleJob(@PathVariable long id){
        return new ResponseEntity<Optional<Jobs>>(jobsService.singleJob(id),HttpStatus.OK);
    }
}
