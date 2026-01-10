public class Employee {
    private String name, surname, jobDescription;

    public Employee(String name, String surname, String jobDescription) {
        this.name = name;
        this.surname = surname;
        this.jobDescription = jobDescription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    @Override
    public String toString() {
        return "Jsem " +name +
                " "+ surname +
                ", " + getJobDescription();
    }
}
