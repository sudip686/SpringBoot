package COM.CHASE.java.Example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import COM.CHASE.java.Example.topicSevice;
import COM.CHASE.java.Example.model.Topic;

@RestController
@RequestMapping
public class Controller {
	@Autowired
	private topicSevice topicservie;
	@RequestMapping(value = "/topics")
	public List<Topic> getallTopic() {
		return topicservie.getAllTopic();

	}
	@RequestMapping(value = "/topics/{id}")
	public Topic getTopicbyID(@PathVariable long id) {
		return topicservie.getTopicbyID(id);
	}
	@RequestMapping(value = "/topics", method = RequestMethod.POST)
	public void addTopic(@RequestBody Topic topic) {
		topicservie.createTopic(topic);
	}
	@RequestMapping(value = "/topics/{id}", method = RequestMethod.PUT)
	public void updateTopic(@PathVariable long id, @RequestBody Topic topic) {
		topicservie.updateTopic(id, topic);
	}

}
