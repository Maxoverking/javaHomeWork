package students;

public class Students {

    private static int counter = 1;

    final private static char SEP = ',';

    final private int id;

    private String name;

    private String group;

    private String email;

    public Students(String name, String group) {
        this.id = counter;
        this.name = name;
        this.group = group;

        ++counter;
    }

    public Students(String name, String group, String email) {
        this.id = counter;
        this.name = name;
        this.group = group;
        this.email = email;

        ++counter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGroup() {
        return group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public static Students parseStudents(String group, String line) {
        int sepIndex = line.indexOf(SEP);
        if (sepIndex != -1) {
            String name = line.substring(0, sepIndex);
            String email = line.substring(sepIndex + 1);
            return new Students(name, group, email);

        }
        String name = line;
        return new Students(name, group);
    }

}
