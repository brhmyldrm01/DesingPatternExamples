package singleton;

import java.util.concurrent.locks.Lock;

public class Singleton3 {

	public static Singleton3 singleton3;

	private Singleton3() {
		
	}
	
	public static synchronized Singleton3 Object3() {
		if(singleton3 == null){
			synchronized (Singleton3.class) {
	            if(singleton3 == null){
	            	singleton3 = new Singleton3();
	            }
	        }
        }
        return singleton3;
		
	}
	/*
	public static Singleton3 Nesne3(){
	    if(singleton3 == null){
	        synchronized (Singleton3.class) {
	            if(singleton3 == null){
	            	singleton3 = new Singleton3();
	            }
	        }
	    }
	    return singleton3;
	}
	*/
	
	
}
