class User {
    int id; 
    String name;
    int salary;

    User(int userId, String userName) {
        id = userId;
        name = userName;
    }

    User(int userId, String userName, int userSalary) {
        this(userId, userName);
        salary = userSalary;
    }

    public static void main(String[] args) {
        User instructorz = new User(1002, "Matt", 63000);
        System.out.println("Name: " + instructorz.name);
    }
}