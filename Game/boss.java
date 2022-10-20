import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class musuh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class boss extends Actor
{
    
    public int tahan = 30;
    private int jeda = 0;
    

    int speed = 5;
    public void gerak(int speed){
        setLocation(getX()+speed, getY());
        if(getY()>700){
            setLocation(Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(50));
            
        }
        if(getX()>500){
                getWorld().removeObject(this);
            }
    }

    public void act()
    {
        gerak(speed);
        //kena();
        if(tahan==0){
            tahan = 30;
        }
    }
}
