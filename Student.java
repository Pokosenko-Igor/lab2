public class Student {
    private String last_name;
    private int ID;
    static int id = 0;

    Student (int ID)
    {
        id++;
        this.last_name ="";
        this.ID = ID;
    }

    Student(String last_name)
    {
        this.last_name = last_name;
        this.ID = 0;
        id++;
    }

    Student(String last_name, int ID)
    {
        this.last_name = last_name;
        this.ID = ID;
        id++;
    }

    Student()
    {
        this.last_name = "";
        this.ID = 0;
        z++;
    }


    void logg()
    {
        System.out.println("name = " + last_name);
        System.out.println("ID = " + ID);

    }

    public static void main(String[] args)
    {
        Student stud = new Student("0001");
        Student stud1 = new Student("Vasilenko");
        Student stud2 = new Student("Dude", 0002);
        Student stud3 = new Student();
	
        System.out.println(id);
        stud.logg();
        System.out.println(id);
        stud1.logg();
        System.out.println(id);
        stud2.logg();
        System.out.println(id);
        stud3.logg();
    }
    }