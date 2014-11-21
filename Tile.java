import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tile extends Actor
{
    private boolean isBlack = false;
    private boolean isWhite = false;
    
    private Row parentRow;
    private int speed = 4;
    /**
     * Act - do whatever the Tile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Tile(){

    }
    
    public void setRow(Row row){
        parentRow = row;
    }
    
    public Row getRow(){
        return parentRow;
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            if(isBlack){
                System.out.println("Black");
                setColor("grey");
                //parentRow.update();
            }
        }
    }    
    
    public void setColor(String s){
        if(s.equalsIgnoreCase("black")){
            setImage("black_tile.png");
            isBlack = true;
            isWhite = false;
        }else if(s.equalsIgnoreCase("white")){
            setImage("white_tile.png");
            isWhite = true;
            isBlack = false;
        }else if(s.equalsIgnoreCase("grey")){
            setImage("grey_tile.png");
            isWhite = false;
            isBlack = false;
        }
    }
    
    public boolean isBlack(){
        return isBlack;
    }
    
    public boolean isWhite(){
        return isWhite;
    }
    
    public void moveDown(){
        setLocation(getX(),getY() + speed);
    }
}
