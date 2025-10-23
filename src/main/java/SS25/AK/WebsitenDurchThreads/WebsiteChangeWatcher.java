package SS25.AK.WebsitenDurchThreads;

import java.util.function.Consumer;

public class WebsiteChangeWatcher implements Runnable {

    String target;
    String path;
    Consumer<String> consumer;
    boolean cancel;

    public WebsiteChangeWatcher(String target, String path, Consumer<String> consumer) {
        this.target = target;
        this.path = path;
        this.consumer = consumer;
        this.cancel = false;
    }

    @Override
    public void run() {
        while (!cancel) {
            hasChanged();
        }
    }

    public void cancel() {
        this.cancel = true;
    }

    public void hasChanged() {
        try {
            String content = retrieveWebsiteContent();
            Thread.sleep(30000);
            String newContent = retrieveWebsiteContent();
            if (!content.equals(newContent)) {
                consumer.accept(newContent);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String retrieveWebsiteContent() {
        return "URL Example";
    }
}
