package in.codewithsp.state;

public interface State {
    void play(AudioPlayer audioPlayer);
    void stop(AudioPlayer audioPlayer);
    void pause(AudioPlayer audioPlayer);
}
