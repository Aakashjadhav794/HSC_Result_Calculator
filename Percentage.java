import java.util.Scanner;
public class Percentage{
    public static void main(String[]args){
        System.out.println("HSC Board Exam Percentage");
        Scanner sc= new Scanner(System.in);
        System.out.println("English");
        float English= sc.nextFloat();
        System.out.println("Marathi");
        float Marathi=sc.nextFloat();
        System.out.println("Mathematics");
        float Mathematics= sc.nextFloat();
        System.out.println("Physics");
        float Physics= sc.nextFloat();
        System.out.println("Chemistry");
        float Chemistry= sc.nextFloat();
        System.out.println("Biology");
        float Biology= sc.nextFloat();
        System.out.println("Environment Education");
        float Environment_Education= sc.nextFloat();
        System.out.println("All Subjects");
        float sum= Marathi+English+Mathematics+Physics+Chemistry+Biology+Environment_Education;
        System.out.println(sum);
        System.out.println("Percentage");
        double Percentage= sum/6.5;
        System.out.println(Percentage);
    }
}
