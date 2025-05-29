package Exercise.AK.WebsitenDurchThreads;

import java.util.function.Consumer;

public class WebsiteChangeWatcher implements Runnable{
    String target;
    String path;
    Consumer<String> consumer;
    boolean cancel;

    public WebsiteChangeWatcher(String target, String path, Consumer<String> consumer){
        this.target = target;
        this.path = path;
        this.consumer = consumer;
        this.cancel = false;
    }

    public void cancel(){
        this.cancel = true;
    }

    @Override
    public void run(){
        while(!cancel){
            hasChanged();
        }
    }

    public void hasChanged(){
        try{
            String content = retriveWebsiteContent();
            Thread.sleep(30000);
            String newContent = retriveWebsiteContent();
            if(!content.equals(newContent)){
                consumer.accept(newContent);
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public String retriveWebsiteContent(){
        return "Example";
    }
}
