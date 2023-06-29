package copiesandviews;

import java.util.Collections;
import java.util.HashMap;

public class SynchronizedCollections {

    public static void main(String[] args) {
        var users = Collections.synchronizedMap(new HashMap<String, User>());
        users.put("kamarbaraka", new User("kamarbaraka", "kamar", "12548", 23));
        var user = users.get("kamarbaraka");
        System.out.println(user);
    }
}

class User{

    private String userName, name, password;
    private int age;

    public User(String userName, String name, String password, int age) {
        this.userName = userName;
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("userName='").append(userName).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
