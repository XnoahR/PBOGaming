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
    private int Yspeed = 3;
    private int Xspeed = 3;
    public knight1(){
        GreenfootImage image = getImage();
        image.scale(64,88); 
    }

    public void act()
    {
        knight1 a = new knight1();
        Actor i = getOneIntersectingObject(knight1.class);
        checkKey();
    }
    
        public void checkKey(){
    if(Greenfoot.isKeyDown("left")){
        if(getX()>=0){
            setLocation(getX() -2, getY());}
    }
    if(Greenfoot.isKeyDown("right")){
        if(getX()<=1270){
            setLocation(getX() +2, getY());}
    }
    if(Greenfoot.isKeyDown("up")){        
        if(getY()>=0){
            setLocation(getX(), getY()-2);
        }
    }
    if(Greenfoot.isKeyDown("down")){        
        if(getY()<=400){
            setLocation(getX(), getY()+2);
        }
    }
    
    }
}
