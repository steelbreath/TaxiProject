package main.java.com.solvd.taxi.enums;

public enum OrderPriority {
    HIGH("high"),
    MEDIUM("medium"),
    LOW("low");

    private final String value;

    OrderPriority(String value){
        this.value=value;
    }

    public String getValue() {
        return value;
    }
}
