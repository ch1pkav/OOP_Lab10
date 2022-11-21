package singleton;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private String email;
    private int age;

    public void save() {
        DBConnection db = DBConnection.getInstance();
        String query = "insert into user (email, name, age) values ('" + email + "', '" + name + "', " + age + ")";
        db.executeQuery(query);
    }
}
