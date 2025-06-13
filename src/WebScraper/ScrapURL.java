package WebScraper;

import java.util.concurrent.Callable;

public class ScrapURL implements Callable<Void> {
    private String url;

    public ScrapURL(String url){
        this.url = url;
    }

    @Override
    public Void call() throws Exception {
        Thread.sleep(500);
        return null;
    }
}