import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Dizinin eleman sayısını giriniz: ");
        int n =input.nextInt();
        int inp;
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print((i+1)+". elemanı giriniz: ");
            inp=input.nextInt();
            arr[i]=inp;
        }
        HelpArr.getUp(arr);
    }
}