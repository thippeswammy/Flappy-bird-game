import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Counter extends allObjects
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int score;
    static int scores;
    public Counter()
    {
        score=0;
        setImage(new GreenfootImage("Score:"+score,50,Color.WHITE,Color.BLACK));
    }

    public void act() 
    {
        setImage(new GreenfootImage("Score:"+score,50,Color.WHITE,Color.BLACK));
    }    

    public void addScore(int scoreup)
    {
        //score+=scoreup is equal score=+scoreup;
        score=score+scoreup;
    }
}
