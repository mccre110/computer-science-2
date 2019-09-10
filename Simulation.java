import java.util.*;
public class Simulation 
{
	private ArrayList<Integer> battleList = new ArrayList<Integer>();
	private ArrayList<Integer> warList = new ArrayList<Integer>();
	private ArrayList<Integer> doubleWarList = new ArrayList<Integer>();
	private int avgBattles;
	private int avgWars;
	private int avgDoubleWars;
	private int maxBattles;
	private int minBattles;
	private int maxWars;
	private int minWars;
	private int gameNum;

	private Simulation(int gameNum)
	{
		this.gameNum = gameNum;
	}	

	private void simulate()
	{
		for (int i=0; i<gameNum;i++) 
		{
			Game game = new Game();
			game.play();
			battleList.add(game.getBattleCount());
			warList.add(game.getWarCount());
			doubleWarList.add(game.getDoubleWarCount());
		}
	}
	private void calculate()
	{
		for (int i=0; i<gameNum;i++) 
		{
			avgBattles += battleList.get(i);
			avgWars += warList.get(i);
			avgDoubleWars += doubleWarList.get(i);
		}
		avgBattles= avgBattles/gameNum;
		avgWars= avgWars/gameNum;
		avgDoubleWars= avgDoubleWars/gameNum;
		Collections.sort(battleList);
		Collections.sort(warList);
		Collections.sort(doubleWarList);
		minBattles = battleList.get(0);
		maxBattles = battleList.get(gameNum-1);
		minWars = warList.get(0);
		maxWars = warList.get(gameNum-1);
	}
	private void report()
	{
		System.out.println("Avg Battles: "+ avgBattles);
		System.out.println("Max Battles: "+ maxBattles);
		System.out.println("Min Battles: "+ minBattles);
		System.out.println("Avg Wars: "+ avgWars);
		System.out.println("Max Wars: "+ maxWars);
		System.out.println("Min Wars: "+ minWars);
		System.out.println("Avg Double Wars: "+ avgDoubleWars);

	}
	public static void main(String[] args)
	{
		int i;
		if (args.length > 0) 
		{
    		try 
    		{
        		i = Integer.parseInt(args[0]);
        		Simulation sim = new Simulation(i);
				sim.simulate();
				sim.calculate();
				sim.report();
    		} 
    		catch (NumberFormatException e) 
    		{
        		System.err.println("Argument '" + args[0] + "' must be an integer.");
        		System.exit(1);
    		}
    	}
	}	
}