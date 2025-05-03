package final_tasks.url_shortener;

public class StrategyHash implements ShorteningStrategy{
    @Override
    public String makeUrlShort(String longUrl) {
        return longUrl.substring(0,5) + "_HASH";
    }
}
