package in.codewithsp.state;

public class Main {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        // Initially Stopped
        player.pause();
        player.play();
        // Currently Playing
        player.play();
        player.pause();
        // Currently Paused
        player.play();
        player.stop();
    }
}
