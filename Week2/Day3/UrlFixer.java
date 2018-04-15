public class UrlFixer {

    public static void main (String [] args) {

        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

        /*url = url.replace("nevertellmethebots", "nevertellmetheodds");
        url = url.replace("https/", "https:/");
        System.out.println(url); */


        String urlPart1 = url.substring(0,5);

        String urlPart2 =":";

        String urlPart3 = url.substring(5,url.indexOf('b'));

        String urlPart4 = "odds";

        String urlComplete = urlPart1.concat(urlPart2.concat(urlPart3.concat(urlPart4)));

        System.out.println(urlComplete);
    }
}
