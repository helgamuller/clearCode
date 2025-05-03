package final_tasks.url_shortener;
//Интерфейс, который определяет метод для сокращения URL. Реализации могут включать Base62, хеширование, UUID и другие.
public interface ShorteningStrategy {
    public String makeUrlShort(String longUrl);
}
