public class TeamLeader extends Employee {

    private int numOfTeamMembers;
    Employee[] teamMembers;

    public TeamLeader(String name, String surname, int maxNumOfTeamMembers) {
        // 1. Volání konstruktoru rodiče (Employee)
        // Náplň práce je pevně stanovena na "já to tady řídím"
        super(name, surname, "já to tady řídím");
        // 2. Inicializace pole na zadanou velikost
        this.teamMembers = new Employee[maxNumOfTeamMembers];
        // 3. Nastavení počítadla členů na 0
        this.numOfTeamMembers = 0;
    }

    public boolean addTeamMember(Employee teamMember) {
        if(numOfTeamMembers < teamMembers.length) {
            teamMembers[numOfTeamMembers] = teamMember;
            numOfTeamMembers++;
            return true;
        }
        return false;
    }
    static public TeamLeader getNewTeamLeader(String name, String surname, String maxNumOfTeamMembers) {
        int maxNumOfTeamMembersInt = Integer.parseInt(maxNumOfTeamMembers);
        return new TeamLeader(name, surname, maxNumOfTeamMembersInt);
    }

    @Override
    public String getJobDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append("Jmenuji se ");
        sb.append(super.getName());
        sb.append(" ");
        sb.append(super.getSurname());
        sb.append("\n");
        sb.append(super.getJobDescription());
        sb.append("\n");
        sb.append("Vedu tyto lidi: ");
        sb.append('\n');
        for(int i = 0; i < numOfTeamMembers; i++) {
            sb.append(teamMembers[i].toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
