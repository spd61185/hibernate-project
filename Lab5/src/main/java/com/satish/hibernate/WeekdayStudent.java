package com.satish.hibernate;

public class WeekdayStudent extends CurrentStudent{
	private String qualification;
	private String percentage;
	private int yoe;
	
	public WeekdayStudent() {}

	public WeekdayStudent(String sname, String city, String status, double totalfree, double feebal, String timings,
			String branch, String qualification, String percentage, int yoe) {
		super(sname, city, status, totalfree, feebal, timings, branch);
		this.qualification = qualification;
		this.percentage = percentage;
		this.yoe = yoe;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	public int getYoe() {
		return yoe;
	}

	public void setYoe(int yoe) {
		this.yoe = yoe;
	}

	@Override
	public String toString() {
		return "WeekdayStudent [qualification=" + qualification + ", percentage=" + percentage + ", yoe=" + yoe + "]";
	}
	
	
}
