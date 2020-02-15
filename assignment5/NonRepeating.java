package assignment5;

public class NonRepeating {
	
	static int firstNonRepeating(String str) 
	{ 
	    int x = 256; 
	      
	   
	    int arr[] = new int[x]; 
	    for (int i = 0;  
	             i < x; i++) 
	        arr[i] = -1; 
	  
	    
	    for (int i = 0;  
	             i < str.length(); i++)  
	    { 
	        if (arr[str.charAt(i)] == -1) 
	            arr[str.charAt(i)] = i; 
	        else
	            arr[str.charAt(i)] = -2; 
	    } 
	  
	    int res = Integer.MAX_VALUE; 
	    for (int i = 0; i < x; i++) 
	  
	      
	        if (arr[i] >= 0) 
	            res = Math.min(res, arr[i]); 
	  
	    return res; 
	} 
	  
	
	public static void main(String args[]) 
	{ 
	    String str = "happy"; 
	      
	    int index = firstNonRepeating(str); 
	    if (index == Integer.MAX_VALUE) 
	        System.out.print("-1"); 
	    else
	        System.out.print(str.charAt(index)); 
	} 
	} 

