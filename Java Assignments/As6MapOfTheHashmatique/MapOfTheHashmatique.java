import java.util.HashMap;
import java.util.Set;

public class MapOfTheHashmatique {
    public static void main (String[] args){

        HashMap<String, String> trackList = new HashMap<String, String>();
            trackList.put("Hello", " hello its me I was wondering if after all these years you'd like to meet");
            trackList.put("turn up", "turn up the music just turn it up louder");
            trackList.put("strangers", "strangers in the night exchanging glances wondering in the night what were the chances");
            trackList.put("without me", "found you when your heart was broke I fill your cup till it overflowed");

            String track = trackList.get("strangers");
            System.out.println(track);

            Set<String> keys = trackList.keySet();
            for(String key: keys) {
                System.out.println("Track name: " + key);
                System.out.println("Lyrics: " + trackList.get(key));
            }
    }

}
