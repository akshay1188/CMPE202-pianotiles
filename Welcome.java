import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Welcome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Welcome extends World
{

    /**
     * Constructor for objects of class Welcome.
     * 
     */
    public Welcome()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(200, 400, 1); 
        prepare();
        Greenfoot.start();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        //        GameStart gamestart2 = new GameStart(new Start());
        //        addObject(gamestart2, 106, 350);
        ButtonFast buttonFast = new ButtonFast();
        addObject(buttonFast, 58, 344);
        
        ButtonSlow buttonSlow = new ButtonSlow();
        addObject(buttonSlow, 144, 344);
        
        Command commandSlow = new ConcreteCommand();
        Command commandFast = new ConcreteCommand();
        
        commandSlow.setReceiver(new ReceiverSlow());
        commandFast.setReceiver(new ReceiverFast());
        
        buttonFast.setCommand(commandFast);
        buttonSlow.setCommand(commandSlow);
        
    }
 }
