class FullTimeEmployee extends Employee {
    private float yearlySalary;
    
    public FullTimeEmployee (int EN,  String FN, float S)
    {
	super (EN, FN);
	setYearlySalary(S);
    }

	public float getYearlySalary() {
		return yearlySalary;
	}

	public void setYearlySalary(float yearlySalary) {
		this.yearlySalary = yearlySalary;
	}
}
