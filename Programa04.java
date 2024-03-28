
public class Programa04 {
    public static void main(String[] args) {

        int paisA = 80000;
        int paisB = 200000;
        int anos = 0;
        double taxaA = 0.03;
        double taxaB = 0.015;

        while (paisA <= paisB) {
            paisA += (int) (paisA * taxaA);
            paisB += (int) (paisB * taxaB);
            anos++;
        }


        System.out.println("Serão necessarios " + anos + " anos para que o pais A ultrapasse o pais B");
    }    
}
