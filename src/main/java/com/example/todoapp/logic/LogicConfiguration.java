package com.example.todoapp.logic;

import com.example.todoapp.model.ProjectRepository;
import com.example.todoapp.model.TaskConfigurationProperties;
import com.example.todoapp.model.TaskGroupRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LogicConfiguration {
    @Bean
    ProjectService service(
            final ProjectRepository repository,
            final TaskGroupRepository taskGroupRepository,
            final TaskConfigurationProperties config)
    {
        return new ProjectService(repository, taskGroupRepository, config);
    }
}
