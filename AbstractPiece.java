public class AbstractPiece {

	private int color;
	private int shape;
	private int position;
	private GraphicsObserver graphicsObserver;
	private int speed;
	private boolean existence = false;

	public int getColor() {
		return color;
	}
	
	public void setColor(int c) {
		color = c;
	}
	
	public int getShape() {
		return shape;
	}
	
	public int getPosition() {
		return position;
	}
	
	public void initialize() {
		// calls to createBlock	to setup a piece
		existence = true;
	}
	
	public void clearPiece(){
		existence = false;	
	}
	
	public boolean exists() {
		return existence;	
	}
	
	
	public void rotate() {
		// TODO - implement AbstractPiece.rotate
		throw new UnsupportedOperationException();
	}

	public void drop() {
		// TODO - implement AbstractPiece.drop
		throw new UnsupportedOperationException();
	}

	public void moveLeft() {
		// TODO - implement AbstractPiece.moveLeft
		throw new UnsupportedOperationException();
	}

	public void moveRight() {
		// TODO - implement AbstractPiece.moveRight
		throw new UnsupportedOperationException();
	}

	public void speedDown() {
		// TODO - implement AbstractPiece.speedDown
		throw new UnsupportedOperationException();
	}

	public boolean hasLeftContact() {
		// TODO - implement AbstractPiece.hasLeftContact
		throw new UnsupportedOperationException();
	}

	public boolean hasRightContact() {
		// TODO - implement AbstractPiece.hasRightContact
		throw new UnsupportedOperationException();
	}

	public boolean hasBottomContact() {
		// TODO - implement AbstractPiece.hasBottomContact
		throw new UnsupportedOperationException();
	}

}
