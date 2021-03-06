import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Inhibitor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inhibitor extends Actor
{
    private PolyQ polyq = new PolyQ();
    
    protected void addedToWorld(){
        
    
    /**
     * Act - do whatever the Inhibitor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Player player = (Player) getOneIntersectingObject(Player.class);
        int speed = player.speed;
        if (canMove())
        {
           move(speed*3);
        }
        else
        {
            getWorld().removeObject(this);
        }
    }   
    
    private void aggregate(){
        
    }
    
    
    private boolean canMove()
    {
        return !(getX()>=getWorld().getWidth()-20 || getX()<=20 || getY()>=getWorld().getHeight()-20 || getY()<=20);
    }
}



