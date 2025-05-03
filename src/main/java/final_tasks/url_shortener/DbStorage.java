package final_tasks.url_shortener;

import java.util.HashMap;
import java.util.Map;

public class DbStorage implements UrlStorage{
    private static DbStorage dbStorage;
    private Map<String, String > shortToLong = new HashMap<>();
    private DbStorage(){

    }
    public static DbStorage getInstance(){
        if(dbStorage==null){
            dbStorage = new DbStorage();
        }
        return dbStorage;
    }

    @Override
    public void save(String shortUrl, String longUrl) {
        shortToLong.put(shortUrl,longUrl);
    }

    @Override
    public String getOriginalUrl(String shortUrl) {
        return shortToLong.get(shortUrl);
    }
}
