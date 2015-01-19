class Employee {
    protected int empNumber;
    protected String firstName;
    
    public Employee (int EN, String FN)
    {
	setEmpNumber(EN);
	setFirstName(FN);
    }

	public int getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
