import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sorcerer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sorcerer extends hero
{
    /**
     * Act - do whatever the sorcerer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public sorcerer(){
        GreenfootImage image = getImage();
        image.scale(64,88); 
    }
    public void act()
    {
        sorcerer s = new sorcerer();
        s.attack = 75;
        s.defence = 25;
        Actor i = getOneIntersectingObject(sorcerer.class);
        checkKey(i);
    }
}
