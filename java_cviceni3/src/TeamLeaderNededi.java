public class TeamLeaderNededi {
    private Employee employee;
    private  int numOfTeamMembers;
    private Employee[] teamMembers;
    public TeamLeaderNededi(String firstName, String lastName, int numOfTeamMembers) {
        this.employee = new Employee(firstName, lastName, "Já to tady vedu");
        this.numOfTeamMembers = 0;
        this.teamMembers = new Employee[numOfTeamMembers];
    }

    public boolean AddTeamMember(Employee employee) {
        teamMembers[numOfTeamMembers] = employee;
        numOfTeamMembers++;
        return true;
    }
}
