package final_tasks.url_shortener;

import java.util.HashMap;
import java.util.Map;

public class MemoryStorage implements UrlStorage{
    private static MemoryStorage memoryStorage;
    private Map<String, String> shortToLong;

    private MemoryStorage(){
        this.shortToLong = new HashMap<>();
   };


    public static MemoryStorage getInstance(){
        if(memoryStorage==null){
            memoryStorage = new MemoryStorage();
        }
        return memoryStorage;
    }

    @Override
    public void save(String shortUrl, String longUrl) {
            shortToLong.put(shortUrl, longUrl);
            System.out.println("Saved to memory");
    }

    @Override
    public String getOriginalUrl(String shortUrl) {
        return shortToLong.get(shortUrl);

    }
}
