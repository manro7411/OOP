abstract class SuperHero {
    private String name;
    private String age;
    private String job;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    
    public abstract void skill(String skill);
    
    public void Display(){
        System.out.println("Name = "+this.name+"\nAge = "+this.age);
    }
    
}
