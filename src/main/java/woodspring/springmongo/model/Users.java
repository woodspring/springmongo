package woodspring.springmongo.model;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;



@Data
@Document(collection = "users")
public class Users extends BaseEntity{

	@TextIndexed
	private String name;
	private String age;
	
	@Indexed
	private String status;
	

}
