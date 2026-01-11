//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Employee employee1 = new Employee("Pepa", "Bosnak", "Hovnocucar");
    Employee employee2 = new Employee("Mosek", "Krcek", "Myslivec");
    Employee employee3 = new Employee("Ignac", "Krcek", "Retar");
    TeamLeader teamLeader;
    teamLeader = TeamLeader.getNewTeamLeader("Milan", "Obr", "5");
    teamLeader.addTeamMember(employee1);
    teamLeader.addTeamMember(employee2);
    teamLeader.addTeamMember(employee3);
    System.out.println(teamLeader.getJobDescription());
}
