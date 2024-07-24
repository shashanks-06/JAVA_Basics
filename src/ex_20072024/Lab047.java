package ex_20072024;

import java.util.Scanner;

public class Lab047 {
    public static void main(String[] args) {

        // Web Automation
        // I will ask user which browser you want me to run the code.
        // chrome -> start chrome, firefox -> firefox, edge -> execution edge

        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the browser name in which you want to execute the code");
        String browserName = cin.next();
        browserName = browserName.toLowerCase();

        switch(browserName){
            case "chrome":
                System.out.println("Starting the Chrome browser");
                // Further code to start the Chrome
                // Webdriver driver = new Chrome(); // Selenium Code
                break;
            case "fireFox":
                System.out.println("Starting the FireFox browser");
                // Further code to start the Chrome
                // Webdriver driver = new Chrome(); // Selenium Code
                break;
            case "edge":
                System.out.println("Starting the Edge browser");
                // Further code to start the Chrome
                // Webdriver driver = new Chrome(); // Selenium Code
                break;
            default:
                System.out.println("No idea which browser it is !!!");

        }
    }
}
