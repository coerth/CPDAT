package Task3;

public class Person {
    private String name;
    private int age;
    private Job job;
    private int workHours;

    public Person(String name, int age, Job job, int workHours) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.workHours = workHours;
    }

    public int getWorkHours() {
        return workHours;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Job getJob() {
        return job;
    }
}
