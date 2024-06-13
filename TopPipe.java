import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class toppPipe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TopPipe extends Enemies
{
    /**
     * Act - do whatever the toppPipe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed=5;
    public TopPipe()
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
