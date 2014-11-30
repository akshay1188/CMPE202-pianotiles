import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ReceiverSlow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReceiverSlow implements Receiver
{
    public void setMode(){
        Score.getInstance().setStrategy(new Slow());
        Greenfoot.setWorld(new TheWorld());
    }
}
