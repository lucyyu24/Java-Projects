class PartTimeEmployee extends Employee {
    private float hourlySalary;
    private int hoursPerWeek;
    private int weeksPerYear;
    
    public PartTimeEmployee (int EN,  String FN, float S, int H, int W)
    {
	super (EN, FN);
	setHourlySalary(S);
	setHoursPerWeek(H);
	setWeeksPerYear(W);
    }

	public float getHourlySalary() {
		return hourlySalary;
	}

	public void setHourlySalary(float hourlySalary) {
		this.hourlySalary = hourlySalary;
	}

	public int getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	public int getWeeksPerYear() {
		return weeksPerYear;
	}

	public void setWeeksPerYear(int weeksPerYear) {
		this.weeksPerYear = weeksPerYear;
	}
}