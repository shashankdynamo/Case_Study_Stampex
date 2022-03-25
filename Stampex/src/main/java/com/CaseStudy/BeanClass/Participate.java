package com.CaseStudy.BeanClass;

public class Participate{

	private String Name;
	private String City;
	private String Competition_type;
	private String Theame_name;
	private int Total_no_Frames;
	private int Total_no_Stamps;
	private String Description;
	public Participate() {}
	public Participate(String name, String city, String competition_type, String theame_name, int total_no_Frames,
			int total_no_Stamps, String description){
		super();
		this.Name = name;
		this.City = city;
		this.Competition_type = competition_type;
		this.Theame_name = theame_name;
		this.Total_no_Frames = total_no_Frames;
		this.Total_no_Stamps = total_no_Stamps;
		this.Description = description;
	}

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		this.City = city;
	}
	public String getCompetition_type() {
		return Competition_type;
	}
	public void setCompetition_type(String competition_type) {
		this.Competition_type = competition_type;
	}
	public String getTheame_name() {
		return Theame_name;
	}
	public void setTheame_name(String theame_name) {
		this.Theame_name = theame_name;
	}
	public int getTotal_no_Frames() {
		return Total_no_Frames;
	}
	public void setTotal_no_Frames(int total_no_Frames) {
		this.Total_no_Frames = total_no_Frames;
	}
	public int getTotal_no_Stamps() {
		return Total_no_Stamps;
	}
	public void setTotal_no_Stamps(int total_no_Stamps) {
		this.Total_no_Stamps = total_no_Stamps;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		this.Description = description;
	}
	@Override
	public String toString() {
		return "Participate [Name=" + Name + ", City=" + City + ", Competition_type=" + Competition_type
				+ ", Theame_name=" + Theame_name + ", Total_no_Frames=" + Total_no_Frames + ", Total_no_Stamps="
				+ Total_no_Stamps + ", Description=" + Description + "]";
	}


}
