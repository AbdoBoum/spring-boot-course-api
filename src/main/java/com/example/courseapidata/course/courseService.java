package com.example.courseapidata.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class courseService {

    @Autowired
    private courseRepository mCourseRepository;

    public List<Course> getCourses(String topicId) {
        return mCourseRepository.findByTopicId(topicId);
    }

    public Course getCourse(String id) {
        return mCourseRepository.findById(id).get();
    }

    public void addCourse(Course course) {
        mCourseRepository.save(course);
    }

    public void updateCourse(Course course) {
        mCourseRepository.save(course);
    }

    public void deleteCourse(String id) {
        mCourseRepository.deleteById(id);
    }

}
