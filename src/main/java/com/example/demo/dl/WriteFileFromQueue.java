package com.example.demo.dl;
 
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;

 
/**
 * 
 * @author liam
 *
 */
public class WriteFileFromQueue {
 
	public static void main(String[] args) {

		FileWriter fw= null;
    	BufferedWriter bufw= null;
        try {
        	File file = new File(System.getProperty("user.dir")+File.separator+"upload"+File.separator+"liam.txt");
			File mkdirFile = new File(System.getProperty("user.dir")+File.separator+"upload"+File.separator);
        	if(!file.exists()){
        	    if(!mkdirFile.exists()){
                    mkdirFile.mkdirs();
                }
        		file.createNewFile();
        	}
			fw=new FileWriter(file,true);  
			bufw=new BufferedWriter(fw);
		} catch (IOException e) {
			e.printStackTrace();
		} 
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
        
        for(int i = 0; i < 10; i++){
        	new Thread(new SaveDataToQueue(queue, "写入数据为：  "+i)).start();
        }
        new Thread(new PutDataToFile(queue, bufw)).start();
		
	}
 
}