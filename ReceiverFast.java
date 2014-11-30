import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ConcreteReceiver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReceiverFast implements Receiver
{    
    public void setMode(){
        Score.getInstance().setStrategy(new Fast());
        Greenfoot.setWorld(new TheWorld());
    }
}
