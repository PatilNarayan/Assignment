package com.assignment.CRUD.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Assignment")
@Setter
@Getter
@ToString
public class AssignmentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long AssignmentId;

    private String assignmentString;
}
