package demo;

public class Test {

	public static void main(String[] args) {
		
	int[]	nums= {2,4,5,7,3};
	int target=9;
		
		 for (int i = 0; i < nums.length; i++) {
	            for (int j = i + 1; j < nums.length; j++) {
	            	
	            
	                if (nums[i] + nums[j] == target) {
	                    System.out.println("the pair is:::"+nums[i]+","+nums[j]);
	                    
	             }
	                
	                } //for
	            
		 }//for

		        
		   

	}

}
