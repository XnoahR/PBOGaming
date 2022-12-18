import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class knight1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class knight1 extends hero
{
    /**
     * Act - do whatever the knight1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public knight1(){
        GreenfootImage image = getImage();
        image.scale(64,88); 
    }

    public void act()
    {
        knight1 a = new knight1();
        Actor i = getOneIntersectingObject(knight1.class);
        checkKey(i);
        melee();
    }
    


}
