package jobManager.chosen.service;


import jobManager.chosen.model.Jobs;
import jobManager.chosen.repo.JobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobsService {
    @Autowired
    private JobsRepository jobsRepository;

    public List<Jobs> allJobs(){
        return jobsRepository.findAll();
    }
    public Optional<Jobs> singleJob(long id){
        return jobsRepository.findJobsById(id);
    }
}
