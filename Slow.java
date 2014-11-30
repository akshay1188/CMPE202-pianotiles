import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Slow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Slow implements GameStrategy
{
    static private int speed = 40;    
        
    public int calculateSpeed(){
        if(Score.getInstance().getScore() == 0){
            speed = 40;
        }
        if(speed > 50){
            if(Score.getInstance().getScore() % 8 == 0){
                speed+=2;
            }
        }else{
            if(Score.getInstance().getScore() % 4 == 0){
                speed+=2;
            }
        }
        return speed;
    }
}
