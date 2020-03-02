package bean;

public class Student {
	String SId;
	String Sname;
	String Sage;
	String Ssex;
	
	public Student() {
		super();
	}
	public Student(String sId, String sname, String sage, String ssex) {
		super();
		SId = sId;
		Sname = sname;
		Sage = sage;
		Ssex = ssex;
	}
	public String getSId() {
		return SId;
	}
	public void setSId(String sId) {
		SId = sId;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getSage() {
		return Sage;
	}
	public void setSage(String sage) {
		Sage = sage;
	}
	public String getSsex() {
		return Ssex;
	}
	public void setSsex(String ssex) {
		Ssex = ssex;
	}
	@Override
	public String toString() {
		return "{\"SId\":"+SId + ", \"Sname\":\""+Sname + "\", \"Sage\":"+ Sage + ", \"Ssex\":"+ Ssex+"}";
	}


}
