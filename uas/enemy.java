import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy extends Actor
{
    /**
     * Act - do whatever the enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public static int randomNumberGenerator(int min, int max){
        Random r = new Random();
        double randomNum = r.nextDouble();
        int result = (int)(randomNum * (max - min)) + min;
        return result;
    }
    
    public void move(int speed){
        setLocation(getX()+ speed, getY());
        if(getY()>=300 && getY()<=600){
            //setLocation(getX()+ speed, getY());
            setLocation(Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(300));
            
        }
    }
    
    public void act()
    {

    }
}
