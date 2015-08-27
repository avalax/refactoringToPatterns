package session.eightteen;

import session.eightteen.logging.Nsa;

public class Topic {
    private String name;
    private Double id;

    public Topic(Double aTopicId, String aTopicName) {
        this.id = aTopicId;
        this.name = aTopicName;
        if (Nsa.loggingEnabled()) {
            Nsa.log("added: " + aTopicName);
        }
    }

    public String name() {
        return name;
    }

    public void changeName(String newTopicName) {
        this.name = newTopicName;
        if (Nsa.loggingEnabled()) {
            Nsa.log("changed: " + newTopicName);
        }
    }

    public Double id() {
        return id;
    }
}
