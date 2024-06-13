import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyWorld extends World
{

    /**
     * Constructor for objects of class FlappyWorld.
     * 
     */
    Counter counter = new Counter();
    FlappyBird FlappyBird=new FlappyBird();
    int count=0,gravi=80;
    static int vio=11;
    public FlappyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1,false); 
        prepare();
    }

    public void act()
    {
        if(count==0)
        {
            showText("Space to jump... you win when you get "+(counter.scores+1)+" points",getWidth()/2,getHeight()/2);  
            
        }
        
        if(vio==0)
        {
            showText("",getWidth()/2,getHeight()/2); 
            count++;
            addPipe();
            addScore();
        }
    }

    public void chang1(int y)
    {
       vio=y;   
    }
    
     public void chang2(int y)
    {
       vio=y;   
    }
    
    public void stat()
    {
        if(Greenfoot.isKeyDown("space")&&vio==11)  
        {
            vio=0;
            showText("",getWidth()/2,getHeight()/2); 
        }
    }
    
    public void addPipe()
    {
        if(count%60==0)
        {
            int randomNum=Greenfoot.getRandomNumber(7);
            int ra=Greenfoot.getRandomNumber(20);
            if(ra%2==0)
            {
                addObject(new BottemPipe(),getWidth()-1,400+33*randomNum-ra );
                addObject(new TopPipe(),getWidth()-1,-200+33*randomNum +ra);
            }
            if(ra%2==1)
            {
                addObject(new BottemPipe(),getWidth()-1,400+33*randomNum+ra );
                addObject(new TopPipe(),getWidth()-1,-200+33*randomNum-ra);
            }
        }
    }

    public void addScore()
    {
        if(timeToScore())
        {
            counter.addScore(1);
        }
    }

    public void addgra(int grav)
    {
        //score+=scoreup is equal score=+scoreup;
        gravi=grav;
    }

    public boolean timeToScore()
    {
        if(count==205)
            return true;
        if(count>=206&&(count)%62==0)
            return true;
        else
            return false;
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        setPaintOrder(Counter.class,FlappyBird.class);
        Ground Ground = new Ground();
        addObject(Ground,400,540);
        FlappyBird FlappyBird = new FlappyBird();
        addObject(FlappyBird,113,122+75);
        counter.setLocation(75,30);
        counter.setLocation(75,30);
        Counter counter = new Counter();
        addObject(counter,64,32);
        counter.setLocation(690,40);
    }
}
