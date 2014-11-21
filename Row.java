import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.util.ArrayList;
/**
 * Write a description of class Row here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Row extends Actor implements Movable
{
    private ArrayList<Tile> tiles = new ArrayList<Tile>();
    private int x,y;
    static final int MAX_NO_OF_TILES = 4;
    static final int TILE_WIDTH = 50;
    static final int TILE_HEIGHT = 100;
    public Row(int xc, int yc){
        x = xc;
        y = yc;
    }
    
    public void act() 
    {
        moveDown();
        Tile t = (Tile)tiles.get(0);
        if(t.getY() >= 450){
            x = 0;
            for(int i = 0; i < tiles.size(); i++){
                Tile tile = (Tile)tiles.get(i);
                tile.setLocation(x+(TILE_WIDTH)/2,-50);
                x = x + TILE_WIDTH;
            }    
        }    
    }    
    
    public void addTile(Tile t){
        if(tiles.size() < MAX_NO_OF_TILES){
            tiles.add(t);
            if(tiles.size() == MAX_NO_OF_TILES){
                positionTiles();
            }
        }else{
            System.out.println("A row can have maximum 4 tiles");
        }
    }
    
    public void removeTile(Tile t){
        tiles.remove(t);
    }
    
    public void moveDown(){
        for(int i = 0; i < tiles.size(); i++){
            Tile t = (Tile)tiles.get(i);
            t.moveDown();
        }
    }
    
    private void moveDownOneRow(){
        Tile tile = (Tile)tiles.get(0);
        while(tile.getY() < 450){
            for(int i = 0; i < tiles.size(); i++){
                Tile t = (Tile)tiles.get(i);
                t.moveDown();
            }
        }
    }
    
    private void positionTiles(){
        for(int i = 0; i < tiles.size(); i++){
            Tile t = (Tile)tiles.get(i);
            t.setColor("white");
            t.setRow(this);
            getWorld().addObject(t,x+(TILE_WIDTH)/2,y+(TILE_HEIGHT)/2);
            x = x + TILE_WIDTH;
        }
        Tile t = tiles.get(Greenfoot.getRandomNumber(3));
        t.setColor("Black");
    }
    
    public void update(){
        System.out.println("updating");
        moveDownOneRow();
    }
}
