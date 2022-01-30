import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class student extends Actor
{
    counter counter;
    counter2 counter2;
    
    /**
     * Act - do whatever the student wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (canMove())
        {
            checkKeys();
            checkDoor();
            checkFood();
            checkDoor2();
        }
    }
    
    public boolean canMove()
    {
        int rotation = getRotation();
        int x = getX();
        int y = getY();
        boolean facingEdge = false;
        
        switch (rotation) {
            case 0:
                facingEdge = (x == getWorld().getWidth() - 1);
                break;
            case 90:
                facingEdge = (y == getWorld().getHeight() - 1);
                break;
            case 180:
                facingEdge = (x == 0);
                break;
            case 270:
                facingEdge = (y == 0);
                break;
        }
        
        return !facingEdge;
    }
    
    private void checkKeys()
    {
        if(Greenfoot.isKeyDown("d")) 
        {
            setLocation(getX()+3, getY());
        }
        if(Greenfoot.isKeyDown("a")) 
        {
            setLocation(getX()-3, getY());
        }
        if(Greenfoot.isKeyDown("s")) 
        {
            setLocation(getX(), getY()+3);
        }
        if(Greenfoot.isKeyDown("w")) 
        {
            setLocation(getX(), getY()-3);
        }
    }
    
    private void resetText()
    {
        String text = " ";
        getWorld().showText(text, 300, 30);
    }
    private void checkDoor()
    {
        if (isTouching(door.class))
        {
            Actor door = getOneObjectAtOffset(0, 0, door.class);
            getWorld().removeObject(door);
        
            resetText();
            String text = "GO BACK";
            getWorld().showText(text, 300, 370);
            getWorld().setBackground("beige.png");
            
            door2 door2 = new door2();
            getWorld().addObject(door2, 300, 370);
            
            counter = new counter();
            getWorld().addObject(counter, 10, 100);
            counter2 = new counter2();
            getWorld().addObject(counter2, 570, 100);
            
            
            cupcake cupcake = new cupcake();
            getWorld().addObject(cupcake, 70, 75);
            
            apple apple = new apple();
            getWorld().addObject(apple, 70, 200);
            
            burger burger = new burger();
            getWorld().addObject(burger, 70, 325);
            
            bread bread = new bread();
            getWorld().addObject(bread, 530, 75);
            
            pizza pizza = new pizza();
            getWorld().addObject(pizza, 530, 200);
            
            cherry cherry = new cherry();
            getWorld().addObject(cherry, 530, 325);
        }
    }
    
    public void checkFood()
    {
        if (isTouching(apple.class))
        {
            Actor apple = getOneObjectAtOffset(0, 0, apple.class);
            getWorld().removeObject(apple);
        }
        if (isTouching(bread.class))
        {
            Actor bread = getOneObjectAtOffset(0, 0, bread.class);
            getWorld().removeObject(bread);
        }
        if (isTouching(burger.class))
        {
            Actor burger = getOneObjectAtOffset(0, 0, burger.class);
            getWorld().removeObject(burger);
        }
        if (isTouching(cherry.class))
        {
            Actor cherry = getOneObjectAtOffset(0, 0, cherry.class);
            getWorld().removeObject(cherry);
        }
        if (isTouching(cupcake.class))
        {
            Actor cupcake = getOneObjectAtOffset(0, 0, cupcake.class);
            getWorld().removeObject(cupcake);
        }
        if (isTouching(pizza.class))
        {
            Actor pizza = getOneObjectAtOffset(0, 0, pizza.class);
            getWorld().removeObject(pizza);
        }
    }  
    
     public void checkDoor2()
    {
        if (isTouching(door2.class))
        {
            String text = "CAFETERIA";
            getWorld().showText(text, 300, 30);
            
            String text2 = " ";
            getWorld().showText(text2, 300, 370);
            
            background3 myBackground3 = new background3();
            getWorld().addObject(myBackground3, 100, 100);
            
            Logo pdsLogo = new Logo();
            getWorld().addObject(pdsLogo, 305, 200);
            
        }
    }
    
    
    
    
}
