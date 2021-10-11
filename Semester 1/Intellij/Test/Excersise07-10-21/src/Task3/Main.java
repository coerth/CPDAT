package Task3;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Person> persons = new ArrayList<>();
    public static ArrayList<Job> jobs = new ArrayList<>();
    public static void main(String[] args) {
        Salary salary = new Salary();
        Job job1 = new Job("Trucker", 158.71f);
        Job job2 = new Job("Programmer", 250.50f);
        Job job3 = new Job("Bartender", 160.25f);

        jobs.add(job1);
        jobs.add(job2);
        jobs.add(job3);

        Person person1 = new Person("Casper", 26, jobs.get(0), 37);
        Person person2 = new Person("Long", 29, jobs.get(1), 20);
        Person person3 = new Person("Mia", 30, jobs.get(2), 16);

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        for(Person f : persons){
            System.out.println("Name:"+f.getName()+" - Age:"+f.getAge()+" - HPW:"+f.getWorkHours());
            System.out.println("Job:"+f.getJob().getTitle()+" - Salary:"+f.getJob().getSalary()+" Per hour");
            System.out.println("Monthly:"+salary.calculateMonthlySalary(f.getJob().getSalary(), f.getWorkHours())+ " - Yearly:"+salary.calculateYearlySalary(f.getJob().getSalary(), f.getWorkHours()));
            if(persons.indexOf(f) != persons.size()-1){
                System.out.println();
            }
        }
    }
}
