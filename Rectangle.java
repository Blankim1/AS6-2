/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6.pkg2;

/**
 *
 * @author qianjiahui
 */
public class Rectangle extends Quadrilateral
{
    private int width;
    private int height;
    
    
    public Rectangle(int width, int height)
    {
        this.width = width;
        this.height = height;
            
        center();
    }
    
    void moveTo(int x, int y)
    {
        points[0] = new Point(x, y);
        points[1] = new Point(x + width, y);
        points[2] = new Point(x + width, y + height);
        points[3] = new Point(x, y + height);
        
    }
    
    private void center()
    {
        final Point center = new Point(525, 425);
     
        moveTo(center.getX() - width / 2, center.getY() - height /2);
    }
    
    public int compareWidth(Rectangle r)
    {
        if(this.width > r.width)
        {
            return 1;
        }
        else if(this.width < r.width)
        {
            return -1;
        }
        else
        {
            return 0;
        }
        
    }
    
    public int compareHeight(Rectangle r)
    {
        if(this.height > r.height)
        {
            return 1;
        }
        else if(this.height < r.height)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
    
    public int compareTo(Rectangle r)
    {
        if(width + height > r.width + r.height)
        {
            return 1;
        }
        else if (width + height < r.width + r.height)
        {
            return -1;
        }
        else
        {
            return 0;
        }
        
    }
    
    
    
    
}
