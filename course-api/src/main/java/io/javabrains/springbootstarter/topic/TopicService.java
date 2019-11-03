package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	List<Topic> topicsList = new ArrayList<>();
	{
		topicsList.add(new Topic(1, "Spring1", "Spring Description1"));
		topicsList.add(new Topic(2, "Spring2", "Spring Description2"));
		topicsList.add(new Topic(3, "Spring3", "Spring Description3"));
		topicsList.add(new Topic(4, "Spring4", "Spring Description4"));
	}
	
	
	public List<Topic> getAllTopics(){
		return topicsList;
	}


	public Topic getTopic(int id, String name) {
		System.out.println(name);
		for (int i = 0; i < topicsList.size(); i++) {
			if(topicsList.get(i).getId() == id){
				return topicsList.get(i);
			}
		}
		return null;
	}

}
