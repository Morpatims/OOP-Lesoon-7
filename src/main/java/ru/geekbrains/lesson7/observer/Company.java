package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Company {

    private Random random = new Random();

    private String name;
    private Publisher jobAgency;
    private int maxSalary;

    public Company(String name, Publisher jobAgency, int maxSalary) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
    }

    public void publishVacancy(String title, JobType jobType) {
        int salary = random.nextInt(maxSalary);
        Vacancy vacancy = new Vacancy(title, jobType, salary);
        jobAgency.sendOffer(name, vacancy);
    }
}
