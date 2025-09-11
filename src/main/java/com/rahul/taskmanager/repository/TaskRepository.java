package com.rahul.taskmanager.repository;

import com.rahul.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    // No additional methods required for basic CRUD (inherited from JpaRepository)
}
