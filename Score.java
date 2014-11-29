import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Score implements Speed {
    static private int score = 0;
    static private int speed = 40;
    static private ArrayList<Observer> observers = new ArrayList<Observer>();
    
    private static Score scoreInstance;
    
    private Score(){
    }
    
    public static Score getInstance(){
        if(scoreInstance == null){
            scoreInstance = new Score();
        }
        return scoreInstance;
    }
    
    public int getScore(){
        return score;
    }

    public void resetSpeed(){
        speed = 40;
    }
    

    public void ClassicMode()
    {
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
        notifyObservers();
    }
    

    public void ZenMode()
    {
         if(speed > 30){
            if(score % 6 == 0){
                Greenfoot.setSpeed(speed);
                speed+=4;
            }
        }else{
            if(score % 2 == 0){
                Greenfoot.setSpeed(speed);
                speed+=4;
            }
        }
        score+=5;
        notifyObservers();
    }
    /*public static void incrementScore(){
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
    }*/
    
    public static void resetScore(){
        score = 0;
    }
    
    public void reset(){
        resetScore();
        resetSpeed();
    }
    
    public void attach(Observer o){
        observers.add(o);
    }
    
    public void detach(Observer o){
        observers.remove(o);
    }
    
    public void notifyObservers(){
        for(Observer o:observers){
            o.update();
        }
    }
}
