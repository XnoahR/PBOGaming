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
    
    public int Yspeed = 3;
    public int Xspeed = 3;
    public int attack;
    public int defence;
    
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
    public void melee(){
        if(isTouching(enemy1.class)){
            removeTouching(enemy1.class);
    }
    
    }
    public void checkKey(Actor i){
        if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a")){
            if(getX()>=0){
                setLocation(getX() -2, getY());}
        }
        if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d")){
            if(getX()<=1270){
                setLocation(getX() +2, getY());}
        }
        if(Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("w")){        
            if(getY()>=165){
                setLocation(getX(), getY()-2);
            }
        }
        if(Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("s")){        
            if(getY()<=375){
                setLocation(getX(), getY()+2);
            }
        }
    
    }
    
    
}
