public class Person {
    protected String firstName;
    protected String lastName;
    protected int tickets;

    public Person(String firstName, String lastName, int tickets) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.tickets = tickets;
    }

    public boolean countTickets() {
        if (tickets > 0) {
            tickets--;
            return true;
        }
        return false;
    }

    public String toString() {
        return "Посетитель [" + firstName + " " + lastName
                + "] прокатился на атракционе. Остаток билетов: " + tickets;
    }
}