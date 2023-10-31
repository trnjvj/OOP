package com.johnson.jhtp3.ch08;  
import java.text.DecimalFormat; 
public class Time4 extends Object {
   private int hour;    
   private int minute; 
   private int second;  
   public Time4() { this.setTime( 0, 0, 0 ); }
   public Time4( int h ) { this.setTime( h, 0, 0 ); }
   public Time4( int h, int m ) { this.setTime( h, m, 0 ); }
   public Time4( int h, int m, int s )
      { this.setTime( h, m, s ); }
   public Time4( Time4 time )
   {
      this.setTime( time.getHour(),
                    time.getMinute(),
                    time.getSecond() );
   }
   public Time4 setTime( int h, int m, int s )
   {
      this.setHour( h );    // set the hour
      this.setMinute( m );  // set the minute
      this.setSecond( s );  // set the second

      return this;     // enables chaining
   }
   public Time4 setHour( int h ) 
   { 
      this.hour = ( ( h >= 0 && h < 24 ) ? h : 0 ); 
      return this;     // enables chaining
   }
   public Time4 setMinute( int m ) 
   { 
      this.minute = ( ( m >= 0 && m < 60 ) ? m : 0 ); 
      return this;     // enables chaining
   }
   public Time4 setSecond( int s ) 
   { 
      this.second = ( ( s >= 0 && s < 60 ) ? s : 0 ); 
      return this;     // enables chaining
   }
   public int getHour() { return this.hour; }
   public int getMinute() { return this.minute; }
   public int getSecond() { return this.second; }
   public String toUniversalString()
   {
      DecimalFormat twoDigits = new DecimalFormat( "00" );
      return twoDigits.format( this.getHour() ) + ":" +
             twoDigits.format( this.getMinute() ) + ":" +
             twoDigits.format( this.getSecond() );
   }
   public String toString()
   {
      DecimalFormat twoDigits = new DecimalFormat( "00" );
      return ( ( this.getHour() == 12 ||
                 this.getHour() == 0 ) ?
                 12 : this.getHour() % 12 ) + ":" +
             twoDigits.format( this.getMinute() ) + ":" +
             twoDigits.format( this.getSecond() ) +
             ( this.getHour() < 12 ? " AM" : " PM" );
   }
}
