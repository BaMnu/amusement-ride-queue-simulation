import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deque<Person> clients = new ArrayDeque<>(generateClients());

        while (!clients.isEmpty()) {
            for (Person client : clients) {
                if (client.countTickets()) {
                    clients.offerLast(client);
                    System.out.println(client);
                    clients.remove(client);
                } else {
                    clients.remove();
                }
                break;
            }
        }
    }

    public static List<Person> generateClients() {
        List<Person> queueClients = new LinkedList<>();
        queueClients.add(new Person("Alex", "Jackson", 10));
        queueClients.add(new Person("Andrew", "Williams", 8));
        queueClients.add(new Person("Tatyana", "Ogorodnikova", 3));
        queueClients.add(new Person("Mary", "Panfilova", 6));
        queueClients.add(new Person("Garry", "Garrison", 5));

        return queueClients;
    }
}
