
public class Start {
	
	public int start (int stake, int day, int bet) {
		
		
		int goal;
		int win = 0;
		int lose = 0;
		int play = 0;
		int intstake = 100;
		int tempwin = 0;
		int templose = 0;
		
		
		for (int i = 1; i <= day; i++) {
			System.out.println("day :"+i);		
			
			
			boolean b = true;
		
				while(b) {
					
			double random = (Math.random());
			play++;
			System.out.println("total no. of plays : "+play);

				if (random > 0.5) {
					stake = stake + bet;
					win++;
					System.out.println("total wins :"+win);
				} else {
					stake = stake - bet;
					lose++;
					System.out.println("total loses :" +lose);
				} 
				if(stake == intstake/2 || stake == intstake*1.5) {
					b= false;
//				break;
				}
				
				System.out.println("stake" +stake);
				System.out.println("-----------------------");
				 
			}
				if(win > tempwin) {
					tempwin = win;
					System.out.println("luckiest day is :"+i+"\t"+tempwin);
				}
					
					if(lose > templose) {
						templose = lose;
						System.out.println("unluckiest day is :"+i+"\t"+templose);
						}
					
				intstake = stake;
				if(stake == 0) {
				break;
				}
				
				if(stake == intstake*2) {
					day = 4;
					System.out.println("i want to continue to the next month :");
				}
		} 
				return stake; 
	}
}
