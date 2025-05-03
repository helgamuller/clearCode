package final_tasks.url_shortener;

import java.util.HashMap;
import java.util.Map;

public class FileStorage implements UrlStorage{
    private static FileStorage fileStorage;
    private Map<String, String> shortToLong = new HashMap<>();
    private FileStorage(){

    }
    public static FileStorage getInstance(){
        if(fileStorage==null){
            fileStorage = new FileStorage();
        }
    return fileStorage;
    }


    @Override
    public void save(String shortUrl, String longUrl) {
        shortToLong.put(shortUrl, longUrl);
        System.out.println("Saved to file");
    }

    @Override
    public String getOriginalUrl(String shortUrl) {
        return shortToLong.get(shortUrl);
    }
}
