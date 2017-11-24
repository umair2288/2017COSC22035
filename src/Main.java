import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Lecturer Name:");
        academic UPL = new academic();
        course COSC22035 = new course();
        UPL.name = sc.nextLine();
        System.out.println("Insert Phone Number:");
        UPL.phoneNumber = sc.nextInt();
        UPL.displayInfo();
        /*
        try{
            System.out.println(COSC22035.creditValue/0);
        }
        catch (ArithmeticException exp)
        {
            exp.printStackTrace();
        }
        try{
            System.out.println(args[0]);
        }
        catch (ArrayIndexOutOfBoundsException exp)
        {
            exp.printStackTrace();
        }
        */
        //test.name=sc.nextLine();

        //System.out.println("Out of Exception");
        //System.out.print("Input Credit Value:");
        //COSC22035.creditValue=sc.nextInt();
        UPL.salary=333333;
        UPL.courseTaught=COSC22035;
        UPL.outSal();
        UPL.calcSal();


    }
}
