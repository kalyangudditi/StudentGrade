import java.util.Scanner;
class StudentGrade{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the number of subjects :");
        int n=sc.nextInt();
        int a[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            System.out.printf("Enter the marks of subject %d :",i+1);
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        int avgperc;
        avgperc=sum/n;
        System.out.println("\n Total marks :"+sum);
        System.out.println("\n Average percentage :"+avgperc);
        System.out.print("Grade :");
        if(avgperc>=80)
        {
            System.out.print("A");
        }
        else if(avgperc>=60 && avgperc<80)
        {
            System.out.print("B");
        }
        else if(avgperc>=40 && avgperc<60)
        {
            System.out.print("C");
        }     
        else
        {
            System.out.println("D");
        }
    }
}
