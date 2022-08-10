package RobotFighting;

public class PrintMenu extends GetValueFromConsole{
    public static void printRobotMenu(String value)  { System.out.println(value);
    }

    public static boolean isChekHP(Robot robotFirst, Robot robotSecond){
        if (robotFirst.getHeadPoint() == 0){
            printWinResult(robotFirst, robotSecond);
            return false;
        }else if(robotSecond.getHeadPoint() == 0){
            printWinResult(robotSecond, robotFirst);
            return false;
        }else {
            return true;
        }

    }

    public static void printWinResult(Robot robot_1, Robot robot_2){
        System.out.println(robot_1.getRobotName() + " - was killed");
        System.out.println(robot_2.getRobotName() +" - Win !!!");
        System.out.println("---------");
        System.out.println(robot_2.getRobotName()+" , "+robot_2.getHeadPoint());
        System.out.println("---------");
    }

    public static void printResultAfterEachTwoShots(Robot robotFirst, Robot robotSecond){
        System.out.println("---------");
        System.out.println(robotFirst.getRobotName() + " , "+ robotFirst.getHeadPoint());
        System.out.println(robotSecond.getRobotName() + " , "+ robotSecond.getHeadPoint());
        System.out.println("---------");
    }

}
