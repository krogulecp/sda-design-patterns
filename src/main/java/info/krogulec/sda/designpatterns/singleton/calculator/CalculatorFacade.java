package info.krogulec.sda.designpatterns.singleton.calculator;

import java.util.Set;

/**
 * @author krogulecp
 */
public class CalculatorFacade {

    private final Set<OperationProcessor> operationProcessors;

    public CalculatorFacade() {
        this.operationProcessors = Set.of(new AdditionProcessor(), new SubtractProcessor());
    }

    public double add(int arg1, int arg2){
        return new Calculator(arg1, arg2, operationProcessors, Operation.ADD).calculate();
    }

    public double subtract(int arg1, int arg2){
        return new Calculator(arg1, arg2, operationProcessors, Operation.SUBTRACT).calculate();
    }
}
