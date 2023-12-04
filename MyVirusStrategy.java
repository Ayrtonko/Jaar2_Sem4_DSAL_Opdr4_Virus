import java.util.*;

public class MyVirusStrategy implements VirusStrategy {

    @Override
    public VirusMove doMove(Player currentPlayer, Player[][] playingField, ArrayList<VirusMove> moveList, int fieldSize) {
        return mostAdjEnemies(playingField, currentPlayer, moveList, fieldSize);
    }


    @Override
    public String getName() {
        return "Ayrton";
    }

    public VirusMove mostAdjEnemies(Player[][] playingField, Player currentPlayer, ArrayList<VirusMove> moveList, int fieldSize) {
        int countA = 0;
        int countB = 0;
        VirusMove mostEnemies = null;
        for (VirusMove v : moveList) {
            //1
            if ((v.to.x - 1 >= 0 && v.to.y >= 0) && (v.to.x - 1 <= fieldSize - 1 && v.to.y <= fieldSize - 1)) {
                if (playingField[v.to.x - 1][v.to.y] == getEnemy(currentPlayer)) {
                    countA++;
                }
            }
            //2
            if ((v.to.x + 1 >= 0 && v.to.y >= 0) && (v.to.x + 1 <= fieldSize - 1 && v.to.y <= fieldSize - 1)) {
                if (playingField[v.to.x + 1][v.to.y] == getEnemy(currentPlayer)) {
                    countA++;
                }
            }

            //3
            if ((v.to.x >= 0 && v.to.y + 1 >= 0) && (v.to.x <= fieldSize - 1 && v.to.y + 1 <= fieldSize - 1)) {
                if (playingField[v.to.x][v.to.y + 1] == getEnemy(currentPlayer)) {
                    countA++;
                }
            }

            //4
            if ((v.to.x >= 0 && v.to.y - 1 >= 0) && (v.to.x <= fieldSize - 1 && v.to.y - 1 <= fieldSize - 1)) {
                if (playingField[v.to.x][v.to.y - 1] == getEnemy(currentPlayer)) {
                    countA++;
                }
            }

            //5
            if ((v.to.x - 1 >= 0 && v.to.y - 1 >= 0) && (v.to.x - 1 <= fieldSize - 1 && v.to.y - 1 <= fieldSize - 1)) {
                if (playingField[v.to.x - 1][v.to.y - 1] == getEnemy(currentPlayer)) {
                    countA++;
                }
            }

            //6
            if ((v.to.x + 1 >= 0 && v.to.y - 1 >= 0) && (v.to.x + 1 <= fieldSize - 1 && v.to.y - 1 <= fieldSize - 1)) {
                if (playingField[v.to.x + 1][v.to.y - 1] == getEnemy(currentPlayer)) {
                    countA++;
                }
            }

            //7
            if ((v.to.x - 1 >= 0 && v.to.y + 1 >= 0) && (v.to.x - 1 <= fieldSize - 1 && v.to.y + 1 <= fieldSize - 1)) {
                if (playingField[v.to.x - 1][v.to.y + 1] == getEnemy(currentPlayer)) {
                    countA++;
                }
            }

            //8
            if ((v.to.x + 1 >= 0 && v.to.y + 1 >= 0) && (v.to.x + 1 <= fieldSize - 1 && v.to.y + 1 <= fieldSize - 1)) {
                if (playingField[v.to.x + 1][v.to.y + 1] == getEnemy(currentPlayer)) {
                    countA++;
                }
            }
            if (countA >= countB || countA == countB) {
                mostEnemies = v;
                countB = countA;
            }
            countA = 0;
        }
        return mostEnemies;
    }

    public Player getEnemy(Player currentPlayer) {
        if (currentPlayer == Player.RED) {
            return Player.GREEN;
        }
        else if (currentPlayer == Player.GREEN) {
            return Player.RED;
        }
        return Player.EMPTY;
    }

}