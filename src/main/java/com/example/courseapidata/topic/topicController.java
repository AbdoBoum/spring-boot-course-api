package com.example.courseapidata.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class topicController {

    @Autowired
    private topicService mTopicService;

    @RequestMapping(value = "/topics")
    public List<Topic> getAllTopics() {
        return mTopicService.getTopics();
    }

    @RequestMapping(value = "/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return mTopicService.getTopic(id);
    }

    @RequestMapping(value = "/topics", method = RequestMethod.POST)
    public void addTopic(@RequestBody Topic topic) {
        mTopicService.addTopic(topic);
    }

    @RequestMapping(value = "/topics/{id}", method = RequestMethod.PUT)
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        mTopicService.updateTopic(id, topic);
    }

    @RequestMapping(value = "/topics/{id}", method = RequestMethod.DELETE)
    public void deleteTopic(@PathVariable String id) {
        mTopicService.deleteTopic(id);
    }
}
