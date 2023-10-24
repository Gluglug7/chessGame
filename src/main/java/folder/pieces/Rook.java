package folder.pieces;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javafx.scene.image.ImageView;

public class Rook extends Piece {
  public Rook(String colour, ImageView image) {
    this.colour = colour;
    this.type = "rook";
    this.hasMoved = false;
    this.image = image;
  }

  /**
   * Returns a set of all possible moves for a rook at the given coordinates.
   *
   * @param xOrdinate The x ordinate of the rook.
   * @param yOrdinate The y ordinate of the rook.
   * @return A set of all possible moves for a rook at the given coordinates.
   */
  public Set<int[]> moveSet(int xOrdinate, int yOrdinate, List<List<Piece>> board) {
    Set<int[]> moves = new HashSet<int[]>();
    // Handling adding all the possible horizontal and vertical moves
    for (int i = 1; i < 8; i++) {
      if (xOrdinate + i < 8
          && !board.get(yOrdinate).get(xOrdinate + i).getColour().equals(this.colour)) {
        if (board.get(yOrdinate).get(xOrdinate + i).getType().equals("empty")) {
          moves.add(new int[] {xOrdinate + i, yOrdinate});
        } else if (board.get(yOrdinate).get(xOrdinate + i).getColour() != this.colour) {
          moves.add(new int[] {xOrdinate + i, yOrdinate});
          break;
        } else {
          break;
        }
      } else {
        break;
      }
    }
    for (int i = 1; i < 8; i++) {
      if (xOrdinate - i >= 0
          && !board.get(yOrdinate).get(xOrdinate - i).getColour().equals(this.colour)) {
        if (board.get(yOrdinate).get(xOrdinate - i).getType().equals("empty")) {
          moves.add(new int[] {xOrdinate - i, yOrdinate});
        } else if (board.get(yOrdinate).get(xOrdinate - i).getColour() != this.colour) {
          moves.add(new int[] {xOrdinate - i, yOrdinate});
          break;
        } else {
          break;
        }
      } else {
        break;
      }
    }
    for (int i = 1; i < 8; i++) {
      if (yOrdinate + i < 8
          && !board.get(yOrdinate + i).get(xOrdinate).getColour().equals(this.colour)) {
        if (board.get(yOrdinate + i).get(xOrdinate).getType().equals("empty")) {
          moves.add(new int[] {xOrdinate, yOrdinate + i});
        } else if (board.get(yOrdinate + i).get(xOrdinate).getColour() != this.colour) {
          moves.add(new int[] {xOrdinate, yOrdinate + i});
          break;
        } else {
          break;
        }
      } else {
        break;
      }
    }
    for (int i = 1; i < 8; i++) {
      if (yOrdinate - i >= 0
          && !board.get(yOrdinate - i).get(xOrdinate).getColour().equals(this.colour)) {
        if (board.get(yOrdinate - i).get(xOrdinate).getType().equals("empty")) {
          moves.add(new int[] {xOrdinate, yOrdinate - i});
        } else if (board.get(yOrdinate - i).get(xOrdinate).getColour() != this.colour) {
          moves.add(new int[] {xOrdinate, yOrdinate - i});
          break;
        } else {
          break;
        }
      } else {
        break;
      }
    }
    return moves;
  }
}
