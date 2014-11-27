import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score {
    static private int score = 0;
    static private int speed = 40;
    
    public static int getScore(){
        return score;
    }

    public static void resetSpeed(){
        speed = 40;
    }
    public static void incrementScore(){
        if(speed > 50){
            if(score % 8 == 0){
                Greenfoot.setSpeed(speed);
                speed+=2;
            }
        }else{
            if(score % 4 == 0){
                Greenfoot.setSpeed(speed);
                speed+=2;
            }
        }
        score++;    
    }
    
    public static void resetScore(){
        score = 0;
    }
    
    public static void reset(){
        resetScore();
        resetSpeed();
    }
}
