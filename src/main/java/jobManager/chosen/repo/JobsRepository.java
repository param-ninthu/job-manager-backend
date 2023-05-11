package jobManager.chosen.repo;

import jobManager.chosen.model.Jobs;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface JobsRepository extends MongoRepository<Jobs, ObjectId> {
    Optional<Jobs> findJobsById(long id);
}
