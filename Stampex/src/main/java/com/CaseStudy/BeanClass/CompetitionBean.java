package com.CaseStudy.BeanClass;

public class CompetitionBean {
		private String Competiton_id;
		private String Competition_name;
		private String Description;
		private String Competition_type;
		private String Start_Date ;
		private String	Timings ;
		private String	End_Date;
		public CompetitionBean() {
			super();
			// TODO Auto-generated constructor stub
		}
		public CompetitionBean(String competiton_id, String competition_name, String description, String competition_type,
				String start_Date, String timings, String end_Date) {
			super();
			Competiton_id = competiton_id;
			Competition_name = competition_name;
			Description = description;
			Competition_type = competition_type;
			Start_Date = start_Date;
			Timings = timings;
			End_Date = end_Date;
		}
		public String getCompetiton_id() {
			return Competiton_id;
		}
		public void setCompetiton_id(String competiton_id) {
			Competiton_id = competiton_id;
		}
		public String getCompetition_name() {
			return Competition_name;
		}
		public void setCompetition_name(String competition_name) {
			Competition_name = competition_name;
		}
		public String getDescription() {
			return Description;
		}
		public void setDescription(String description) {
			Description = description;
		}
		public String getCompetition_type() {
			return Competition_type;
		}
		public void setCompetition_type(String competition_type) {
			Competition_type = competition_type;
		}
		public String getStart_Date() {
			return Start_Date;
		}
		public void setStart_Date(String start_Date) {
			Start_Date = start_Date;
		}
		public String getTimings() {
			return Timings;
		}
		public void setTimings(String timings) {
			Timings = timings;
		}
		public String getEnd_Date() {
			return End_Date;
		}
		public void setEnd_Date(String end_Date) {
			End_Date = end_Date;
		}
		@Override
		public String toString() {
			return "Competition [Competiton_id=" + Competiton_id + ", Competition_name=" + Competition_name
					+ ", Description=" + Description + ", Competition_type=" + Competition_type + ", Start_Date="
					+ Start_Date + ", Timings=" + Timings + ", End_Date=" + End_Date + "]";
		}
		
}
