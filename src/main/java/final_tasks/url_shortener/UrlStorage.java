package final_tasks.url_shortener;
//Интерфейс для хранения пар "длинный URL - короткий URL", с различными реализациями (например, память, файлы, базы данных).
public interface UrlStorage {
    void save(String shortUrl, String longUrl);
    String getOriginalUrl(String shortUrl);
}
