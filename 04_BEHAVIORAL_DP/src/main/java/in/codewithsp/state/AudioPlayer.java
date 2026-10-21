package in.codewithsp.state;

public class AudioPlayer {
    State state;

    public AudioPlayer() {
        this.state = new StoppedState();
    }

    public void setState(State state) {
        this.state = state;
    }
    public State getState() {
        return state;
    }
    // Delegating operations to the current state
    public void play() {
        state.play(this);
    }
    public void pause() {
        state.pause(this);
    }
    public void stop() {
        state.stop(this);
    }

}
