class Division {
   private double x,y;

   Division() {}

   public double mostrarDivision() {
      return (this.x/this.y);
   }

   public double getX() {
      return x;
   }

   public void setX(int x) {
      this.x = x;
   }

   public double getY() {
      return y;
   }

   public void setY(int y) {
      this.y = y;
   }

   @Override
   public String toString() {
      return "\nDivision [x=" + x + ", y=" + y + "]\n";
   }
   
}