import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setBackground("background.png");
        setPaintOrder(student.class, door.class, Logo.class);
        prepare();
        
        String text = "CATFETERIA";
        showText(text, 300, 30);
        
    }
    
    public void prepare()
    {
        student student = new student();
        addObject(student, 300, 350);
        door door = new door();
        addObject(door, 300, 30);
        Logo pdsLogo = new Logo();
        addObject(pdsLogo, 305, 200);
    }
}
