import java.util.Scanner;
public class QuestionKunal {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("Enter the key value to be searched in number");
        int key=in.nextInt();
        int sum=0;
        while(n>0){
            int rem=n%10;
            n/=10;
            if(key==rem){
                sum+=1;
            }
           
        }
         System.out.println("The total occurence of number "+key+" is "+sum);

    }
}
