import static org.junit.Assert.*;

public class TestServer {

    @org.junit.Test
    public void testThatWeGotSuccessResponseIfUserExists() {

        User user3 = new User("a", "2");
        User user4 = new User("a", "2");

        Response response1 = HttpServer.call(user3, user4);
        assertEquals(response1, Response.SUCCESS);
    }


    @org.junit.Test
    public void testThatWeGotNotFoundResponseIfUserDoesNotExists() {

        User user1 = new User("a", "1");
        User user2 = new User("a", "11");

        Response response2 = HttpServer.call(user1, user2);
        assertEquals(response2, Response.NOT_FOUND);
        Response response3 = HttpServer.call(user2, user1);
        assertEquals(response3, Response.NOT_FOUND);
    }

    @org.junit.Test
    public void testThatWeGotAccessDeniedResponseIfUserDoesNotHaveAccess() {

        User user1 = new User("a", "1");
        User user3 = new User("a", "2");

        Response response4 = HttpServer.call(user1,user3);
        assertEquals(response4, Response.ACCESS_DENIED);


    }
}