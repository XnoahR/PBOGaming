import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1270, 800, 1); 
        GreenfootImage bg = new GreenfootImage("C:/Users/User/Downloads/SCENE 1_Goji Town.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        addObject( new knight1(), 0, 300);

        //char1 c = new char1();
        //addObject(c,50,300);
    }
    public void act(){
        if(Greenfoot.getRandomNumber(10) < 2){
            addObject( new enemy1(), 700,602);
            
        }
    }

}
