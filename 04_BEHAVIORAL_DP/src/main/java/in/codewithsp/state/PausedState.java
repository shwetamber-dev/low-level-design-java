package in.codewithsp.state;

public class PausedState implements State {
    @Override
    public void play(AudioPlayer audioPlayer) {
        System.out.println("Resuming Music");
        audioPlayer.state = new PlayState();
    }

    @Override
    public void stop(AudioPlayer audioPlayer) {
        System.out.println("Stopping Music");
        audioPlayer.state = new StoppedState();
    }

    @Override
    public void pause(AudioPlayer audioPlayer) {
        System.out.println("Music already paused");
    }
}
