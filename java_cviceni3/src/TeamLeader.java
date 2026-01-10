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
}
