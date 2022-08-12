package algoexpert.easy._04_tournament_winner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class Tournament {

    public static String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {

        Hashtable<String, Integer> winners = new Hashtable<>();
        String w = "";
        int last = 0;
        for (int i = 0; i < competitions.size(); i++) {
            var result = results.get(i) == 0 ? 1 : 0;
            var winner = competitions.get(i).get(result);
            if (winners.isEmpty() || !winners.containsKey(winner)) {
                winners.put(winner, 3);
                if(last == 0) {
                    w = winner;
                    last = 3;
                }
            } else {
                var value = (winners.get(winner)) + 3;
                winners.replace(winner, value);
                if(value > last) {
                    w = winner;
                    last = value;
                }
            }
        }
        return w;
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> competitions = new ArrayList<ArrayList<String>>();
        ArrayList<String> competition1 = new ArrayList<String>(Arrays.asList("HTML", "C#"));
        ArrayList<String> competition2 = new ArrayList<String>(Arrays.asList("C#", "Python"));
        ArrayList<String> competition3 = new ArrayList<String>(Arrays.asList("Python", "HTML"));
        competitions.add(competition1);
        competitions.add(competition2);
        competitions.add(competition3);
        ArrayList<Integer> results = new ArrayList<Integer>(Arrays.asList(0, 0, 1));

        System.out.println(tournamentWinner(competitions, results));
    }
}
