package WS25.lek19.browser;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

public class Browser
{
    public Optional<URL> back()
    {
        try
        {
            //simulate: fetch last URL from Stack
            URL url = Math.random() < 0.5 ? new URL("http://google.de") : null;
            return Optional.ofNullable(url);

        }
        catch(MalformedURLException e)
        {
            return Optional.empty();
        }
    }

    public String retrieveSite(URL url)
    {
        //simulate download site:
        return url.toString();
    }
    public static void main(String[] args)
    {
        System.out.println("Normal back");
        Browser browser = new Browser();
        browser.back().ifPresent(url -> {
            String site = browser.retrieveSite(url);
        });
    }
}
