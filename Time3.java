package com.johnson.jhtp3.ch08;
import java.text.DecimalFormat;

public class Time3 extends Object {
   private int hour;   
   private int minute; 
   private int second;  
   public Time3() { setTime( 0, 0, 0 ); }
   public Time3( int h ) { setTime( h, 0, 0 ); }
   public Time3( int h, int m ) { setTime( h, m, 0 ); }
   public Time3( int h, int m, int s ) { setTime( h, m, s ); }
   public Time3( Time3 time )
   {
      setTime( time.getHour(),
               time.getMinute(),
               time.getSecond() );
   }
   public void setTime( int h, int m, int s )
   {
      setHour( h );    // set the hour
      setMinute( m );  // set the minute
      setSecond( s );  // set the second
   }
   public void setHour( int h ) 
      { hour = ( ( h >= 0 && h < 24 ) ? h : 0 ); }
   public void setMinute( int m ) 
      { minute = ( ( m >= 0 && m < 60 ) ? m : 0 ); }
   public void setSecond( int s ) 
      { second = ( ( s >= 0 && s < 60 ) ? s : 0 ); }
   public int getHour() { return hour; }
   public int getMinute() { return minute; }
   public int getSecond() { return second; }
   public String toUniversalString()
   {
      DecimalFormat twoDigits = new DecimalFormat( "00" );
      return twoDigits.format( getHour() ) + ":" +
             twoDigits.format( getMinute() ) + ":" +
             twoDigits.format( getSecond() );
   }
   public String toString()
   {
      DecimalFormat twoDigits = new DecimalFormat( "00" );
      return ( ( getHour() == 12 || getHour() == 0 ) ? 
               12 : getHour() % 12 ) + ":" +
             twoDigits.format( getMinute() ) + ":" +
             twoDigits.format( getSecond() ) +
             ( getHour() < 12 ? " AM" : " PM" );
   }
}
