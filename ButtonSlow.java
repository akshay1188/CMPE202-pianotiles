import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonSlow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonSlow extends Actor implements Invoker
{
    private Command command;
    /**
     * Act - do whatever the ButtonSlow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)) {
            invoke();
        }
    }    
    
    public void setCommand(Command c){
        this.command = c;
    }
    
    public void invoke(){
        this.command.execute();
    }
}
