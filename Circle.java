package com.johnson.jhtp3.ch09;

public class Circle extends Point { 
   protected double radius;
   public Circle()
   {
      setRadius( 0 );  
   }
   public Circle( double r, int a, int b )
   {
      super( a, b );
      setRadius( r );  
   }
   public void setRadius( double r ) 
      { radius = ( r >= 0.0 ? r : 0.0 ); }
   public double getRadius() { return radius; }
   public double area() 
      { return Math.PI * radius * radius; }
   public String toString()
   {
      return "Center = " + super.toString() +
             "; Radius = " + radius;
   }
}
