import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public boolean isMoving = true;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 400, 1); 
        Character c = new Character();
        addObject(c,50,300);
        //boss Boss = new boss();
        //addObject(Boss,600,400);
       
    }
    
    public void act(){
        
        MyWorld bg = new MyWorld();
        
        if(Greenfoot.getRandomNumber(500) < 1){
            //addObject( new carsatu(), Greenfoot.getRandomNumber(200) +200, 0);
            addObject( new musuh(), 700 , Greenfoot.getRandomNumber(200) +200);
            addObject( new musuh2(), 700 , Greenfoot.getRandomNumber(200) +200);
        }
        
}
        /*if(isMoving == true){
     getWorld().setLocation(getX()-2,getY());*/
    
}

