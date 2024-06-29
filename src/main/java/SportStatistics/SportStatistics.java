package SportStatistics;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File: ");
        String file = scanner.nextLine();

        ArrayList<Match> records = readRecordsFromFile(file);

        System.out.println("Team: ");
        String teamName = scanner.nextLine();

        int gamesCount = 0;
        int wins = 0;
        int loses = 0;
        for (Match match : records) {
            if (match.getHomeTeam().equals(teamName) || match.getVisitingTeam().equals(teamName)) {
                gamesCount++;  // Подсчет игр команды
                if (match.getHomeTeam().equals(teamName) && match.getHomeTeamPoints() > match.getVisitingTeamsPoints()) {
                    wins++;  // Победы домашней команды
                } else if (match.getVisitingTeam().equals(teamName) && match.getVisitingTeamsPoints() > match.getHomeTeamPoints()) {
                    wins++;  // Победы гостевой команды
                } else {
                    loses++;  // Все остальные случаи - поражения
                }
            }
        }

        System.out.println("Games: " + gamesCount);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + loses);
    }

    public static ArrayList<Match> readRecordsFromFile(String file) {
        ArrayList<Match> matches = new ArrayList<>();
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamPoints = Integer.parseInt(parts[2]);
                int visitingTeamPoints = Integer.parseInt(parts[3]);
                matches.add(new Match(homeTeam, visitingTeam, homeTeamPoints, visitingTeamPoints));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return matches;
    }
}