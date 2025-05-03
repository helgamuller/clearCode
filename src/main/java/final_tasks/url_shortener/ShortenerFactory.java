package final_tasks.url_shortener;
//Класс, использующий Factory Method для создания объектов ShorteningStrategy.
public  class ShortenerFactory {
    private final ShorteningStrategy strategy;

    public ShortenerFactory(ShorteningStrategy strategy) {
        this.strategy = strategy;
    }

    public ShorteningStrategy getStrategy() {
        return strategy;

    }
}
