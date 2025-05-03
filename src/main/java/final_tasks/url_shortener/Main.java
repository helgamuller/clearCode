package final_tasks.url_shortener;

import final_tasks.url_shortener.ShortenerFactory;
import final_tasks.url_shortener.StrategyHash;
import final_tasks.url_shortener.UrlShortenerService;

public class Main {
    public static void main(String[] args) {
        UrlShortenerService service = new UrlShortenerService();
        service.setStrategy(new StrategyUuid());
        String uuidShort = service.shortenUrl("https://example.com/very/long/");

        String shortUrl = service.shortenUrl("https://example.com/very/long/");
        System.out.println("Short URL: " + shortUrl);

        String originalUrl = service.expandUrl(uuidShort);
        System.out.println("Original URL: " + originalUrl);
    }
}


