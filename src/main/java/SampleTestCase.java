import controllers.UserController;
import models.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;
import static org.junit.Assert.*;

public class SampleTestCase {

    private UserController userController;

    @Before
    public void setUp(){
        userController = new UserController();
    }


    @Test
    public  void  testUserInfoResponse(){
        User user = userController.getUserByUserName("maxkolotilkin");
        assertTrue(user.getNode_id().contains("MDQ6VXNlcjIzMzA4NjY4"));

    }

    @Test
    public void testFollowers(){
        User[] followers = userController.getFollowersByUser("Mak0");
        assertTrue(followers.length==31);

    }
}
