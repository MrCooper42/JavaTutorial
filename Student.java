class Student {
    // variable declarations
    int id;
    String name;
    String gender = "male";
    char[] grades;
    // Coinstructors
    Student(int id, String name) {
        this(name); // Invoking overlaoded constructor. If present, should be first statement
        this.id = id;
    }

    Student(int id, String name, char[] grades) {
        this(name);
        this.id = id;
        this.grades = grades;
    }
    
    Student(String name) {
        this.name = name;

    }

    // method definitons
    // boolean updateProfile(String name) {
    //     this.name = name;
    //     return true;
    // }

    String updateProfile(String name) {
        String tempVal = this.name;
        this.name = name;
        return tempVal;
    }
}