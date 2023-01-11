import java.io.*;

	import java.io.IOException;  
	class maryam{  
	  void m()throws IOException{  
	    throw new IOException("ERROR OCCURED"); 
	  }  
	  void n()throws IOException{  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("Exception handled");}  
	  }  
	  public static void main(String args[]){  
	   maryam obj=new maryam();  
	   obj.p();  
	   System.out.println("");  
	  }  
	}

