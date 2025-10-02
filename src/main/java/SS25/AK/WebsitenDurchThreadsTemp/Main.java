package SS25.AK.WebsitenDurchThreadsTemp;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        WebsiteChangeWatcher watcher = new WebsiteChangeWatcher("http://www.zeit.de", "campus", consumer);
        Thread thread = new Thread(watcher);
        thread.start();
        try {
            Thread.sleep(120000);
            watcher.cancel();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
