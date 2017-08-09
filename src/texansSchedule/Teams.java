package texansSchedule;

public class Teams {
	private int win;
	private int loss;
	
	Teams() {
		win = 0;
		loss = 0;
	}
	
	public int getWins() {
		return win;
	}
	
	public int getLosses() {
		return loss;
	}
	
	public void addWin() {
		win++;
	}
	
	public void addLoss() {
		loss++;
	}
}
