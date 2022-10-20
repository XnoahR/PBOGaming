import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public boolean isMoving = true;
    static int score = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 400, 1); 
        Character c = new Character();
        addObject(c,50,300);
        tampilscore();
       
    }
    public static int getScore(){
        return score;
    }
    public void addScore(int points){
        score = score + points;
        tampilscore();
    }
    public void tampilscore(){
        showText("Score :"+score, 100,25);
    }

    
    public void act(){
        
        MyWorld bg = new MyWorld();
        
        if(Greenfoot.getRandomNumber(150) < 1){
            addObject( new musuh(), 700 , Greenfoot.getRandomNumber(200) +200);
            addObject( new musuh2(), 700 , Greenfoot.getRandomNumber(200) +200);
        }
        
    }
}

