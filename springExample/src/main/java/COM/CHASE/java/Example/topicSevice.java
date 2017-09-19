package COM.CHASE.java.Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import COM.CHASE.java.Example.model.Topic;

@Service
public class topicSevice {

	private List<Topic> topiclist = new ArrayList<Topic>(Arrays.asList(new Topic(1, "Java", "Language"),
	        new Topic(2, "Spring", "Framework"), new Topic(3, "Hibernate", "ORM")));

	public List<Topic> getAllTopic() {
		return topiclist;
	}

	public Topic getTopicbyID(long id) {
		return topiclist.stream().filter(t -> id == (t.getId())).findFirst().get();
	}

	public void createTopic(Topic topic) {
		for (Topic top : topiclist) {
			if (top.getId() == topic.getId()) {
				System.out.println("Id already exist");
			}
			topiclist.add(topic);
			return;
		}

	}

	public void updateTopic(long id, Topic topic) {
		for (int i = 0; i < topiclist.size(); i++) {
			Topic t = topiclist.get(i);
			if (t.getId() == id) {
				topiclist.set(i, topic);
				return;
			}

		}
	}
}
