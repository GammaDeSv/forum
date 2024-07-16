package com.example.forum.service;

import com.example.forum.model.Topic;
import com.example.forum.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }

    public Optional<Topic> getTopicById(Long id) {
        return topicRepository.findById(id);
    }

    public Topic createTopic(Topic topic) {
        return topicRepository.save(topic);
    }

    public Topic updateTopic(Long id, Topic topicDetails) {
        Topic topic = topicRepository.findById(id).orElseThrow();
        topic.setTitle(topicDetails.getTitle());
        topic.setMessage(topicDetails.getMessage());
        topic.setStatus(topicDetails.getStatus());
        topic.setAuthor(topicDetails.getAuthor());
        topic.setCourse(topicDetails.getCourse());
        return topicRepository.save(topic);
    }

    public void deleteTopic(Long id) {
        Topic topic = topicRepository.findById(id).orElseThrow();
        topicRepository.delete(topic);
    }
}
