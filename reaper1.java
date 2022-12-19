import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class reaper1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class reaper1 extends enemy
{
    /**
     * Act - do whatever the reaper1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    reaper1(){
    super();
        SizeSet();
    }
    
    reaper1(int attack,int health,double movespeed){
        super(attack,health,movespeed);
    }
    
    public boolean isStopped = false;
    
    void SizeSet(){
        GreenfootImage image = getImage();
        image.scale(120,120); 
        getImage().mirrorHorizontally();
    }
    public void act()
    {
        if(getX()>=400)
        setLocation(getX() + (int)movespeed, getY());
        else if(getX()<400){
            setLocation(getX() + 0, getY());
            isStopped = true;
    }
    
}
}
