package com.assignment.CRUD.controller;

import com.assignment.CRUD.entity.AssignmentModel;
import com.assignment.CRUD.repository.AssignmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class AssignmentController {

    @Autowired
    private AssignmentRepo assignmentRepo;


    @GetMapping("/assignment")
    public ResponseEntity<List<AssignmentModel>> getAllAssignment() {
        try {
            List<AssignmentModel> list = assignmentRepo.findAll();

            if (list.isEmpty() || list.size() == 0) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/assignment")
    public ResponseEntity<AssignmentModel> saveAssignment(@RequestBody AssignmentModel assignmentModel) {
        try {
            return new ResponseEntity<>(assignmentRepo.save(assignmentModel), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



}
