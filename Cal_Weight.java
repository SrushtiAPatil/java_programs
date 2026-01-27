package solarplanetWeight;

public class Cal_Weight {

	public static void main(String[] args) {
		double earthweight=70;
		for(Planet p1: Planet.values()) {
			System.out.println("planet : "+p1);
			System.out.println("weight of "+p1+" is : "+p1.weightOnPlanet(earthweight));
		}
	}

}

//calculating weight on different solar planet using enum

enum  Planet {
	        MERCURY(3.7), 
	        VENUS(8.87), 
	        EARTH(9.81),
	        MARS(3.71),
	        JUPITER(24.79), 
	        SATURN(10.44),
	        URANUS(8.69),
	        NEPTUNE(11.15);

	        private final double gravity;

	       private Planet(double gravity)
	       { 
	    	   this.gravity = gravity; 
	    	   }

	        public double weightOnPlanet(double earthWeight) {
	            return (earthWeight / EARTH.gravity) * this.gravity;
	        }
	    }



