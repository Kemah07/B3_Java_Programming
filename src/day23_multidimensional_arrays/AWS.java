package day23_multidimensional_arrays;
/*
Task:
            Given an app name and a String of zones in the following format

			us-east-1,us-west-1,us-west-2,us-west-3

			print the app deploying to each zone

		Ex:
			app = etsy
    			zones = us-east-1,us-west-2,us-west-1


    			output:
				Deploying etsy to us-east-1...
				Deployment completed for us-east-1
 */

public class AWS {
    public static void main(String[] args) {
        String app = "etsy";
        String zones = "us-east1,us-west1,us-west2,us-west3";

        String [] allZones = zones.split(",");

        for (String each : allZones){
            System.out.println(app + " is deploying on " + each);
        }

        System.out.println();

        // We did this just to practice the fori loop. It is doing exact same thing as above
        for (int i = 0; i <allZones.length; i++) {
            System.out.println(app + " is deploying on " + allZones [i]);
        }


    }
}
