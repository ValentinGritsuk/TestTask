import static org.junit.Assert.*;

public class MainTest {

    @org.junit.Test
    public void main() throws Exception {
        User user1 = new User("a", "1");
        User user2 = new User("a", "11");
        User user3 = new User("a", "2");
        User user4 = new User("a", "2");
        User user5 = new User("a", "3");
        User user6 = new User("a", "3");

        Response response1 = HttpServer.call(user3,user4);
        assertEquals(response1, Response.SUCCESS);
        Response response2 = HttpServer.call(user1,user2);
        assertEquals(response2, Response.NOT_FOUND);
        Response response3 = HttpServer.call(user2,user1);
        assertEquals(response3, Response.NOT_FOUND);
        Response response4 = HttpServer.call(user1,user3);
        assertEquals(response4, Response.ACCESS_DENIED);


    }
}