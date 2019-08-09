import java.util.List;
import java.util.Map;

public class HttpServer {

    private static Map<String, List<User>> db = Database.getDatabase().getCompanyUsers();

    public static Response call(User searcher, User desired) {
        if (db.containsKey(searcher.companyId) && db.containsKey(desired.companyId)) {
            if (searcher.companyId.equals(desired.companyId)) {
                    return Response.SUCCESS;
            } else {
                return Response.ACCESS_DENIED;
            }
        }
        return Response.NOT_FOUND;
    }
}
