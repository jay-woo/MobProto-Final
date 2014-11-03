package grimwootier.com.olinadmissions;

/**
 * Created by wooj on 11/2/14.
 */
public class Account {
    private String username;
    private String password;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String get_username() {
        return username;
    }

    public String get_password() {
        return password;
    }
}