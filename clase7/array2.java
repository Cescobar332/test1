package clase7;

public class array2 {
    public static void main(String[] args) {
        int num[]=rellenarArrayDesde(5);
        imprimirArray(num);
    }
    public static void imprimirArray (int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println(lista[i]);
        }
    }
    public static int[] rellenarArrayDesde(int a){
        int num[]=new int [10];
        for(int i=0;i<num.length;i++){
            num[i]=a;
            a++;
        }
        return num;
    }
}
