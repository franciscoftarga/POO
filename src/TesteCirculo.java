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

       Circulo[] lista;
       lista = new Circulo[2];
       lista[0] = Circuloteste;
       lista[1] = new Circulo(2,4,6);

       for(int i = 1;i< lista.length;i++) {
          System.out.println(lista[i].toString());
       }
    }
}
