
public class Main {

	public static void main(String[] args) {
		
		Player dhoni = new Player("dhoni",10324,"wicket-keeper"); //objects dhoni and virat created
		Player virat = new Player("virat",9236,"batsman");
		
		//Player p3 = new Player();
		
		if(dhoni.getTotalRuns()>virat.getTotalRuns()) //checking who scored more no of runs
		{
			System.out.println(dhoni);
		}
		else
		{
			System.out.println(virat);
		}
		
		System.out.println(dhoni.getRoll());
	}

}
