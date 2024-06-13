import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LowScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LowScore extends Actor
{
    /**
     * Act - do whatever the LowScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    static int yourScore;
    public LowScore()
    {
        Counter counter = new Counter();
        setImage(new GreenfootImage(" YourScore:"+ yourScore,40,Color.WHITE,Color.BLACK));
    }

    public void act() 
    {

    }  

    public void loScore(int scorex )
    {
        yourScore=scorex;
        setImage(new GreenfootImage(" YourScore=:"+ yourScore,40,Color.WHITE,Color.BLACK));   
    }

}
