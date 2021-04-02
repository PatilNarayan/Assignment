package com.assignment.CRUD.repository;

import com.assignment.CRUD.entity.AssignmentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentRepo extends JpaRepository<AssignmentModel,Long> {
}
