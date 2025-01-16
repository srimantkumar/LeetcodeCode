import java.util.*;

class Team implements Comparable<Team> {
    int id;
    int school;

    public Team(int id, int school) {
        this.id = id;
        this.school = school;
    }

    @Override
    public int compareTo(Team other) {
        return Integer.compare(other.id, this.id); // Compare by rank (higher rank first)
    }
}

public class Dummy {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int c = scanner.nextInt();

            List<Team> teams = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int id = scanner.nextInt();
                int school = scanner.nextInt();
                teams.add(new Team(id, school));
            }

            PriorityQueue<Team> priorityQueue = new PriorityQueue<>();

            int[] schoolCount = new int[n + 1];

            for (Team team : teams) {
                priorityQueue.offer(team);
                schoolCount[team.school]++;
            }

            List<Integer> result = new ArrayList<>();

            while (k > 0 && !priorityQueue.isEmpty()) {
                Team team = priorityQueue.poll();
                if (schoolCount[team.school] <= c) {
                    result.add(team.id);
                    k--;
                } else {
                    schoolCount[team.school]--;
                }
            }

            for (Integer id : result) {
                System.out.println(id);
            }
        }
}


