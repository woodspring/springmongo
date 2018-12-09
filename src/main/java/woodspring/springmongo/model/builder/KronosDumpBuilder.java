package woodspring.springmongo.model.builder;

import woodspring.springmongo.model.Kronos_Dump;

public class KronosDumpBuilder {
	
	private Kronos_Dump kd;
	
	private Integer ckdId;
	private Integer ckId =0;
	private String firstname ="";
	private String lastname ="";
	private String telphone ="";
	private String department ="";
	private String title ="";
	private String email ="";
	private String reportTo ="";

	private String h_Comp="";
	private String h_VP="";
	private String h_Site="";
	private String h_Prog="";
	private String h_Dep="";
	private String h_Subdep="";
	private String h_Title="";

	private String p_CVP="";
	private String p_Site="";
	private String p_Prog="";
	private String p_Dep="";
	private String p_Subdep="";
	private String p_Title="";
	private String p_Union="";
	
	private String orgLev6 ="";
	private String orgLev7 ="";
	private String labLev5 ="";
	private String labLev7 ="";
	
	public KronosDumpBuilder() {
		kd = new Kronos_Dump();
	}
	
	public Kronos_Dump build() {
		kd.setCkId(ckId);
		kd.setFirstName(firstname);
		kd.setLastName(lastname);
		kd.setTelphone(telphone);
		
		kd.setH_Comp(h_Comp);
		kd.setH_VP(h_VP);
		kd.setH_Site(h_Site);
		kd.setH_Prog(h_Prog);
		kd.setH_Dep(h_Dep);
		kd.setH_Subdep(h_Subdep);
		kd.setH_Title(h_Title);
	
		kd.setP_CVP(p_CVP);
		kd.setP_Site(p_Site);
		kd.setP_Prog(p_Prog);
		kd.setP_Dep(p_Dep);
		kd.setP_Subdep(p_Subdep);
		kd.setP_Title(p_Title);
		kd.setP_Union(p_Union);

		kd.setEmail(email);
		kd.setRepoerTo(reportTo);
		kd.setOrgLev6(orgLev6);
		kd.setOrgLev7(orgLev7);
		kd.setLabLev5(labLev5);
		kd.setLabLev7(labLev7);
		return kd;
	}

	public Kronos_Dump getKd() {
		return kd;
	}

	public KronosDumpBuilder setKd(Kronos_Dump kd) {
		this.kd = kd;
		return this;
	}

	public String getH_Comp() {
		return h_Comp;
	}

	public KronosDumpBuilder setH_Comp(String h_Comp) {
		this.h_Comp = h_Comp;
		return this;
	}

	public String getH_VP() {
		return h_VP;
	}

	public KronosDumpBuilder setH_VP(String h_VP) {
		this.h_VP = h_VP;
		return this;
	}

	public String getH_Site() {
		return h_Site;
	}

	public KronosDumpBuilder setH_Site(String h_Site) {
		this.h_Site = h_Site;
		return this;
	}

	public String getH_Prog() {
		return h_Prog;
	}

	public KronosDumpBuilder setH_Prog(String h_Prog) {
		this.h_Prog = h_Prog;
		return this;
	}

	public String getH_Dep() {
		return h_Dep;
	}

	public KronosDumpBuilder setH_Dep(String h_Dep) {
		this.h_Dep = h_Dep;
		return this;
	}

	public String getH_Subdep() {
		return h_Subdep;
	}

	public KronosDumpBuilder setH_Subdep(String h_Subdep) {
		this.h_Subdep = h_Subdep;
		return this;
	}

	public String getH_Title() {
		return h_Title;
	}

	public KronosDumpBuilder setH_Title(String h_Title) {
		this.h_Title = h_Title;
		return this;
	}

	public String getP_CVP() {
		return p_CVP;
	}

	public KronosDumpBuilder setP_CVP(String p_CVP) {
		this.p_CVP = p_CVP;
		return this;
	}

	public String getP_Site() {
		return p_Site;
	}

	public KronosDumpBuilder setP_Site(String p_Site) {
		this.p_Site = p_Site;
		return this;
	}

	public String getP_Prog() {
		return p_Prog;
	}

	public KronosDumpBuilder setP_Prog(String p_Prog) {
		this.p_Prog = p_Prog;
		return this;
	}

	public String getP_Dep() {
		return p_Dep;
	}

	public KronosDumpBuilder setP_Dep(String p_Dep) {
		this.p_Dep = p_Dep;
		return this;
	}

	public String getP_Subdep() {
		return p_Subdep;
	}

	public KronosDumpBuilder setP_Subdep(String p_Subdep) {
		this.p_Subdep = p_Subdep;
		return this;
	}

	public String getP_Title() {
		return p_Title;
	}

	public KronosDumpBuilder setP_Title(String p_Title) {
		this.p_Title = p_Title;
		return this;
	}

	public String getP_Union() {
		return p_Union;
	}

	public KronosDumpBuilder setP_Union(String p_Union) {
		this.p_Union = p_Union;
		return this;
	}

	public Integer getCkId() {
		return ckId;
	}

	public KronosDumpBuilder setCkId(Integer ckId) {
		this.ckId = ckId;
		return this;
	}

	public String getFirstname() {
		return firstname;
	}

	public KronosDumpBuilder setFirstname(String firstname) {
		this.firstname = firstname;
		return this;
	}

	public String getLastname() {
		return lastname;
	}

	public KronosDumpBuilder setLastname(String lastname) {
		this.lastname = lastname;
		return this;
	}

	public String getOrgLev6() {
		return orgLev6;
	}

	public KronosDumpBuilder setOrgLev6(String orgLev6) {
		this.orgLev6 = orgLev6;
		return this;
	}

	public String getOrgLev7() {
		return orgLev7;
	}

	public KronosDumpBuilder setOrgLev7(String orgLev7) {
		this.orgLev7 = orgLev7;
		return this;
	}

	public String getLabLev5() {
		return labLev5;
	}

	public KronosDumpBuilder setLabLev5(String labLev5) {
		this.labLev5 = labLev5;
		return this;
	}

	public String getLabLev7() {
		return labLev7;
	}

	public KronosDumpBuilder setLabLev7(String labLev7) {
		this.labLev7 = labLev7;
		return this;
	}

	public String getTelphone() {
		return telphone;
	}

	public KronosDumpBuilder setTelphone(String telphone) {
		this.telphone = telphone;
		return this;
	}

	public String getDepartment() {
		return department;
	}

	public KronosDumpBuilder setDepartment(String department) {
		this.department = department;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public KronosDumpBuilder setTitle(String title) {
		this.title = title;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public KronosDumpBuilder setEmail(String email) {
		this.email = email;
		return this;
	}

	public String getReportTo() {
		return reportTo;
	}

	public KronosDumpBuilder setReportTo(String reportTo) {
		this.reportTo = reportTo;
		return this;
	}


}
