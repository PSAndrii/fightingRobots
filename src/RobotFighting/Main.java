package RobotFighting;

public class Main {

    public static void main(String[] args) {
        String valueChar;
        PrintMenu.printRobotMenu("Enter robot_1 name: ");
        Robot robotFirst = new Robot(GetValueFromConsole.getStringFromConsoleToMenu()) {
        };

        PrintMenu.printRobotMenu("Enter robot_2 name: ");
        Robot robotSecond = new Robot(GetValueFromConsole.getStringFromConsoleToMenu()) {
        };


        Robot workingWithRobot = robotFirst;
        int countForPrintResult = 0;

        do {


            PrintMenuActions.printRobotMenuActions(workingWithRobot.getRobotName());

            valueChar = GetValueFromConsole.getStringFromConsoleToMenuAction();
            if (valueChar.equals("P")) {
                System.out.println("you enter P = exit");
                break;
            } else if (!workingWithRobot.getMassiveLetters().contains(valueChar)) {
                System.out.println("Letter " + valueChar + " not from the list " + workingWithRobot.getMassiveLetters());
                continue;
            } else {
                workingWithRobot.isDamageToRobot(valueChar);
            }

            if (workingWithRobot == robotFirst) {
                workingWithRobot = robotSecond;
            }

            countForPrintResult++;
            if (countForPrintResult == 2) {
                PrintMenu.printResultAfterEachTwoShots(robotFirst, robotSecond);
                countForPrintResult = 0;
            }


        } while (PrintMenu.isChekHP(robotFirst, robotSecond));

    }

}

