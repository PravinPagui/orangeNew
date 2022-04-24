
	public class orangeNew {
		String color;
		orangeNew(String color) 
		{
		this.color=color;
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		orangeNew greenApple = new orangeNew("green");
		String color = greenApple.getcolor();
		System.out.println("color of apple is " + color);
		
		    }
		
			
	  String getcolor()
	    {
		  
	      return color; 
	   
	    }
	  
	} 