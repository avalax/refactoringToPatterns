package session.eightteen;

import session.eightteen.logging.Nsa;

import java.util.HashMap;
import java.util.Map;

public class Forum {
    private Map<Double, Topic> topics;

    public Forum() {
        topics = new HashMap<Double, Topic>();
        Nsa.enableLogging();
    }

    public Topic createNewTopic(String aTopicName) {
        double newTopicId = Math.random() * 1000000;
        Topic topic = new Topic(newTopicId, aTopicName);
        topics.put(topic.id(), topic);
        return topic;
    }

    public void changeTopicName(Double aTopicId, String aTopicName) {
        topics.get(aTopicId).changeName(aTopicName);
    }
}
