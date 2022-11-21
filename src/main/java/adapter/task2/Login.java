package adapter.task2;

import java.time.LocalDate;

public class Login {
    public Client login(String loginMethod) {
        if (loginMethod.equals("twitter")) {
            return new TwitterClient(new TwitterUser("dobosevych@gmail.com", "Ukraine", "2022-10-10"));
        } else if (loginMethod.equals("facebook")) {
            return new FacebookClient(new FacebookUser("dobosevych@gmail.com", Country.Ukraine, LocalDate.of(2022, 10, 10)));
        }
        throw new IllegalArgumentException("Unknown login method");

    }
}
