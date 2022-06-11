
public class Player {

private String name;    //data members
private String role;
private int total_runs;
		
		public Player(String name,int run,String role) //parameterized constructor
		{
			this.name=name;
			this.total_runs=run;
			this.role=role;
			
		}

		public int getTotalRuns()  // to get total runs
		{
			return this.total_runs;
		}

		public String toString() 
		{
			String str = "Player Name: "+this.name+" , "+"TotalRuns: "+this.total_runs+" , "+"Role: "+this.role;
			return str;
			
		}
		public String getRoll()
		{
			return this.role;
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

