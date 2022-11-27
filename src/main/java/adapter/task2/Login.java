package adapter.task2;

import java.time.LocalDate;

public class Login {
    public Client login(String loginMethod, String email, String country, LocalDate lastActiveTime) {
        if (loginMethod.equals("twitter")) {
            return new TwitterClient(new TwitterUser(email, country, lastActiveTime.toString()));
        } else if (loginMethod.equals("facebook")) {
            return new FacebookClient(new FacebookUser(email, Country.valueOf(country), lastActiveTime));
        }
        throw new IllegalArgumentException("Unknown login method");

    }
}
