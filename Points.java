import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Points here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Points extends Actor implements Observer
{
    public Points (){
        String score = "0";
        Color black = new Color(0.0f,0.0f,0.0f);
        Color white = new Color(1.0f,1.0f,1.0f);
        GreenfootImage points = new GreenfootImage(score, 20, black, white);
        setImage(points);
    }
    public void act() 
    {
        
    }   
    
    public void update(){
        Color black = new Color(0.0f,0.0f,0.0f);
        Color white = new Color(1.0f,1.0f,1.0f);
        String score = ""+Score.getInstance().getScore();
        GreenfootImage points = new GreenfootImage(score, 20, black, white);
        setImage(points);
    }
}
