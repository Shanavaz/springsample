package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();	
	}
	
	@RequestMapping("/topic/{id}/{name}")
	public Topic getTopic(@PathVariable int id, @PathVariable String name) {
		return topicService.getTopic(id, name);	
	}
}
