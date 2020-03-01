package info.krogulec.sda.designpatterns.strategy;

/**
 * @author krogulecp
 */
class Main {

    public static void main(String[] args) {
        SalaryCalculator salaryCalculator = new SalaryCalculator(new GermanTaxPolicy());
        System.out.println(salaryCalculator.calculateSalary(new Employee()));
    }
}
