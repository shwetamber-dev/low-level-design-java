package in.codewithsp.state;

public class PlayState implements State {
    @Override
    public void play(AudioPlayer audioPlayer) {
        System.out.println("Music already playing.");
    }

    @Override
    public void stop(AudioPlayer audioPlayer) {
        System.out.println("Stopping Music");
        audioPlayer.state = new StoppedState();
    }

    @Override
    public void pause(AudioPlayer audioPlayer) {
        System.out.println("Pausing Music");
        audioPlayer.state = new PausedState();
    }
}
