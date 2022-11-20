import java.util.Scanner;

public class FruitDiff {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Podaj ilosc pomaranczy: ");
        int p= sc.nextInt();
        System.out.print("Podaj ilosc jablek: ");
        int j= sc.nextInt();
        System.out.print("Podaj ile masz kasy: ");
        int z= sc.nextInt();
        int compare;
        for (int i = z; i > 0; i--) {
            compare = j-p;
            if (compare>0){
                p++;
            }
            if(compare<0){
                j++;
            }
            if(compare==0){
                p++;
            }
        }
        System.out.println("Minimalna roznica:" + Math.abs(j - p));
        System.out.println("Ilosc jablek:" + j);
        System.out.println("Ilosc pomaranczy:" + p);

    }
}