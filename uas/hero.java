import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hero extends Actor
{
    /**
     * Act - do whatever the hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    public void end(){
        if(getY()>=599||getY()<=0){
            getWorld().removeObject(this);
        }
    }
    public void checkdouble(Actor i){
        if(i != null){
            getWorld().removeObject(i);
        }
    }
}
