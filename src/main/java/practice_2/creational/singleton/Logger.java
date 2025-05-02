package practice_2.creational.singleton;

public class Logger {
    private static Logger logger;

    private Logger(){

    }

    public static Logger getInstance(){
        if(logger == null){
            logger = new Logger();
        }
        return logger;
    }
    public void logWarn(String message){
        System.out.println("WARN " + message);
    }
    public void logInfo(String message){
        System.out.println("Info " + message);
    }
    public void logError(String message){
        System.out.println("Error " + message);
    }
}
