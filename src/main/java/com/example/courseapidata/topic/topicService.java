package com.example.courseapidata.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class topicService {

    @Autowired
    private topicRepository mTopicRepository;

    public List<Topic> getTopics() {
        List<Topic> topics = new ArrayList<>();
        mTopicRepository.findAll()
                .forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
        return mTopicRepository.findById(id).get();
    }

    public void addTopic(Topic topic) {
        mTopicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
        mTopicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        mTopicRepository.deleteById(id);
    }
}
