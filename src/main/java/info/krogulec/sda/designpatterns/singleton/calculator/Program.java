package info.krogulec.sda.designpatterns.singleton.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author krogulecp
 */
class Program {

    private final Set<OperationProcessor> operationProcessors;
    private final UserInterface userInterface;

    public Program(Set<OperationProcessor> processors) {
        this.operationProcessors = processors;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        PrintStream printStream = new PrintStream(System.out);
        this.userInterface = new UserInterface(bufferedReader, printStream);
    }

    void run() throws IOException {
        boolean isContinued = true;
        while (isContinued){
            //Wszystkie interakcje z użytkownikiem
            Logger.getLogger().log("Rozpoczęcie działania programu. Dostępne operacje: " + operationProcessors.stream()
                    .map(operationProcessor -> operationProcessor.getOperation().name())
                    .collect(Collectors.joining(",")));
            Operation operation = userInterface.provideOperation();
            int arg1 = userInterface.provideArg();
            int arg2 = userInterface.provideArg();
            Calculator calculator = new Calculator(arg1, arg2, operationProcessors, operation);
            double result = calculator.calculate();
            userInterface.printResult(result);
            isContinued = userInterface.shouldContinue();
        }
    }
}
