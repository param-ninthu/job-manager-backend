package jobManager.chosen.repo;

import jobManager.chosen.model.Jobs;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.domain.Pageable;


import java.util.Optional;

public interface JobsRepository extends MongoRepository<Jobs, ObjectId> {
    Page<Jobs> findByName(String name, Pageable pageable);
    Optional<Jobs> findJobsById(long id);
}
