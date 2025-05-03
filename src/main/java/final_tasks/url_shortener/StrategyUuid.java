package final_tasks.url_shortener;

import java.util.UUID;

public class StrategyUuid implements ShorteningStrategy{
    @Override
    public String makeUrlShort(String longUrl) {
        return UUID.randomUUID().toString().substring(0, 8);
    }
}
