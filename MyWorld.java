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
        super(720, 480, 1); 
        GreenfootImage bg = new GreenfootImage("C:/Users/LENOVO/Downloads/SCENE 1_Goji Town.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        sorcerer s = new sorcerer(5,5,70,35);
        s.SizeSet();
        addObject( s, 0, 300);
        Fire fireball = new Fire();
        addObject(fireball,150,300);
        reaper1 reaper = new reaper1(10,75,-1);
        reaper.SizeSet();
        addObject(reaper,600,300);
        golem1 golem = new golem1(10,75,-1);
        golem.SizeSet();
        addObject(golem,600,150);
        //char1 c = new char1();
        //addObject(c,50,300);
    }
    
    public void act(){
        if(Greenfoot.getRandomNumber(750) < 5){
            addObject( new reaper1(), 700 , Greenfoot.getRandomNumber(200) +200);
            
        }
        else if(Greenfoot.getRandomNumber(1000) < 5){
            addObject( new golem1(), 700 , Greenfoot.getRandomNumber(200) +200);
        }
    }


}
