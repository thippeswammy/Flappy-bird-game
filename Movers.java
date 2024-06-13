import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Movers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Movers extends allObjects
{
    int speed = 4;
    /**
     * Act - do whatever the Movers wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

    }  

    public void maxSpeed()
    {
        if(speed>=7)
        {
            speed=7;
        }
    }

    public boolean hitEnemy()
    {
        if(isTouching(Enemies.class))
        {
            return true;
        }
        else
        {
            return false; 
        }
    }
}
