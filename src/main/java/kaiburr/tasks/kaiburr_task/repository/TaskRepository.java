package kaiburr.tasks.kaiburr_task.repository;

import kaiburr.tasks.kaiburr_task.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends MongoRepository<Task, Integer> {
}

