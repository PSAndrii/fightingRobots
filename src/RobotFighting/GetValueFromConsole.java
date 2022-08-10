package RobotFighting;

import java.util.Scanner;

public class GetValueFromConsole {

    public static String getStringFromConsoleToMenu(){
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.next();
        }catch (Exception e){
            return "error "+e.getMessage();
        }
    }

    public static String getStringFromConsoleToMenuAction(){
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.next().toUpperCase();
        }catch (Exception e){
            return "error "+e.getMessage();
        }
    }
}
