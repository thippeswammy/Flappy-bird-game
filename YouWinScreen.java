import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class youWon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YouWinScreen extends Actor
{
    /**
     * Act - do whatever the youWon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int count=0;
    public void act() 
    {
        count++;
        if(count>(60*10))
        {
            Greenfoot.setWorld(new FlappyWorld());   
        }

    }    
}
