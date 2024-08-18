package august.ex_17082024.enums;

public enum APIConstants {

    BASE_URL("https://app.vwo.com"),
    LOGIN_PAGE("https://app.vwo.com/login"),
    DASHBOARD_PAGE("https://app.vwo.com/dashboard"),
    CHATBOT_PAGE("https://app.vwo.com/chat");

    private final String name;

    APIConstants(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
