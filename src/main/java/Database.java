import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Database {

    private Map companyUsers = new HashMap<String, List<User>>();

    private static Database database;

    Database() {
        populateDB();
    }

    public static Database getDatabase() {
        if (database == null){
            return database = new Database();
        }
        return database;
    }

    public Map getCompanyUsers() {
        return companyUsers;
    }



    private void populateDB() {
        User user1 = new User("a", "1");
        User user2 = new User("b", "1");
        User user3 = new User("c", "1");
        List<User> usersCompany1 = new ArrayList<User>();
        usersCompany1.add(user1);
        usersCompany1.add(user2);
        usersCompany1.add(user3);

        User user4 = new User("aq", "2");
        User user5 = new User("bq", "2");
        User user6 = new User("cq", "2");
        List<User> usersCompany2 = new ArrayList<User>();

        companyUsers.put("1", usersCompany1);
        companyUsers.put("2", usersCompany2);
    }
}
