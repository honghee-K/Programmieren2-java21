package Exercise.AK.WebsitenDurchThreads;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        Consumer<String> consumer = s -> System.out.println(s);
        WebsiteChangeWatcher websiteChangeWatcher = new WebsiteChangeWatcher("https://www.zeit.de", "campus", consumer);
        Thread myThread = new Thread(websiteChangeWatcher);
        myThread.start();
        try{
            myThread.sleep(120000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
