import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class musuh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class musuh2 extends Actor
{
    

    
    public static int randomNumberGenerator(int min, int max){
        Random r = new Random();
        double randomNum = r.nextDouble();
        int result = (int)(randomNum * (max - min)) + min;
        return result;
    }

    int speed = -3;
    public void gerak(int speed){
        setLocation(getX()+speed, getY());
        if(getY()>700){
            setLocation(Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(50));
            
        }
        if(getX()>160){
                getWorld().removeObject(this);
            }
    }

    public void act()
    {
        gerak(speed);
 

    }
}
