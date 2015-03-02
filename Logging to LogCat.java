//This class can be used as a logging class for outputting data into the logcat. 
//It is similar to Log.d("1", "2") in Android. 

public class Misc {

	//This class logs data to the logcat	
	public static void Log(String message){
		Logger log = Logger.getLogger(Test1.class.getName());
		log.severe(message);
	}
}
	
	//To use:
	Misc.Log("output goes here yo!");
	
