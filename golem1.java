import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class golem1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class golem1 extends enemy
{
    golem1(){
        super();
        SizeSet();
    }
    golem1(int attack,int health,double movespeed){
        super(attack,health,movespeed);
    }

    void SizeSet(){
        GreenfootImage image = getImage();
        image.scale(120,120); 
        getImage().mirrorHorizontally();
    }
    
    public boolean isStopped;
    public void act()
      {
        if(getX()>=145)
        setLocation(getX() + (int)movespeed, getY());
        else if(getX()<145){
            setLocation(getX() + 0, getY());
            isStopped = true;
    }
    if(isStopped){
        
    }
    }
    
   
}
