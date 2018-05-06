package mainPackage;

import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;

public class MainProgram {
	public static void main(String []args) {
		//BufferedReader in = new BufferedReader(new FileReader());
		//File sourceFileName =new File(MainProgram.class.getResource("InputFiles/Document1.csv").getFile());
		long startTime = System.currentTimeMillis();
		ExecutorService executor = Executors.newFixedThreadPool(3);
		for (int i = 0; i < args.length; i++) {
			Runnable worker = new WorkerThread(args[i]);
			executor.execute(worker);// calling execute method of ExecutorService
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Finished converting all files.\nTotal time taken to process "
		+ args.length + " files is: "
				+ (endTime - startTime) + " milliSeconds");

	}

}
