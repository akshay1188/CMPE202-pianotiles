import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TheWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TheWorld extends World
{
    boolean isPaused = true;
    /**
     * Constructor for objects of class TheWorld.
     * 
     */
    public TheWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(200, 400, 1, false); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        
        Row row0 = new Row(0,-100);

        Row row1 = new Row(0,0);

        Row row2 = new Row(0,100);

        Row row3 = new Row(0,200);

        Row row4 = new Row(0,300);
        addObject(row0,0,-100);
        addObject(row1,0,0);
        addObject(row2,0,0);
        addObject(row3,0,0);
        addObject(row4,0,0);

        Tile tile01 = new Tile();
        Tile tile02 = new Tile();
        Tile tile03 = new Tile();      
        Tile tile04 = new Tile();

        row0.addTile(tile01);
        row0.addTile(tile02);
        row0.addTile(tile03);
        row0.addTile(tile04);

        Tile tile1 = new Tile();
        Tile tile2 = new Tile();
        Tile tile3 = new Tile();      
        Tile tile4 = new Tile();

        row1.addTile(tile1);
        row1.addTile(tile2);
        row1.addTile(tile3);
        row1.addTile(tile4);

        Tile tile5 = new Tile();
        Tile tile6 = new Tile();
        Tile tile7 = new Tile();      
        Tile tile8 = new Tile();

        row2.addTile(tile5);
        row2.addTile(tile6);
        row2.addTile(tile7);
        row2.addTile(tile8);

        Tile tile9 = new Tile();
        Tile tile10 = new Tile();
        Tile tile11 = new Tile();      
        Tile tile12 = new Tile();

        row3.addTile(tile9);
        row3.addTile(tile10);
        row3.addTile(tile11);
        row3.addTile(tile12);

        Tile tile13 = new Tile();
        Tile tile14 = new Tile();
        Tile tile15 = new Tile();      
        Tile tile16 = new Tile();

        row4.addTile(tile13);
        row4.addTile(tile14);
        row4.addTile(tile15);
        row4.addTile(tile16);

        Points points = new Points();
        addObject(points, 180, 20);

        Score.getInstance().attach(points);
    }
}
