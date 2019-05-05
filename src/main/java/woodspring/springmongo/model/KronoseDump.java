package woodspring.springmongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Document
@Getter
@Setter
@ToString
public class KronoseDump {
	
	@Id
	private String kId;
	
	private String ckId;
	private String firstname;
	private String lastname;
	private String telphone;
	private String  h_Comp;
	private String h_VP;
	private String h_Site;
	private String  h_Prog;
	private String  h_Dep;
	private String  h_Subdep;
	private String  h_Title;
	
	private String p_CVP;
	private String p_Site;
	private String  p_Prog;
	private String  p_Dep;
	private String  p_Subdep;
	private String  p_Title;
	private String  p_Union;
	private String  email;
	private String  repoerTo;
	private String  orgLev6;
	private String  orgLev7;
	private String  labLev5;
	private String  labLev7;
	
}
