package in.codewithsp.prototype;

public class GamePiece implements Prototype<GamePiece>{
    private String color;

    public GamePiece(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "GamePiece{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public GamePiece clone() {
        // shallow copy
        return new GamePiece(this.color);

    }
}
