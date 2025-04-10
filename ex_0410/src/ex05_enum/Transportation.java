package ex05_enum;

public enum Transportation {
	BUS(100){
		int totalFare(int distance){
			return distance*fare;
	}	
   },
	TRAIN(150){
	   int totalFare(int distance){
			return distance*fare;
	}	
   },
	SHIP(200){
	   int totalFare(int distance){
			return distance*fare;
	}	
   },
	AIRPLANE(250){
	   int totalFare(int distance){
			return distance*fare;
	}	
   };
	
	int fare;
	
	private Transportation(int fare){
		this.fare = fare;
	}
	
	abstract int totalFare(int distance);
}
