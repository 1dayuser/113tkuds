public class StudentGradeSystem {
    public static char getGrade(int score) {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else return 'D';
    }

    public static void printReport(int[] scores) {
        int sum = 0;
        int max = scores[0], min = scores[0];
        int maxIndex = 0, minIndex = 0;
        int countA = 0, countB = 0, countC = 0, countD = 0;
        int countAboveAverage = 0;

        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            sum += score;
            if (score > max) {
                max = score;
                maxIndex = i;
            }
            if (score < min) {
                min = score;
                minIndex = i;
            }

            char grade = getGrade(score);
            switch (grade) {
                case 'A': countA++; break;
                case 'B': countB++; break;
                case 'C': countC++; break;
                case 'D': countD++; break;
            }
        }

        double average = (double) sum / scores.length;

        for (int score : scores) {
            if (score > average) {
                countAboveAverage++;
            }
        }

        double aboveAvgPercentage = ((double) countAboveAverage / scores.length) * 100;

        // 輸出報告
        System.out.println("========= 學生成績報告 =========");
        System.out.printf("全班平均分數：%.2f%n", average);
        System.out.printf("最高分：%d (學生編號 %d)%n", max, maxIndex);
        System.out.printf("最低分：%d (學生編號 %d)%n", min, minIndex);
        System.out.println("各等級人數：A=" + countA + " B=" + countB + " C=" + countC + " D=" + countD);
        System.out.printf("高於平均分數的學生比例：%.2f%%%n", aboveAvgPercentage);
        System.out.println("--------- 詳細列表 ---------");
        System.out.printf("%-10s %-10s %-10s%n", "學生編號", "分數", "等級");
        System.out.println("----------------------------------");

        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            char grade = getGrade(score);
            System.out.printf("%-10d %-10d %-10c%n", i, score, grade);
        }
        System.out.println("==================================");
    }

    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 96, 87, 73, 89, 94, 81, 88};

        printReport(scores);
    }
}
