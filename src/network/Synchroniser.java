package network;

import data.Coordinates;
import data.Coordinates.DirectionOnBoard;
import data.GameObserver;
import data.Piece;
import data.Piece.PieceModification;
import data.Player;
import data.Player.PlayerModification;
import data.Tile;
import data.Tile.TileModification;

//TODO
public class Synchroniser extends GameObserver {

	@Override
	protected void update(Piece modifiedPiece, PieceModification modification) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void update(Tile modifiedTile, TileModification modification) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void update(Player modifiedPlayer, PlayerModification modification) {
		// TODO Auto-generated method stub

	}

	public void handleRemotePieceNotification(Coordinates identifier,
			PieceModification modif) {
		// TODO Auto-generated method stub

	}

	public void handleRemotePlayerNotification(DirectionOnBoard identifier,
			PlayerModification modif) {
		// TODO Auto-generated method stub

	}

}
