import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 4;
    
    public static Bullet main;
    public void move(int speed){
        setLocation(getX() + speed, getY());
    }
    public void Destroyed(){
        if(getX() >= 699 || isTouching(musuh.class)){
            removeTouching(musuh.class);
            getWorld().removeObject(this);
        }
        
    }
    public void act() 
    {
      
        move(speed);
        Destroyed();
       
    } 

}
