package info.krogulec.sda.designpatterns.strategy;

import java.math.BigDecimal;
import java.util.Random;

/**
 * @author krogulecp
 */
class SalaryCalculator {
    private final TaxPolicy taxPolicy;

    public SalaryCalculator(TaxPolicy taxPolicy) {
        this.taxPolicy = taxPolicy;
    }

    public BigDecimal calculateSalary(Employee emp){
        System.out.println("Salary calculated");

        BigDecimal salaryWithoutTax = emp.getWorkingDays().multiply(emp.getDailyRate());
        return salaryWithoutTax.multiply(BigDecimal.valueOf((1 - taxPolicy.getTax())));
    }
}

class Employee{

    BigDecimal getWorkingDays() {
        return BigDecimal.valueOf(new Random().nextInt(30));
    }

    BigDecimal getDailyRate() {
        return BigDecimal.valueOf(new Random().nextInt(300));
    }
}

interface TaxPolicy{
    double getTax();
}

