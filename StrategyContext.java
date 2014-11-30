import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StrategyContext here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StrategyContext
{
    private GameStrategy strategy;
    
    public StrategyContext(GameStrategy strategy){
        this.strategy = strategy;
    }
    
    public int executeStrategy(){
        return this.strategy.calculateSpeed();
    }
}
