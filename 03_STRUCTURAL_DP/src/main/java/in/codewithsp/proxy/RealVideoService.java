package in.codewithsp.proxy;

public class RealVideoService implements VideoService{
    @Override
    public void playVideo(String videoId) {
        System.out.println("Requested Video " + videoId + " Played.. >> ..");
    }
}
