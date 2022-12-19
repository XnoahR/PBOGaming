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
    public int attack;
    public int health;
    public double movespeed;
    
    public static int randomNumberGenerator(int min, int max){
        Random r = new Random();
        double randomNum = r.nextDouble();
        int result = (int)(randomNum * (max - min)) + min;
        return result;
    }
    
    enemy(){
        this.attack = 10;
        this.health = 100;
        this.movespeed = -1;
    }
    
    enemy(int attack,int health,double movespeed){
        this.attack = attack;
        this.health = health;
        this.movespeed = movespeed;
    }
    
    void shot(){
        
    }
    
    public void act()
    {

    }
}
