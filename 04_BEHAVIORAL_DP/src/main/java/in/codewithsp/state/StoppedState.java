package in.codewithsp.state;

public class StoppedState implements State {
    @Override
    public void play(AudioPlayer audioPlayer) {
        System.out.println("Playing Music");
        audioPlayer.state = new PlayState();
    }

    @Override
    public void stop(AudioPlayer audioPlayer) {
        System.out.println("Music already stopped");
    }

    @Override
    public void pause(AudioPlayer audioPlayer) {
        System.out.println("Cannot be paused as Music is stopped");
    }
}
