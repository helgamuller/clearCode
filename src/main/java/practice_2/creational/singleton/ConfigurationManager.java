package practice_2.creational.singleton;

public class ConfigurationManager {
    private String dbUrl;
    private String dbLogin;
    private String dbPwd;
    private String path;
    private String logLevel;

    private static ConfigurationManager manager;

    private ConfigurationManager() {

    }

    public static ConfigurationManager getInstance() {
        if (ConfigurationManager.manager == null) {
            manager = new ConfigurationManager();
        }
        return manager;
    }
    public void setDbUrl(String url){
        this.dbUrl = url;
    }

    public void printConfig(){
        System.out.println(manager);
    }

    @Override
    public String toString() {
        return "ConfigurationManager{" +
                "dbUrl='" + dbUrl + '\'' +
                ", dbLogin='" + dbLogin + '\'' +
                ", dbPwd='" + dbPwd + '\'' +
                ", path='" + path + '\'' +
                ", logLevel='" + logLevel + '\'' +
                '}';
    }
}



