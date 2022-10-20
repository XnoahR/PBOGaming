import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    MyWorld m = new MyWorld();
    public GameOver()
    {    

        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 400, 1); 
    }

    public void tampilreward(){
        
        showText("Score "+m.getScore(),350,340);
        if(m.score <=50){
            showText("Great",350,350);
            showText("Score "+m.getScore(),350,300);
        }else if(m.score > 50 && m.score <= 1000){
            showText("Excellent",350,350);
        }else if(m.score > 1000){
            showText("Perfect",350,350);
        }
    }
    
    public void act(){
        showText("Developed by : \n Rio Saputro \n Rizki Dwi R \n Salomo Polanco",600,100);
        showText("Game Over",350,200);
        showText("Press Enter to Try Again",350,250);
        tampilreward();
        if(Greenfoot.isKeyDown("enter")){
            Greenfoot.setWorld(new MyWorld());
            m.score = 0;
        }
    }
}
