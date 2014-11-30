import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fast here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fast implements GameStrategy
{
    static private int speed = 45;    
        
    public int calculateSpeed(){ 
        if(Score.getInstance().getScore() == 0){
            speed = 45;
        }
        if(speed > 70){
            if(Score.getInstance().getScore() % 12 == 0){
                speed+=4;
            }
        }else{
            if(Score.getInstance().getScore() % 8 == 0){
                speed+=4;
            }
        }
        return speed;
    }
}
