package august.ex_17082024.enums;

// ENUMS
// Used to store some kind of static constant values aside
// It becomes accessible to everyone (public utility)
// Accessible in every package

public class Lab111 {
    public static void main(String[] args) {
        System.out.println("Bugs Priority level is " +BUG.MEDIUM+ "\n");

        System.out.println("I'm working on "+ PAGES.CHATBOTPAGE+ "\n");

        System.out.println("Color code of " +COLORS.RED+ " is "+COLORS.RED.getHexValue());
        System.out.println("Color code of " +COLORS.GREEN+ " is "+COLORS.GREEN.getHexValue());
        System.out.println("Color code of " +COLORS.BLUE+ " is "+COLORS.BLUE.getHexValue()+ "\n");

        System.out.println("I'm working on "+APIConstants.BASE_URL+ " on " +APIConstants.BASE_URL.getName());
        System.out.println("I'm working on "+APIConstants.LOGIN_PAGE+ " on " +APIConstants.LOGIN_PAGE.getName());
        System.out.println("I'm working on "+APIConstants.DASHBOARD_PAGE+ " on " +APIConstants.DASHBOARD_PAGE.getName());
        System.out.println("I'm working on "+APIConstants.CHATBOT_PAGE+ " on " +APIConstants.CHATBOT_PAGE.getName()+ "\n");
    }
}
