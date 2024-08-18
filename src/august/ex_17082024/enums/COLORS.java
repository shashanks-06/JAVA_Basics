package august.ex_17082024.enums;

public enum COLORS {

    RED("#ff0000"),
    GREEN("#f0d0d0d"),
    BLUE("#f0e0e0e");

    private final String hexValue;

    COLORS(String hexValue){
        this.hexValue = hexValue;
    }

    public String getHexValue(){
        return hexValue;
    }
}
