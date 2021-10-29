package Program;



public class Main {
    public static void main(String[] args) {
        int[] valores = new int[20];
        int[] nums = {10,10};
        for(int i = 0; i< valores.length; i++) {
            valores[i] = i * 10;
            System.out.print(valores[i] + " ");
           }

      //Reverte o Array

        System.out.println();


        for (int i =0; i<  valores.length; i++) {
            if(i < 10){
                int apoio = valores[valores.length - (i +1)];
                valores[valores.length - (i +1)] = valores[i];
                valores[i] = apoio;
            }
            System.out.print(valores[i] + " ");
        }
        nOcorrencias(valores,1);
        hasRepeat(valores);
        hasRepeat(nums);
    }

    public static int nOcorrencias(int[] l,Integer el){


        return el;
    }

    public static boolean hasRepeat(int[] l) {
        for(int i=0;i< l.length-1;i++){
            for(int j = i+1; j < l.length; j++){
                if (l[j] == l[i]) {
                    System.out.println("O elemento " + l[j] + " se repete \n");
                    return true;
                }
                else{
                    System.out.println("Nenhum Elemento  se repete");
                    return false;
                }
            }
        }
        return false;
    }
}
