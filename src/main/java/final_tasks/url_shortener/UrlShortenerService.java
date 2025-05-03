package final_tasks.url_shortener;


import final_tasks.url_shortener.MemoryStorage;
import final_tasks.url_shortener.ShortenerFactory;
import final_tasks.url_shortener.ShorteningStrategy;
import final_tasks.url_shortener.UrlStorage;

public class UrlShortenerService {
    private ShorteningStrategy strategy;
    private final UrlStorage storage;

    public UrlShortenerService() {
        this.storage = MemoryStorage.getInstance(); // Singleton
    }
    public void setStrategy(ShorteningStrategy strategy){
        this.strategy = strategy;
    }

    public String shortenUrl(String longUrl) {
        if(strategy==null){
            throw new IllegalArgumentException("Strategy not set");
        }

        String shortUrl = strategy.makeUrlShort(longUrl);
        storage.save(shortUrl, longUrl);
        return shortUrl;
    }

    public String expandUrl(String shortUrl) {
        return storage.getOriginalUrl(shortUrl);
    }
}
