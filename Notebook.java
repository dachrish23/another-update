package sample2;

public class Notebook extends Items{
	private static final long serialVersionUID = 1L;
	private boolean usedBook;
	private String password;
	
	public Notebook() {
		super("notebook");
		usedBook=false;
		password="";
	}
	@Override
	public void read() {
		if (game1.FindItem("notebook")==null) {
			game1.print("take notebook first");
		}else {
			game1.print("you have opened the notebook you just found, heres the password: XXXX");
			game1.invent.add(game1.currentRoom.getItems(password));
		}
		{
		
		}if (usedBook) {
			game1.print("already used password");
		}
	
	}
}
