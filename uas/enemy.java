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
    public int movespeed;
    
    enemy(){
        this.attack = 10;
        this.health = 100;
        this.movespeed = 2;
    }
    
    enemy(int attack,int health,int movespeed){
        this.attack = attack;
        this.health = health;
        this.movespeed = movespeed;
    }
    
    
    public void act()
    {

    }
}
