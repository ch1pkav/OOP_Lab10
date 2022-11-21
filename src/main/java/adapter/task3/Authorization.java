package adapter.task3;

public class Authorization extends Авторизація {
    public boolean authorize(БазаДаних db) {
        db.отриматиДаніКористувача();
        return true;
    }
}
