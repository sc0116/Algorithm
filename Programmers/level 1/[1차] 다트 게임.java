import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Stack;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        Stack<Integer> dart = new Stack<>();

        Pattern pattern = Pattern.compile("([0-9]+)([SDT])([*#]?)");
        Matcher matcher = pattern.matcher(dartResult);

        while (matcher.find()) {
            int score = Integer.parseInt(matcher.group(1));
            String bonus = matcher.group(2);
            String option = matcher.group(3);

            score = calculateBonus(score, bonus);
            calculateOption(dart, score, option);
        }

        answer = getTotalScore(dart);
        return answer;
    }

    private int calculateBonus(int score, String bonus) {
        if (bonus.equals("D")) {
            return (int) Math.pow(score, 2);
        } else if (bonus.equals("T")) {
            return (int) Math.pow(score, 3);
        }
        return score;
    }

    private void calculateOption(Stack<Integer> dart, int score, String option) {
        if (option.equals("*")) {
            if (!dart.isEmpty()) {
                dart.push(dart.pop() * 2);
            }
            dart.push(score * 2);
        } else if (option.equals("#")) {
            dart.push(-score);
        } else {
            dart.push(score);
        }
    }

    private int getTotalScore(Stack<Integer> dart) {
        int totalScore = 0;

        while (!dart.isEmpty()) {
            totalScore += dart.pop();
        }

        return totalScore;
    }
}
