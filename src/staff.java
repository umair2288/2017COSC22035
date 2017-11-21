public class staff extends user {
    String universityID;
    double salary;
    String department;

    public void displayInfo()
    {
        System.out.println("NIC Number: "+this.NIC);
        System.out.println("Name: "+this.name);
        if (this.email!=null) System.out.println("email: "+this.email);
        System.out.println("Phone Number: "+this.phoneNumber);
    }

    void SalIncrement(){
        if(this.department.equals("Computer Science")) this.salary=this.salary*1.05;
    }

    void calcSal()
    {
        System.out.println("Salary of "+this.name+" is Rs. "+this.salary);
    }
}
