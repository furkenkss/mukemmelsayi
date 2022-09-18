import java.util.Scanner;

public class furkenkss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,toplam=0 ;

        System.out.print("Mukemmel sayi sorgulamasi yapacaginiz sayi : ");
        n= input.nextInt();

        for(int i=n-1 ; i>=1 ; i--){

            if(n%i==0){
                toplam+=i;
            }

        }

        if(toplam==n){

            System.out.println("Sayinizi mukemmel sayidir.");
        }else{
            System.out.println("Sayi mukemmel degildir.");

        }
    }
}
