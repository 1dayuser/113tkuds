public class ScoreStatistics {
    public static void main(String[] args) {
        int[] scores={85,92,77,60,88,95,73,68,89,91};
        int sum=0;
        for(int score:scores){
            sum+=score;
        }
        double average=(double)sum/scores.length;
        int studentCount=scores.length;

        System.out.println("=成績統計報表=");
        System.out.println(studentCount);
        System.out.println(sum);
        System.out.println(average);
        System.out.println("\n個別成績:");
        for(int i=0;i<scores.length;i++);
            System.out.println("第%2d位學生:%d 分\n",i+1,scores[i]);
    }
}
