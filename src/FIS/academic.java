package FIS;

import java.util.ArrayList;

public class academic extends staff {
    ArrayList<course> courseTaught = new ArrayList<course>();
    @Override
    void calcSal(){
        for (course courseT:courseTaught)
            this.salary=courseT.creditValue*10000+this.salary;
        System.out.println("Salary calculated for "+this.name+" is Rs."+this.salary);
    }

    int totalCredits(){
        int creditCount = 0;
        for (course courseI:courseTaught)
            creditCount+=courseI.creditValue;//creditCount = creditCount+courseI.CreditValue;
        return creditCount;
    }
    void outSal()
    {
        super.calcSal();
    }


}
