import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyBird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyBird extends player
{
    /**
     * Act - do whatever the FlappyBird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int gravity=0,count=0;
    static int gravity1=0; 
    boolean jumpPressed=false;
    public FlappyBird()
    {
        scaleDownImage(3,3);
    }

    public void act() 
    {
        if(gravity1==0)
         stat();
        if(gravity1==11)
        {
            gravity++;
            count++;
            fall();
            jump();
            hitSomething();
            tipping();
        }
    }    

    public void stat()
    {
        if(Greenfoot.isKeyDown("space")&&gravity1==0)  
        {
            gravity1=11;
            FlappyWorld FlappyWorld=new FlappyWorld();
            FlappyWorld.chang1(0);
        }
    }

    public void tipping()
    {
        setRotation(getRotation()+2);
    }

    public void fall()
    {
        if(count%2==0)
            setLocation(getX(),getY()+gravity);   
    }

    public void jump()
    {
        if((Greenfoot.isKeyDown("space")||Greenfoot.isKeyDown("0"))&&!jumpPressed)
        {
            gravity=-15;
            setRotation(-75);
            jumpPressed=true;
        }
        else if((!Greenfoot.isKeyDown("space")||(!Greenfoot.isKeyDown("0"))))
        {
            jumpPressed= false;  
        }
    }
    Counter counter = new Counter();
    static int a,b;
    public void hitSomething()
    {

        if(isTouching(Ground.class)||isTouching(BottemPipe.class)||isTouching(TopPipe.class)||getY()<=1)
        {
            gravity=0;
            if(counter.score>counter.scores&&gravity==0)
            {
                a=counter.score;
                b=counter.scores;
                HighScore HighScore=new HighScore();
                LowScore LowScore=new LowScore();
                if(a>b)
                    HighScore.hiScore(a);
                else
                    HighScore.hiScore(b);
                LowScore.loScore(a);
                getWorld().addObject(new  HighScore(),getWorld().getWidth()/2,getWorld().getHeight()/2+20);
                getWorld().addObject(new  LowScore(),getWorld().getWidth()/2,getWorld().getHeight()/2-20);
                counter.score=a;
                counter.scores=b;
                if(counter.score>counter.scores)
                    counter.scores=counter.score;
                Greenfoot.delay(60*2);
                Greenfoot.setWorld(new FlappyWorld());
            }
            else if(counter.score<counter.scores&&gravity==0)
            {
                a=counter.score;
                b=counter.scores;
                HighScore HighScore=new HighScore();
                LowScore LowScore=new LowScore();
                if(a>b)
                    HighScore.hiScore(a);
                else
                    HighScore.hiScore(b);
                LowScore.loScore(a);
                getWorld().addObject(new  HighScore(),getWorld().getWidth()/2,getWorld().getHeight()/2+20);
                getWorld().addObject(new  LowScore(),getWorld().getWidth()/2,getWorld().getHeight()/2-20);
                counter.score=a;
                counter.scores=b;
                Greenfoot.delay(60*2);
                Greenfoot.setWorld(new FlappyWorld());
            }else{
            getWorld().addObject(new  HighScore(),getWorld().getWidth()/2,getWorld().getHeight()/2+20);
            getWorld().addObject(new  LowScore(),getWorld().getWidth()/2,getWorld().getHeight()/2-20);
            counter.score=a;
            counter.scores=b;
            Greenfoot.delay(60*2);
            Greenfoot.setWorld(new FlappyWorld());
            Greenfoot.stop();
            }
        }
    }
}
