package info.krogulec.sda.designpatterns.singleton;

import info.krogulec.sda.designpatterns.singleton.calculator.CalculatorFacade;

/**
 * @author krogulecp
 */
class CalculatorModuleUser {

    void useCalculator(){
        CalculatorFacade calculatorFacade = new CalculatorFacade();
        double result = calculatorFacade.add(3, 4);
        System.out.println(result);
    }
}
