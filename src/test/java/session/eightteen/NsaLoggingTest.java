package session.eightteen;

import org.junit.Test;
import session.eightteen.logging.Nsa;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertThat;

public class NsaLoggingTest {

    @Test
    public void shouldCreateTopic() throws Exception {
        Forum forum = new Forum();

        forum.createNewTopic("life is strange");

        assertThat(Nsa.accessLog(), hasItem("added: life is strange"));
    }

    @Test
    public void shouldModifyTopicName() throws Exception {
        Forum forum = new Forum();
        Topic newTopic = forum.createNewTopic("life is strange");

        forum.changeTopicName(newTopic.id(), "life is beautiful");

        assertThat(Nsa.accessLog(), hasItems("added: life is strange", "changed: life is beautiful"));
    }
}