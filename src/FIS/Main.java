package FIS;

import DBConnect.*;
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Statement stml = null;

       // DBConnect.dbConnect DB = new dbConnect();//Object from DB connect
        //DB.Connect2DB();//Connect to DB

        DBConnect.dbConnect DB = new dbConnect();
        stml = DB.Conn2DB();

        String query1 = "SELECT * FROM userdetails";
        String query2 = "INSERT userdetails VALUES role=10";

        try{
            stml.executeUpdate(query2);
            System.out.println("Table Updated");
        }catch (SQLException e){
            e.printStackTrace();
        }

        try{

            ResultSet rs = stml.executeQuery(query1);
            while(rs.next()){
                int userId = rs.getInt("UserId");
                String userName = rs.getString("UserName");
                String password = rs.getString("Password");
                System.out.println("UserID:"+ " Username:" + userName+ " Password:"+password);
            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }

        DB.closeDB();



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
        System.out.print("Input Credit Value:");
        COSC22035.creditValue=sc.nextInt();
        UPL.courseTaught.add(COSC22035);
        try
        {
            if(UPL.totalCredits()>0) throw new courseException();
        }catch (courseException exp)
        {
            exp.printStackTrace();
        }
        UPL.outSal();
        DB.Connect2DB();
        stml = DB.Conn2DB();
        String sql = "SELECT * FROM `userDetails`";
        try{
            if (UPL.totalCredits()>10) throw new courseException();
        }catch (courseException exp)
        {
            exp.printStackTrace();
        }
        try{
            stml.execute(sql);
            ResultSet rs = stml.executeQuery(sql);
            while(rs.next()){
                System.out.println("User Name "+rs.getString("UserName"));
            }
            stml.close();
        }catch (SQLException exp)
        {
            exp.printStackTrace();
        }
        UPL.calcSal();


    }
}
