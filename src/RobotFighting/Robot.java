package RobotFighting;

import java.util.Random;

public class Robot {


    private int headPoint;
    private String robotName;
    private final String massiveLetters = "QWEASDZXC";
    private String damageLetters;
    private String disabledLettersAfterDamage = "";

    public Robot(String robotName){
        this.setHeadPoint(100);
        this.setRobotName(robotName);
        this.setDamageLetters(getRandomKey());
    }

    public void setDisabledLettersAfterDamage(char disabledLettersAfterDamage) {
        this.disabledLettersAfterDamage = this.disabledLettersAfterDamage+disabledLettersAfterDamage;
    }

    public String getDisabledLettersAfterDamage() {
        return disabledLettersAfterDamage;
    }

    public String getDamageLetters() {
        return damageLetters;
    }

    public void setDamageLetters(String damageLetters) {
        this.damageLetters = damageLetters;
    }

    public String getMassiveLetters() {
        return massiveLetters;
    }

    public void setRobotName(String robotName) {
        this.robotName = robotName;
    }

    public String getRobotName() {
        return robotName;
    }

    public void setHeadPoint(int headPoint) {
        this.headPoint = headPoint;
    }

    public int getHeadPoint() {
        return headPoint;
    }

    String getRandomKey() {
        String massiveLetter = getMassiveLetters();
        String damageL = "";
        char [] chArray = new char [5];
        for (int i = 0; i < chArray.length; i++) {
            int randIdx = new Random().nextInt(massiveLetter.length());
            chArray[i] = massiveLetter.charAt(randIdx);
            massiveLetter = massiveLetter.replace(String.valueOf(chArray[i]), "");
            damageL = damageL+chArray[i];
        }
        return  damageL;
    }


    public void isDamageToRobot(String lettersFromConsole){
        String letterFromConsole ="";
        if(lettersFromConsole.length()>1){
            System.out.println("you entered more than one character, the first one \""+lettersFromConsole.charAt(0)+"\" will be used");
        }
        letterFromConsole += lettersFromConsole.toCharArray()[0];

        if(getDamageLetters().contains(letterFromConsole)){
            for (int i = 0; i <getDamageLetters().length(); i++) {
                if(getDamageLetters().toCharArray()[i] == letterFromConsole.toCharArray()[0]){
                    System.out.println("Good shot!! BaBah. The health of robot 1 decreased for -20");
                    setHeadPoint(getHeadPoint()-20);
                    setDisabledLettersAfterDamage(getDamageLetters().toCharArray()[i]);
                    setDamageLetters(getDamageLetters().replace(String.valueOf(getDamageLetters().toCharArray()[i]), ""));
                }
            }
        }else if(getDisabledLettersAfterDamage().contains(letterFromConsole)){
               for (int i = 0; i < getDisabledLettersAfterDamage().length(); i++) {
                    if(getDisabledLettersAfterDamage().toCharArray()[i] == letterFromConsole.toCharArray()[0]){
                        System.out.println(letterFromConsole.toCharArray()[0]+" is NOT active any more");
                    }
                }
        }else if(getMassiveLetters().contains(letterFromConsole)){
            for (int i = 0; i <getMassiveLetters().toCharArray().length; i++) {
                if(getMassiveLetters().toCharArray()[i] == letterFromConsole.toCharArray()[0]){
                   System.out.println(letterFromConsole.toCharArray()[0]+" Key does not damage");
                }
            }
        }else {
            System.out.println("You are enter wrong letter. try again ");
        }
    }
}
