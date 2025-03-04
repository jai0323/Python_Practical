import java.util.*;
class Substring{
    public static void main(String arg []){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n;i++){
            for(int j=0; j<n-1-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i+1;k++){
                System.out.print("*");
            }
            for(int m=0;m<i;m++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}