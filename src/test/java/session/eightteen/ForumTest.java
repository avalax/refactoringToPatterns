package session.eightteen;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class ForumTest {

    @Test
    public void shouldCreateTopic() throws Exception {
        Forum forum = new Forum();

        Topic newTopic = forum.createNewTopic("life is strange");

        assertThat(newTopic.name(), equalTo("life is strange"));
    }

    @Test
    public void shouldModifyTopicName() throws Exception {
        Forum forum = new Forum();
        Topic newTopic = forum.createNewTopic("life is strange");

        forum.changeTopicName(newTopic.id(), "life is beautiful");

        assertThat(newTopic.name(), equalTo("life is beautiful"));
    }
}