package in.codewithsp.proxy;

import java.util.HashSet;
import java.util.Set;

public class ProxyVideoService implements VideoService{

    String secret;
    RealVideoService realVideoService;
    private final Set<String> cachedVideos = new HashSet<>();

    public ProxyVideoService(String secret) {
        this.secret = secret;
    }

    @Override
    public void playVideo(String videoId) {
        if(secret.equals("THATSECRETSTRING")){
            if(cachedVideos.contains(videoId)){
                System.out.println("Requested Video " + videoId + " Played. from proxy. >> ..");
            }else {
                cachedVideos.add(videoId);
                realVideoService = new RealVideoService();
                realVideoService.playVideo(videoId);
            }
        }else{
            System.out.println("Authentication failed");
        }
    }
}
