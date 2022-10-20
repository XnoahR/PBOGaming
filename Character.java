import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Character extends Actor


{
    private int Yspeed = 3;
    private int Xspeed = 3;
    World world = getWorld();
    public Character(){
    GreenfootImage image = getImage();
    image.scale(64,88); 
}

    public void act()
    {
          
    KeyBind();
    
}
    
    public void KeyBind(){
        if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a")){
            if(getX()>=0){
                setLocation(getX()-Xspeed,getY());
            }
        }
        if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d")){
            if(getX()<=800){
                setLocation(getX()+Xspeed,getY());
            }
        }
        
        if(Greenfoot.mouseClicked(null)){
            getWorld().addObject(new Bullet(),getX() + 30,getY());
        }
    }
}


