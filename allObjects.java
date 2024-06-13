import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class allObjects here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class allObjects extends Actor
{
    /**
     * Act - do whatever the allObjects wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int horizScaleDown;
    int vertScaleDown;
    public void act() 
    {
        // Add your action code here.
    }    
    public void scaleDownImage(int x,int y)
    {
        horizScaleDown=x;
        vertScaleDown=y;
        getImage().scale(getImage().getWidth()/horizScaleDown, getImage().getHeight()/vertScaleDown);    
    
    }
     public void scaleUpImage(int x,int y)
    {
        horizScaleDown=x;
        vertScaleDown=y;
        getImage().scale(getImage().getWidth()*horizScaleDown, getImage().getHeight()*vertScaleDown);    
    
    }
}
