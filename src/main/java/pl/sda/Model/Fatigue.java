package pl.sda.Model;

public enum Fatigue {

    TIRED("tired"), NOTTIRED("nottired"), SLEEPING("sleeping");

    private String title;

    Fatigue(String title) {
        this.title = title;
    }


}
