package practiceDay33StaticCustomClass;

public class GroupMembers {

    public String name;

    private String phoneNumber;

    private String email;

    public static int groupNumber;

    public static String mentor;

    public static void main(String[] args) {

        int num1 = 2; // this object is int class

        GroupMembers members1 = new GroupMembers("Murat"); // groupNumber = 32

        GroupMembers members2 = new GroupMembers("Abidin", "123322");

        System.out.println(members1.name);
        System.out.println(members2.name);
        System.out.println(GroupMembers.groupNumber);



        //GroupMembers.groupNumber = 32;

    }

    static {
        groupNumber = 32;
        mentor = "Mustafa Kemal";
    }

    public GroupMembers() {

    }

    public GroupMembers(String name) {
        this.name = name;
    }

    public GroupMembers(String name, String phoneNumber) {
        this(name);
        this.phoneNumber = phoneNumber;
    }

    public void study(){
        System.out.println(groupNumber +"is studying");
    }

}
