public class academic extends staff {
    course courseTaught;

    @Override
    void calcSal(){
        this.salary=this.courseTaught.creditValue*10000;
        System.out.println("Salary calculated for "+this.name+" is Rs."+this.salary);
    }

    void outSal()
    {
        super.calcSal();
    }
}
