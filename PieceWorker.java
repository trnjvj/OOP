public final class PieceWorker extends Employee {
   private double wagePerPiece; 
   private int quantity;     
   public PieceWorker( String first, String last,
                       double w, int q )
   {
      super( first, last ); 
      setWage( w );
      setQuantity( q );
   }
   public void setWage( double w ) 
      { wagePerPiece = ( w > 0 ? w : 0 ); }
   public void setQuantity( int q ) 
      { quantity = ( q > 0 ? q : 0 ); }
   public double earnings()
      { return quantity * wagePerPiece; }
   public String toString()
   {
      return "Piece worker: " + super.toString();
   }  
}
