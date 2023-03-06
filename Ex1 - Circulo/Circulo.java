
public class Circulo {
    private int x,y; //Coordenadas
    private int raio;

   public Circulo(int x, int y, int raio){
       this(0,0,1);
       //this.x = x;
       //this.y = y;
       //this.raio = raio;
   }

   public Circulo(){
       x = 0;
       y = 0;
       raio = 1;
   }

   public void moverCirculo(int novoX, int novoY) {
        x = novoX;
        y = novoY;
   }

   public void zoomCirculo(int zoom){
       raio *= zoom;
   }

   public double areaCirculo(){
       return Math.PI*(Math.pow(raio,2));
   }

   public String toString() {
       return "Circulo de raio " + raio + " com coordenadas " + "(" + x + "," + y + ")";  
   }
}
