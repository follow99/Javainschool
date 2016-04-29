package ca3;

public class Patient {
	private String Fname;
	private String Lname;
	private String Address;
	private int PhoneNumberP;
	private String ConditionDescrption;
	private String SummaryOfTreatment;
        private String PPS;
	

	public Patient(String fname, String lname, String address, int phoneNumberP,String PPS, String conditionDescrption ) {
		super();
		setFname(fname);
		setLname(lname);
		setAddress(address);
		setPhoneNumber(phoneNumberP);
                setPPS(PPS);
		setConditionDescrption(conditionDescrption);
	}
	
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}

	public int getPhoneNumber() {
		return PhoneNumberP;
	}
	public void setPhoneNumber(int phoneNumberP) {
		PhoneNumberP = phoneNumberP;
	}
	public String getConditionDescrption() {
		return ConditionDescrption;
	}
	public void setConditionDescrption(String conditionDescrption) {
		ConditionDescrption = conditionDescrption;
	}
	public String getSummaryOfTreatment() {
		return SummaryOfTreatment;
	}
	public void setSummaryOfTreatment(String summaryOfTreatment) {
		SummaryOfTreatment = summaryOfTreatment;
	}
	

	public String getPPS() {
		return PPS;
	}

	public void setPPS(String pPS) {
		PPS = pPS;
	}

}
