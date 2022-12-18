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
    
    private int Yspeed = 3;
    private int Xspeed = 3;
    
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
    
    public void checkKey(Actor i){
        if(Greenfoot.isKeyDown("left")){
            if(getX()>=0){
                setLocation(getX() -2, getY());}
        }
        if(Greenfoot.isKeyDown("right")){
            if(getX()<=1270){
                setLocation(getX() +2, getY());}
        }
        if(Greenfoot.isKeyDown("up")){        
            if(getY()>=300){
                setLocation(getX(), getY()-2);
            }
        }
        if(Greenfoot.isKeyDown("down")){        
            if(getY()<=600){
                setLocation(getX(), getY()+2);
            }
        }
    
    }
}
