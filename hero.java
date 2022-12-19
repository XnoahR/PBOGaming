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
    
    public int Yspeed ;
    public int Xspeed ;
    public int attack;
    public int defence;
    
    private int ShotDelay = 0;
    private int skillDelay = 0;
    hero(){
        this.Yspeed = 2;
        this.Xspeed = 2;
        this.attack = 25;
        this.defence = 25;
    }
    
    hero(int attack,int defence){
       this.attack = attack;
       this.defence = defence;
    }
    
    hero(int Yspeed,int Xspeed,int attack, int defence){
        this.Yspeed = Yspeed;
        this.Xspeed = Xspeed;
        this.attack = attack;
        this.defence = defence;
    }
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
    public void Shoot(){
    Fire fireball = new Fire();
    getWorld().addObject(fireball,getX() + 50,getY());
    ShotDelay = 20 ;
    }
    
    void skill(){
        Skill bluefire = new Skill();
        getWorld().addObject(bluefire,getX() + 50,getY());
        skillDelay = 80;
    }
    
    public void checkKey(){
        if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a")){
            if(getX()>=0){
                setLocation(getX() - Xspeed, getY());}
        }
        if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d")){
            if(getX()<=1270){
                setLocation(getX() + Xspeed, getY());}
        }
        if(Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("w")){        
            if(getY()>=165){
                setLocation(getX(), getY()-this.Yspeed);
            }
        }
        if(Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("s")){        
            if(getY()<=375){
                setLocation(getX(), getY()+this.Yspeed);
            }
        }
        
        if(Greenfoot.isKeyDown("space")){
            if(ShotDelay > 0){
                ShotDelay--;
            }
            
            if(ShotDelay == 0){
                Shoot();
                
            }
            
        }
        
        if(Greenfoot.isKeyDown("z")){
            if(skillDelay > 0){
                skillDelay--;
            }
            
            if(skillDelay == 0){
                skill();
                
            }
            
        }
        
    
    }
    
    
}
