import java.util.*;;
public class recap {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please inset the limited number");
            int number = sc.nextInt();
            int temp=0;
            for (int i = 1; i <= number; i++) {
                 temp+=i;
            }
            System.out.println(temp);
            result(number);

            Company e1 = new Company();
            e1.setName("Ratchanon");
            e1.setLname("Traitiprat");
            e1.display();

            
        }
        public static void result(int num){
            System.out.println(num);
        }
    
}
class Company{
    int id;
    String name;
    String lname;
    String department;
    double salary;
    public void company(int id,String name,String lname){
        this.id =id;
        this.name = name;
        this.lname = lname;

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void display(){
        System.out.println("Firstname : "+this.name+"Lastname : "+this.lname);
    }
}
class Career extends Company{
    private String skills;

    public void skill(String skill){
        System.out.println("Skill : "+skill);

    }
    public void bonus(int number){

    }
}
