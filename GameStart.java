import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameStart extends Actor implements Command
{   
    Start gameStart;
    
    public GameStart(Start start) {
        this.gameStart = start;
    }
   
    public void execute() {
     gameStart.startGame();
    }
    
     public void act() 
    {
        if(Greenfoot.mouseClicked(this)) {
         execute();
        }
    }
    
    public void setReceiver(Receiver r){
    
    }
}
