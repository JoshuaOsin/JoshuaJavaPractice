package practiceDay33StaticCustomClass;

public class CydeoStudent {
    public String name;
    public int age;
    public char gender;
    public int id;
    public char grade;
    public int batchNumber, groupNumber;
    public static String schoolName, programmingLanguage;

    static {
        schoolName = "Cydeo";
        programmingLanguage = "Java";
    }

    public CydeoStudent(String name, int age, char gender, int id, char grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public void study() {
        System.out.println(name + " is studying");
    }

    public void attendClass() {
        System.out.println(name + " is at the class");
    }

    public static void printSchoolName() {
        System.out.println(schoolName);
    }

    public static void printProgLanguage() {
        System.out.println(programmingLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
