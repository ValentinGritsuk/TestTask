import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) {
        User user1 = new User("a", "1");
        User user2 = new User("b", "1");
        User user3 = new User("c", "2");

        User IM_NOT_EXIST = new User("bbbbb", "123");

        Response response = HttpServer.call(user1,user2);
        System.out.println(response);

        Response response1 = HttpServer.call(user1, IM_NOT_EXIST);
        System.out.println(response1);

        Response response2 = HttpServer.call(user1, user3);
        System.out.println(response2);
    }
}
