import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CommandFast here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConcreteCommand implements Command
{
    private Receiver receiver;
    
    public void execute(){
        this.receiver.setMode();
    }
    
    public void setReceiver(Receiver r){
        this.receiver = r;   
    }
}
