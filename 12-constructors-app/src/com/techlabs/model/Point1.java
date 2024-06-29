package com.techlabs.model;

public class Point1 {
	private int x;
    private int y;
    
    public Point1()
    {
   	 x=1;
   	 y=1;
    }
    public Point1(int x1,int y1)//parameterized
    {
   	 x=x1;
   	 y=y1;
    }
    
    public Point1(Point1 point)
    {
   	 x=point.getX();
   	 y=point.getY();
    }
    public void setX(int x)
    {
   	  this.x=x;
    }
    public int getX()
    {
   	 return x;
    }
    public void setY(int y)
    {
   	    this.y=y;
    }
    public int getY()
    {
   	 return y;
    }

}
