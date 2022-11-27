package adapter.task2;

import java.time.LocalDate;

public class MessageSender {
    public void send(String text, Client user, String country) {
        if (user.getCountry().equals(country) && user.getLastActiveTime().isAfter(LocalDate.now().minusDays(1))) {
            System.out.println("Sending message to " + user.getEmail() + ": " + text);
        } else if (user.getCountry().equals(country)) {
            System.out.println("User " + user.getEmail() + " is inactive");
        } else {
            System.out.println("User " + user.getEmail() + " is not from " + country);
        }
    }
}
