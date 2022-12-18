import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Skill extends Actor
{
    public int firespeed = 6;
    /**
     * Act - do whatever the Fire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Skill(){
        GreenfootImage bluefire = getImage();
        turn(180);
        bluefire.scale(75,25);
    }
    public void act()
    {
        setLocation(getX() + firespeed, getY());
    }
}
