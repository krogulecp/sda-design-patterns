package info.krogulec.sda.designpatterns.singleton.calculator;

/**
 * @author krogulecp
 */
class Logger {
    //zaimplemetować singletona
    //powinien mieć metodę log, która przyjmie Stringa (komunikat) i wyświetli go w konsoli
    //Użyjcie loggera
    private static Logger logger = new Logger();

    private Logger(){}

    public static Logger getLogger(){
        return logger;
    }

    void log(String message){
        System.out.println(message);
    }
}
