class StudentTest {
    
    public static void main(String[] args) {
        int[] studentIds = new int[] {1001, 1002, 1003};

        Student student1 = new Student(studentIds[0], "joan");
        student1.gender = "male";

        Student student2 = new Student(studentIds[1], "matt", new char[] {'A', 'B'});
        student2.gender = "male";

        Student student3 = new Student(studentIds[2], "rio");
        student3.gender = "female";

        System.out.println("Name of student1: " + student1.name);
        System.out.println("Name of student2: " + student2.name);
        System.out.println("Name of student3: " + student3.name);

        student1.updateProfile("john");
        System.out.println("Name of student1 updated: " + student1.name);

        Student student4 = student1;
        System.out.println("Name of student 4: " + student4.name);

        if (student1 == student2) {
            System.out.println("student1 and student2 are referencing same object");
        }

        if (student1 != student2) {
            System.out.println("student1 and student2 are referencing different object");
        }

        Student student5 = null;
        student5 = student1;

        if (student5 != null && (student4 == student1)) {
            System.out.println("student4's name: " + student4.name);
        }

        if (student5 != null && ((student4 == student2) || (student4 == student1))) {
            System.out.println("student4's name: " + student4.name);
        }

/////////////////////
        // student4.updateProfile("mike");
        // System.out.println("Name of student 1: " + student1.name);        

        // student4 = student2;
        // System.out.println("Name of student 4: " + student4.name);

        // student2 = student1;        
        // System.out.println("Name of student 4: " + student4.name);        
        // System.out.println("Name of student 2: " + student2.name);

        // student4 = new Student("Alex");

        // System.out.println("Name of student 4: " + student4.name);
        // System.out.println("Name of student 2: " + student2.name);
        // System.out.println("Name of student 1: " + student1.name);
        // Matt is now ready for garbage collection
    }
}