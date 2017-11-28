package app.mobels;


import org.javalite.activejdbc.Model; 

public class Product extends Model {
    static {
        validatePresenceOf("title", "url").message("Product Title and URL must be provided");
    }


		
		// must have 0-arg constructor
		public Product() {
		} 
		
		// can also have convenience constructor
		public Product(String productTitle, String url) {
            set("title", productTitle);
            
            set ("url", url);
		}
		
		public product(String title, String url, String district, String contact, String seller, Date postdate, int price){
		    
		    set("title", title, "url", url,  "district" , district,  "contact", contact,   "seller", seller,   "postdate", postdate,   "price", price))
		}
		
	
	
}