import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemies extends Movers
{
    /**
     * Act - do whatever the Enemies wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    } 

    public void wrapAtEdge()
    {
        int x=getX();
        int y=getY();

        if(x>=getWorld().getWidth()-1)
        {
            setLocation(1,y);
        }
        if(x<=0)
        {
            setLocation(getWorld().getWidth()-2,y);
        }
        if(y>=getWorld().getHeight()-1)
        {
            setLocation(x,1);
        }
        if(y<=0)
        {
            setLocation(x,getWorld().getHeight()-2);
        }
    }
}
