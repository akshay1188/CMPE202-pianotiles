import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score {
    static private int score = 0;
    
    public static int getScore(){
        return score;
    }
    
    public static void incrementScore(){
        score++;
    }
    
    public static void resetScore(){
        score = 0;
    }
}
