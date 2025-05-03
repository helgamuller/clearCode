package final_tasks.url_shortener;

public class StrategyBase62 implements ShorteningStrategy{
    @Override
    public String makeUrlShort(String longUrl) {
        return longUrl.substring(0,5) +"_base62";

    }
}
