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
    sorcerer(){
       super(); 
    }
    
    sorcerer(int attack,int defence){
        super(attack,defence);
    }
    sorcerer(int Xspeed,int Yspeed,int attack,int defence){
        super(Xspeed,Yspeed,attack,defence);
    }
   
    
      void SizeSet(){
        GreenfootImage image = getImage();
        image.scale(120,120); 
    }

    public void act()
    {
        sorcerer a = new sorcerer();
        Actor i = getOneIntersectingObject(sorcerer.class);
        checkKey();
    }
    
        
}
