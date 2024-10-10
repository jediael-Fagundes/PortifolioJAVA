public class H {
    public static void main(String[] args) {
        int quantpar = 0;
        int somapar = 0;
        
     
        for (int i = 14; i <= 72; i += 2) {
            quantpar++;
            somapar += i;
        }
        
   
        float media = 0;
        if (quantpar > 0) {
            media = (float) somapar / quantpar;
        }


        System.out.println("Quantidade de números pares: " + quantpar);
        System.out.println("Soma dos números pares: " + somapar);
        System.out.println("Média dos números pares: " + media);
    }
}
