import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bottempipe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BottemPipe extends Enemies
{
    /**
     * Act - do whatever the bottempipe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed=5;
    public BottemPipe()
    {
       scaleUpImage(2,4);
    }

    public void act() 
    {
       moveAround();
    }    
    public void moveAround()
    {
       setLocation(getX()-speed, getY() ); 
    }
}
