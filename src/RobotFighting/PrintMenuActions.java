package RobotFighting;

public class PrintMenuActions extends GetValueFromConsole{
    public static void printRobotMenuActions(String name){
        System.out.println("");
        System.out.println("For exit press P");
        System.out.println("A shot at the robot: "+name );
        System.out.println("Your step: press key (QWEASDZXC)");
    }

}