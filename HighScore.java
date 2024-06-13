import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hige here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HighScore extends Actor
{
    /**
     * Act - do whatever the hige wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

   static int highScore=0;
    public  HighScore()
    {
        setImage(new GreenfootImage(" HighScore:"+ highScore,40,Color.WHITE,Color.BLACK));
    }

    public void act() 
    {

    }  

    public void hiScore(int scorex )
    {
        //score+=scoreup is equal score=+scoreup;
        highScore=scorex;
       
        setImage(new GreenfootImage(" HighScore:"+ highScore,40,Color.WHITE,Color.BLACK));
        
    }
}
