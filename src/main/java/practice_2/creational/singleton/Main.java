package practice_2.creational.singleton;

public class Main {
    public static void main(String[] args) {

//        ConfigurationManager manager = ConfigurationManager.getInstance();
//        ConfigurationManager manager2 = ConfigurationManager.getInstance();
//
//        manager.printConfig();
//        manager.setDbUrl("New url");
//        manager.printConfig();
//        manager2.printConfig();

        Logger logger = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger2.logWarn("Dont do this");
        logger.logWarn("Dont do this");




    }
}
