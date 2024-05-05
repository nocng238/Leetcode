package Contest.Biweeky94;

import java.util.*;

public class _2512 {
    public static void main(String[] args) {
        String[] positive_feedback = { "yewmhbgnq", "vqhhuaejqw" };
        String[] negative_feedback = { "zjeyq", "oyuetqe", "ks", "vuvannpwa", "qfd", "xv", "aauvtxrdt", "gml", "eaky",
                "mwip" };
        String[] report = { "lqiuderzod mwip vqhhuaejqw xrn aqjzkqjsi riuood yewmhbgnq xv nmcvqm onhkkmy",
                "uccz yewmhbgnq rcxdaqicbe vqhhuaejqw yewmhbgnq e vqhhuaejqw b yewmhbgnq vqhhuaejqw",
                "eaky yewmhbgnq eaky dwdzl yewmhbgnq yewmhbgnq ntqpnqtmnb qfd ks gvumi",
                "ecutvv vqhhuaejqw vqhhuaejqw inu vqhhuaejqw vqhhuaejqw uu eodzum zjeyq fxebx",
                "vqhhuaejqw m vuvannpwa mwip atvjp vqhhuaejqw eaky yewmhbgnq vqhhuaejqw yewmhbgnq" };
        int[] student_id = { 581094748, 245764367, 905556075, 127263030, 415068015 };
        int k = 4;
        topStudents(positive_feedback, negative_feedback, report, student_id, k);
    }

    static public List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report,
            int[] student_id, int k) {
        List<Integer> res = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        Set<String> positive_feedbackSet = new HashSet<>(List.of(positive_feedback));
        Set<String> negative_feedbackSet = new HashSet<>(List.of(negative_feedback));
        for (int i = 0; i < report.length; i++) {
            students.add(new Student(getPoint(report[i], positive_feedbackSet, negative_feedbackSet), student_id[i]));
        }
        Collections.sort(students, new Comparator<Student>() {

            @Override
            public int compare(Student student1, Student student2) {
                if (student1.point == student2.point) {
                    return student1.rank - student2.rank;
                }
                return student2.point - student1.point;
            }

        });
        for (int i = 0; i < students.size(); i++) {
            System.out.println("Point: " + students.get(i).point);
            System.out.println("Rank: " + students.get(i).rank);
            res.add(students.get(i).rank);
        }
        return res;
    }

    static int getPoint(String report, Set<String> positiveFeedback, Set<String> negativeFeedback) {
        int point = 0;
        for (String word : report.split(" ")) {
            if (negativeFeedback.contains(word)) {
                point--;
            }
            if (positiveFeedback.contains(word)) {
                point += 3;
            }
        }
        return point;
    }

    static class Student {
        int point;
        int rank;

        public Student(int point, int rank) {
            this.point = point;
            this.rank = rank;
        }
    }
}
