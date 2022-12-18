import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fire extends Actor
{
    public int firespeed = 5;
    /**
     * Act - do whatever the Fire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Fire(){
        GreenfootImage fireball = getImage();
        turn(180);
        fireball.scale(75,25);
    }
    public void act()
    {
        setLocation(getX() + firespeed, getY());
        if(
    }
}
