package com.example.todoapp.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Entity
@Table(name= "projects")

public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "Project's description must not be empty")
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "project")
    private Set<TaskGroup> groups;
    @OneToMany(mappedBy = "project")
    private Set<ProjectStep> steps;



    public Project() {
    }
        public int getId() {
            return id;
        }

        void setId(int id) {
            this.id = id;
        }

        public String getDescription() {
            return description;
        }

         void setDescription(String description) {
            this.description = description;
        }

    public Set<TaskGroup> getTaskGroups() {

        return groups;
    }

    public void setTaskGroups(Set<TaskGroup> groups) {

        this.groups = groups;
    }

    public Set<ProjectStep> getSteps() {

        return steps;
    }

    void setSteps(Set<ProjectStep> steps) {

        this.steps = steps;
    }
}