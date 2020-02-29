package info.krogulec.sda.designpatterns.singleton.calculator;

/**
 * @author krogulecp
 */
interface OperationProcessor {
    double process(int arg1, int arg2);
    Operation getOperation();
}
