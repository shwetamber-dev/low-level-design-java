package in.codewithsp.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("====== Prototype Using Clonable Interface ======");
        PrototypeWithClonable textPad = new PrototypeWithClonable("Hello");
        PrototypeWithClonable clonedTextPad = textPad.clone();
        textPad.setTextPad(" World");
        System.out.println(textPad.getTextPad());
        System.out.println(clonedTextPad.getTextPad());

        System.out.println("====== Prototype Without Clonable Interface ======");
        // Prepare Board
        GameBoard gameBoard = new GameBoard();
        GamePiece gamePieceRed = new GamePiece("RED");
        GamePiece gamePieceBlue = new GamePiece("BLUE");
        List<GamePiece> gamePieceList = new ArrayList<>();
        gamePieceList.add(gamePieceBlue);
        gamePieceList.add(gamePieceRed);
        gameBoard.setGamePieceList(gamePieceList);
        System.out.println(gameBoard.toString());

        // Clone board
        GameBoard gameBoardClone = gameBoard.clone();

        // Make changes to original board
        gameBoard.getGamePieceList().add(new GamePiece("GREEN"));
        System.out.println(gameBoard.toString());

        // Print cloned board
        System.out.println(gameBoardClone.toString());

    }
}
