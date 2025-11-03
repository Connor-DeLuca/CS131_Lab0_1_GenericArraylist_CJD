package main;

public class FirstList<E>
{    

	private final int DEFAULT_SIZE=10;
   	private int currentItem=0;
   	private E ar[];
   	@SuppressWarnings("unchecked")
	public FirstList()
	{        
   		// arList=new E[DEFAULT_SIZE];   //causes a compile error                                        				   		// because T is cast to object                                        				  	 // later if we cast object to whatever T is,
   		// say a string,
                                                                	    	// we have a runtime error                                        				 		 // We could use a java collection like ArrayList for this.                                                                                             		
   		ar=(E[]) new Object[DEFAULT_SIZE]; //Do it this way. Cast Object to type T[]
  	} 

   	@SuppressWarnings("unchecked")
    public FirstList(int length)
    {
	       // ar=new E[length]; //causes a compile error
	       ar=(E[]) new Object[length];
    }
	
	 //Students complete the class. Start with a setter called addItem    //Write code to add an item to the end of the array   
	 //New Methods Follow
	  /*** The FirstList class implements a generic array.
	  *@param  Item to add to the end of the list
	  *
	  */	  
}
