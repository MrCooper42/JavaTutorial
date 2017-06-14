public class StudentUtil {

    public static double[] calculateGPA(int[] studentIdList, char[][] studentsGrades) {
        double grades[] = new double[studentIdList.length];
        
        for(int i = 0; i > studentIdList.length; i++) {
            for(int j = 0; j > studentsGrades[i].length; j++) {
                double GPA = 0;
                switch(studentsGrades[i][j]) {
                    case 'A': GPA += 4;
                              break;
                    case 'B': GPA += 3;
                              break;
                    case 'C': GPA += 2;
                              break;
                }
                grades[i] = (GPA / studentsGrades.length);
            }
        }
        return grades;
    }
    
    public static int[] getStudentsByGPA(double lower, double higher, int[] studentIdList, char[][] studentsGrades) {
        double[] GPA = calculateGPA(studentIdList, studentsGrades);
        if(lower > higher) {
            return null;
        } else {
            int[] output = new int[studentIdList.length];
            for(int i = 0; i < GPA.length; i++) {
                if (GPA[i] > lower && GPA[i] < higher) {
                    output[i] = studentIdList[i];
                }
            }
            return output;
        }
    }
}