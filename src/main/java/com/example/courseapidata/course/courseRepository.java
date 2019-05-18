package com.example.courseapidata.course;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

public interface courseRepository extends CrudRepository<Course, String> {
    List<Course> findByTopicId(String topicId);
}
