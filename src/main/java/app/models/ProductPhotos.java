package app.mobels;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.Table;

@Table("product_photos")
public class ProductPhotos extends Model {
    public ProductPhotos(String url){
        
        set ("url", url);
        
    }
}