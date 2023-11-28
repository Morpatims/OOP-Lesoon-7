package ru.geekbrains.lesson7.observer;

public enum JobType {
    FULL_TIME,
    PART_TIME,
    INTERNSHIP
}

public class Vacancy {

    private String title;
    private JobType jobType;
    private int salary;

    public Vacancy(String title, JobType jobType, int salary) {
        this.title = title;
        this.jobType = jobType;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public JobType getJobType() {
        return jobType;
    }

    public int getSalary() {
        return salary;
    }
}