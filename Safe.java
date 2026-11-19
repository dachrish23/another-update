package sample2;

public class Safe extends Items{
	private static final long serialVersionUID = 1L;
	private boolean opens;
	private boolean closes;
	
	public Safe() {
		super("safe");
		opens=false;
		closes=false;
	}
	
	@Override
	public void open() {
		if (!opens) {
			opens=true;
			game1.currentRoom.addItem(new Items("notebook"));
			game1.print("you open the safe firmly, a notebook sits");
			}
		}
	
	
	@Override
	public void close() {
		if (!closes) {
			closes=false;
			game1.print("you have closed the safe quietly");
			}
		}
	}

