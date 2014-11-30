import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Score {
    static private int score = 0;
    static private ArrayList<Observer> observers = new ArrayList<Observer>();
    
    private static Score scoreInstance;
    private static GameStrategy strategy;
    
    public void setStrategy(GameStrategy strategy){
        this.strategy = strategy;
    }
    
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
        Greenfoot.setSpeed(40);
    }

    public void incrementScore(){
        StrategyContext ctx = new StrategyContext(strategy);
        int speed = ctx.executeStrategy();
        Greenfoot.setSpeed(speed);
        score++;
        notifyObservers();
    }
    
    public void resetScore(){
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
