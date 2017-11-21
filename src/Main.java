
public class Main {
    public static void main(String[] args) {
        academic test = new academic();
        course COSC22035 = new course();
        test.name="Liyanage";
        COSC22035.creditValue=5;
        test.salary=333333;
        test.courseTaught=COSC22035;
        test.outSal();
        test.calcSal();


    }
}
