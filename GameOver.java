import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
    public GameOver(){
        String score = "Gameover\n Your score is "+Score.getScore();
        Color black = new Color(0.0f,0.0f,0.0f);
        Color white = new Color(1.0f,1.0f,1.0f);
        GreenfootImage gameoverImage = new GreenfootImage(score, 25, white, black);
        setImage(gameoverImage);
        Score.resetScore();
    }
    public void act() 
    {
 
    }    
}
