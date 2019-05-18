package com.example.courseapidata.course;

import com.example.courseapidata.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class courseController {

    @Autowired
    private courseService mCourseService;

    @RequestMapping(value = "/topics/{topicId}/courses")
    public List<Course> getAllCourses(@PathVariable String topicId) {
        return mCourseService.getCourses(topicId);
    }

    @RequestMapping(value = "/topics/{topicId}/courses/{id}")
    public Course getCourse(@PathVariable String id) {
        return mCourseService.getCourse(id);
    }

    @RequestMapping(value = "/topics/{topicId}/courses}", method = RequestMethod.POST)
    public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
        course.setTopic(new Topic(topicId, "", ""));
        mCourseService.addCourse(course);
    }

    @RequestMapping(value = "/topics/{topicId}/courses/{id}", method = RequestMethod.PUT)
    public void updateCourse(@RequestBody Course course, @PathVariable String topicId, @PathVariable String id) {
        course.setTopic(new Topic(topicId, "", ""));
        mCourseService.updateCourse(course);
    }

    @RequestMapping(value = "/topics/{topicId}/courses/{id}", method = RequestMethod.DELETE)
    public void deleteTopic(@PathVariable String id) {
        mCourseService.deleteCourse(id);
    }
}
