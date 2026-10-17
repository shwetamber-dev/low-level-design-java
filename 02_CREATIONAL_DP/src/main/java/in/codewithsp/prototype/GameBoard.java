package in.codewithsp.prototype;

import java.util.ArrayList;
import java.util.List;

public class GameBoard implements Prototype<GameBoard>{

    List<GamePiece> gamePieceList;

    public List<GamePiece> getGamePieceList() {
        return gamePieceList;
    }

    public void setGamePieceList(List<GamePiece> gamePieceList) {
        this.gamePieceList = gamePieceList;
    }

    @Override
    public String toString() {
        return "GameBoard{" +
                "gamePieceList=" + gamePieceList +
                '}';
    }

    @Override
    public GameBoard clone() {
        GameBoard gameBoard = new GameBoard();
        List<GamePiece> gamePieceListClone = new ArrayList<>();
        for(GamePiece gamePiece : gamePieceList){
            gamePieceListClone.add(gamePiece.clone());
        }
        gameBoard.setGamePieceList(gamePieceListClone);
        return gameBoard;
    }
}
