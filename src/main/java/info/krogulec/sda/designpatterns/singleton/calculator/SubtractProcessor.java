package info.krogulec.sda.designpatterns.singleton.calculator;

/**
 * @author krogulecp
 */
class SubtractProcessor implements OperationProcessor {
    @Override
    public double process(int arg1, int arg2) {
        return arg1 - arg2;
    }

    @Override
    public Operation getOperation() {
        return Operation.SUBTRACT;
    }
}
