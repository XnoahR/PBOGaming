import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class map3 extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public map3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(720, 480, 1); 
        GreenfootImage bg = new GreenfootImage("D:/Kuliah/Semester_3/PBO/UAS/PBOGaming/uas/images/map3.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        sorcerer s = new sorcerer(5,5,70,35);
        s.SizeSet();
        addObject( s, 0, 300);
        //char1 c = new char1();
        //addObject(c,50,300);
    }
    
    public void act(){
        if(Greenfoot.getRandomNumber(750) < 5){
            addObject( new reaper1(), 700 , Greenfoot.getRandomNumber(200) +200);
            
        }
        if(Greenfoot.getRandomNumber(1000) < 2){
            addObject( new golem1(), 700 , Greenfoot.getRandomNumber(200) +200);
        }
    }


}
