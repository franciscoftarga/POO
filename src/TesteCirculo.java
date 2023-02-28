public class TesteCirculo {
    public static void main(String[] args){
       Circulo Circuloteste = new Circulo(2,2,2);
       System.out.println("\n" + Circuloteste.toString());
       System.out.println("Área atual " + Circuloteste.areaCirculo()+ "\n");

       Circuloteste.moverCirculo(4,4);
       System.out.println("** Circulo movido para coordenadas (4,4) **" + "\n");
       System.out.println(Circuloteste.toString());
       System.out.println("Área atual " + Circuloteste.areaCirculo() +"\n");

       Circuloteste.zoomCirculo(2);
       System.out.println("** Realizado zoom 2x **" + "\n");
       System.out.println(Circuloteste.toString());
       System.out.println("Área atual " + Circuloteste.areaCirculo());
    }
}