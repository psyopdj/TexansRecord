package texansSchedule;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GetSchedule {

	public static void main(String[] args) throws FileNotFoundException {
		// Create Teams object for each team
		// Create Teams object for each of the 31 NFL teams that the Texans play against
		// AFC South
		Teams Colts = new Teams();
		Teams Jaguars = new Teams();
		Teams Titans = new Teams();

		// AFC EAST
		Teams Bills = new Teams();
		Teams Dolphins = new Teams();
		Teams Jets = new Teams();
		Teams Patriots = new Teams();
				
		// AFC NORTH
		Teams Bengals = new Teams();
		Teams Browns = new Teams();
		Teams Ravens = new Teams();	
		Teams Steelers = new Teams();

		// AFC West
		Teams Broncos = new Teams();
		Teams Chargers = new Teams();
		Teams Cheifs = new Teams();
		Teams Raiders = new Teams();

		// NFC South
		Teams Buccaneers = new Teams();
		Teams Falcons = new Teams();
		Teams Panthers = new Teams();
		Teams Saints = new Teams();

		// NFC East
		Teams Cowboys = new Teams();
		Teams Eagles = new Teams();
		Teams Giants = new Teams();
		Teams Redskins = new Teams();

		// NFC North
		Teams Bears = new Teams();
		Teams Lions = new Teams();
		Teams Packers = new Teams();
		Teams Vikings = new Teams();

		// NFC West
		Teams FortyNiners = new Teams();
		Teams Cardinals = new Teams();
		Teams Rams = new Teams();
		Teams Seahawks = new Teams();
				
		// Scan document and update wins/losses
		File x = new File("/Users/tyler/Documents/workspace/texansSchedule/texans.txt");
		Scanner sc = new Scanner(x);
		
		String line = new String();
		
		/*for(int i = 0; i < 247; i++){
			line = sc.next();
			String[] result = line.split("[|]");
			System.out.println(result[0]);
			System.out.println(result[1]);
		}*/
		
		while (sc.hasNext()){
			line = sc.next();
			String[] result = line.split("[|]");
			
			// AFC South
			if (result[0].equals("IND")){
				if (result[1].equals("W")){
					Colts.addWin();
				}
				else if (result[1].equals("L")){
					Colts.addLoss();
				}
			}
			else if (result[0].equals("JAX")){
				if (result[1].equals("W")){
					Jaguars.addWin();
				}
				else if (result[1].equals("L")){
					Jaguars.addLoss();
				}
			}
			else if (result[0].equals("TEN")){
				if (result[1].equals("W")){
					Titans.addWin();
				}
				else if (result[1].equals("L")){
					Titans.addLoss();
				}
			}
			
			// AFC East
			else if (result[0].equals("BUF")){
				if (result[1].equals("W")){
					Bills.addWin();
				}
				else if (result[1].equals("L")){
					Bills.addLoss();
				}
			}
			else if (result[0].equals("MIA")){
				if (result[1].equals("W")){
					Dolphins.addWin();
				}
				else if (result[1].equals("L")){
					Dolphins.addLoss();
				}
			}
			else if (result[0].equals("NYJ")){
				if (result[1].equals("W")){
					Jets.addWin();
				}
				else if (result[1].equals("L")){
					Jets.addLoss();
				}
			}
			else if (result[0].equals("NE")){
				if (result[1].equals("W")){
					Patriots.addWin();
				}
				else if (result[1].equals("L")){
					Patriots.addLoss();
				}
			}
			
			// AFC North
			else if (result[0].equals("CIN")){
				if (result[1].equals("W")){
					Bengals.addWin();
				}
				else if (result[1].equals("L")){
					Bengals.addLoss();
				}
			}
			else if (result[0].equals("CLE")){
				if (result[1].equals("W")){
					Browns.addWin();
				}
				else if (result[1].equals("L")){
					Browns.addLoss();
				}
			}
			else if (result[0].equals("BAL")){
				if (result[1].equals("W")){
					Ravens.addWin();
				}
				else if (result[1].equals("L")){
					Ravens.addLoss();
				}
			}
			else if (result[0].equals("PIT")){
				if (result[1].equals("W")){
					Steelers.addWin();
				}
				else if (result[1].equals("L")){
					Steelers.addLoss();
				}
			}
			
			// AFC West
			else if (result[0].equals("DEN")){
				if (result[1].equals("W")){
					Broncos.addWin();
				}
				else if (result[1].equals("L")){
					Broncos.addLoss();
				}
			}
			else if (result[0].equals("LAC")){
				if (result[1].equals("W")){
					Chargers.addWin();
				}
				else if (result[1].equals("L")){
					Chargers.addLoss();
				}
			}
			else if (result[0].equals("KC")){
				if (result[1].equals("W")){
					Cheifs.addWin();
				}
				else if (result[1].equals("L")){
					Cheifs.addLoss();
				}
			}
			else if (result[0].equals("OAK")){
				if (result[1].equals("W")){
					Raiders.addWin();
				}
				else if (result[1].equals("L")){
					Raiders.addLoss();
				}
			}
			
			// NFC South
			else if (result[0].equals("TB")){
				if (result[1].equals("W")){
					Buccaneers.addWin();
				}
				else if (result[1].equals("L")){
					Buccaneers.addLoss();
				}
			}
			else if (result[0].equals("ATL")){
				if (result[1].equals("W")){
					Falcons.addWin();
				}
				else if (result[1].equals("L")){
					Falcons.addLoss();
				}
			}
			else if (result[0].equals("CAR")){
				if (result[1].equals("W")){
					Panthers.addWin();
				}
				else if (result[1].equals("L")){
					Panthers.addLoss();
				}
			}
			else if (result[0].equals("NO")){
				if (result[1].equals("W")){
					Saints.addWin();
				}
				else if (result[1].equals("L")){
					Saints.addLoss();
				}
			}
			
			// NFC East
			else if (result[0].equals("DAL")){
				if (result[1].equals("W")){
					Cowboys.addWin();
				}
				else if (result[1].equals("L")){
					Cowboys.addLoss();
				}
			}
			else if (result[0].equals("PHI")){
				if (result[1].equals("W")){
					Eagles.addWin();
				}
				else if (result[1].equals("L")){
					Eagles.addLoss();
				}
			}
			else if (result[0].equals("NYG")){
				if (result[1].equals("W")){
					Giants.addWin();
				}
				else if (result[1].equals("L")){
					Giants.addLoss();
				}
			}
			else if (result[0].equals("WAS")){
				if (result[1].equals("W")){
					Redskins.addWin();
				}
				else if (result[1].equals("L")){
					Redskins.addLoss();
				}
			}
			
			// NFC North
			else if (result[0].equals("CHI")){
				if (result[1].equals("W")){
					Bears.addWin();
				}
				else if (result[1].equals("L")){
					Bears.addLoss();
				}
			}
			else if (result[0].equals("DET")){
				if (result[1].equals("W")){
					Lions.addWin();
				}
				else if (result[1].equals("L")){
					Lions.addLoss();
				}
			}
			else if (result[0].equals("GB")){
				if (result[1].equals("W")){
					Packers.addWin();
				}
				else if (result[1].equals("L")){
					Packers.addLoss();
				}
			}
			else if (result[0].equals("MIN")){
				if (result[1].equals("W")){
					Vikings.addWin();
				}
				else if (result[1].equals("L")){
					Vikings.addLoss();
				}
			}
			
			// NFC West
			else if (result[0].equals("SF")){
				if (result[1].equals("W")){
					FortyNiners.addWin();
				}
				else if (result[1].equals("L")){
					FortyNiners.addLoss();
				}
			}
			else if (result[0].equals("ARZ")){
				if (result[1].equals("W")){
					Cardinals.addWin();
				}
				else if (result[1].equals("L")){
					Cardinals.addLoss();
				}
			}
			else if (result[0].equals("LAR")){
				if (result[1].equals("W")){
					Rams.addWin();
				}
				else if (result[1].equals("L")){
					Rams.addLoss();
				}
			}
			else if (result[0].equals("SEA")){
				if (result[1].equals("W")){
					Seahawks.addWin();
				}
				else if (result[1].equals("L")){
					Seahawks.addLoss();
				}
			}
		}
		sc.close();
		
		// PRINT THE RECORDS
		// AFC South
		System.out.println(" ");
		System.out.println("AFC South");
		System.out.println("    " + "Colts: " + Colts.getWins() + " - " + Colts.getLosses());
		System.out.println("    " + "Jaguars: " + Jaguars.getWins() + " - " + Jaguars.getLosses());
		System.out.println("    " + "Titans: " + Titans.getWins() + " - " + Titans.getLosses());
		
		// AFC East
		System.out.println(" ");
		System.out.println("AFC East");
		System.out.println("    " + "Bills: " + Bills.getWins() + " - " + Bills.getLosses());
		System.out.println("    " + "Dolphins: " + Dolphins.getWins() + " - " + Dolphins.getLosses());
		System.out.println("    " + "Jets: " + Jets.getWins() + " - " + Jets.getLosses());
		System.out.println("    " + "Patriots: " + Patriots.getWins() + " - " + Patriots.getLosses());

		// AFC North
		System.out.println(" ");
		System.out.println("AFC North");
		System.out.println("    " + "Bengals: " + Bengals.getWins() + " - " + Bengals.getLosses());
		System.out.println("    " + "Browns: " + Browns.getWins() + " - " + Browns.getLosses());
		System.out.println("    " + "Ravens: " + Ravens.getWins() + " - " + Ravens.getLosses());
		System.out.println("    " + "Steelers: " + Steelers.getWins() + " - " + Steelers.getLosses());
		
		// AFC West
		System.out.println(" ");
		System.out.println("AFC West");
		System.out.println("    " + "Broncos: " + Broncos.getWins() + " - " + Broncos.getLosses());
		System.out.println("    " + "Chargers: " + Chargers.getWins() + " - " + Chargers.getLosses());
		System.out.println("    " + "Cheifs: " + Cheifs.getWins() + " - " + Cheifs.getLosses());
		System.out.println("    " + "Raiders: " + Raiders.getWins() + " - " + Raiders.getLosses());
		
		// NFC South
		System.out.println(" ");
		System.out.println("NFC South");
		System.out.println("    " + "Buccaneers: " + Buccaneers.getWins() + " - " + Buccaneers.getLosses());
		System.out.println("    " + "Falcons: " + Falcons.getWins() + " - " + Falcons.getLosses());
		System.out.println("    " + "Panthers: " + Panthers.getWins() + " - " + Panthers.getLosses());
		System.out.println("    " + "Saints: " + Saints.getWins() + " - " + Saints.getLosses());

		// NFC East
		System.out.println(" ");
		System.out.println("NFC East");
		System.out.println("    " + "Cowboys: " + Cowboys.getWins() + " - " + Cowboys.getLosses());
		System.out.println("    " + "Eagles: " + Eagles.getWins() + " - " + Eagles.getLosses());
		System.out.println("    " + "Giants: " + Giants.getWins() + " - " + Giants.getLosses());
		System.out.println("    " + "Redskins: " + Redskins.getWins() + " - " + Redskins.getLosses());

		// NFC North
		System.out.println(" ");
		System.out.println("NFC North");
		System.out.println("    " + "Bears: " + Bears.getWins() + " - " + Bears.getLosses());
		System.out.println("    " + "Lions: " + Lions.getWins() + " - " + Lions.getLosses());
		System.out.println("    " + "Packers: " + Packers.getWins() + " - " + Packers.getLosses());
		System.out.println("    " + "Vikings: " + Vikings.getWins() + " - " + Vikings.getLosses());

		// NFC West
		System.out.println(" ");
		System.out.println("NFC West");
		System.out.println("    " + "49ers: " + FortyNiners.getWins() + " - " + FortyNiners.getLosses());
		System.out.println("    " + "Cardinals: " + Cardinals.getWins() + " - " + Cardinals.getLosses());
		System.out.println("    " + "Rams: " + Rams.getWins() + " - " + Rams.getLosses());
		System.out.println("    " + "Seahawks: " + Seahawks.getWins() + " - " + Seahawks.getLosses());
	}
}
