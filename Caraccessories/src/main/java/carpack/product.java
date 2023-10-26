package carpack;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;





public class product {
	
	  String id;
		
		String Categories;
		String availability;
		String prices;
		 String image;
		static String a;
		
		
		 static boolean flageorder;
		 String description;
		 
		 static List<product> prod =new ArrayList<product>() ;
		 static List<product> prodInterior =new ArrayList<product>() ;
		 static List<product> prodExterior =new ArrayList<product>() ;
		 static List<product> prodElectronic =new ArrayList<product>() ;
		 static boolean fexist;
		 static String fint;
		 static String fextt;
		 static String felec;
		 
	
	
	
	
	
	
	 public product() { 
         this.id="1";
         this.description="car light";
      this.prices="200$";
         this.image="im1";
         this.availability="In Stock ";
         this.Categories="Electronic";
        
       
 		if( prod.isEmpty())
         prod.add(this);
 		
 		if(Categories=="Exterior")
 			prodExterior.add(this);
 		if(Categories=="Interior")
 			prodInterior.add(this);
 		if(Categories=="Electronic")
 			prodElectronic.add(this);
 			
 				
 			
	     
}
	 
	 
	 
	 public void createProduct(String id,String description,String prices,String availability,String Categories)
		{
			this.id=id;
			this.prices=prices;
			this.description=description;
			this.availability=availability;
			this.Categories=Categories;
			
			
			
			if(!prod.contains(this))
				prod.add(this);
			if(Categories=="Exterior")
				prodExterior.add(this);
			if(Categories=="Interior")
				prodInterior.add(this);
			if(Categories=="Elect`ronic")
				prodElectronic.add(this);
		
			
			
			
		}
	 
		public void updateProduct(String id,String description,String prices,String availability,String Categorie)
		{
			this.id=id;
			this.prices=prices;
			this.description=description;
			this.availability=availability;
			this.Categories=Categories;
			
			
			
			
			
			for(int i=0;i<prod.size();i++)
			{
				
				if(prod.get(i).id.equals(id)) {
					
					if(prodExterior.contains(i))
						prodExterior.remove(i);
					if(prodInterior.contains(i))
						prodInterior.remove(i);
					if(prodElectronic.contains(i))
						prodElectronic.remove(i);
					
					
				}
				
				
			if(prod.get(i).id.equals(id))
			  prod.set(i, this);
			
			
			
			
			}
			
			if(Categories=="Exterior") {
				
				prodExterior.add(this);
				
			}
			if(Categories=="Interior") {
				prodInterior.add(this);
			}
			if(Categories=="Electronic") {
				prodElectronic.add(this);
			}
				
				
		
			
		
		}
		public void deleteProduct(String id)
		{
		
			
			for(int i=0;i<prod.size();i++)
			{
				if(prod.isEmpty())
					break;
				else if(prod.get(i).id.equals(id)) {
					prod.remove(i);
					if(prodInterior.contains(i))
						prodInterior.remove(i);
					
					if(prodExterior.contains(i))
						prodExterior.remove(i);
					
					if(prodElectronic.contains(i))
						prodElectronic.remove(i);
					
				}
				    
				
			}
		
	
	 
	 
	
	
	

}


	
	public product searchProduct(String id)
	{
		if(prod.isEmpty())
			
			return null;
	

		
		for(int i=0;i<prod.size();i++)
		{
			
			 if(prod.get(i).id.equals(id)) {
				 fexist=true;
				return  prod.get(i);
				
				
			}
			    
			
		}
		return null;
		
		
	

}
	
	
	

	public String searchProductcat(String id)
	{
		if(prod.isEmpty())
			
			return null;
	

		
		for(int i=0;i<prodExterior.size();i++)
		{
			
			
			 if(prodExterior.get(i).id.equals(id)) {
				 
				fextt="yes";
				return  "Exterior";
				
			}
		}
			 
			 
		for(int i=0;i<prodInterior.size();i++) { 
			 if(prodInterior.get(i).id.equals(id)) {
				 fint="yes";	
				 return  "Interior";
					
				}
			 }
		
		for(int i=0;i<prodElectronic.size();i++) {
			 if(prodElectronic.get(i).id.equals(id)) {
				 felec="yes";
				 return "Electronic";
				 
					
					
				}
		
			 
			 
			    
			
		}
		
		
		
		
		
		return null;
		
		
	

}
	
	
	
	public void addprodInterior(String id,String description,String prices,String availability,String Categorie) {
		if(!prod.contains(this))
			prod.add(this);
		
		if(!prodInterior.contains(this))
			prodInterior.add(this);
		
		
	}
	
	public void addprodExterior(String id,String description,String prices,String availability,String Categorie) {
		if(!prod.contains(this))
			prod.add(this);
		
		if(!prodExterior.contains(this))
			prodExterior.add(this);
		
		
	}
	
	public void addprodElectronic(String id,String description,String prices,String availability,String Categorie) {
		if(!prod.contains(this))
			prod.add(this);
		
		if(!prodElectronic.contains(this))
			prodElectronic.add(this);
		
		
	}
	
	public static void printProduct() {
		
	   
       
		
		for(int i=0;i<prod.size();i++)
		{
			 a="Product : "+prod.get(i).id+" "+prod.get(i).description+" "+prod.get(i).prices+" "+
					prod.get(i).availability+" " +prod.get(i).Categories;
			
		}
		
		 System.out.println(a);
		
		
	}
	
	

	public static void printProduct(String id) {
		
	   
       
		
		for(int i=0;i<prod.size();i++)
		{
			
			 if(prod.get(i).id.equals(id)) {
			
			
			a="Product : "+prod.get(i).id+" "+prod.get(i).description+" "+prod.get(i).prices+" "+
					prod.get(i).availability+" " +prod.get(i).Categories+" " +prod.get(i).image;
			
			 }
			 
		}
		
		 System.out.println(a);
		
		
	}
	
	
	
	
	public void order(String id,String description,String prices,String availability,String Categories) {
		
		
		
		for(int i=0;i<prod.size();i++)
		{
			
			if(prod.get(i).id.equals(id)) {
				
			flageorder=true;
				
			}
		
	}
	}
	
	
 public void filter(String s) {
	 
	
	 
 }
	
	




	




	

	


}
