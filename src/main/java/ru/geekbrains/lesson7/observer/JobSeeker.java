package ru.geekbrains.lesson7.observer;

public class JobSeeker implements JobApplicant {

    private String name;

    public JobSeeker(String name) {
        this.name = name;
    }

    @Override
    public void applyForJob(String companyName, Vacancy vacancy) {
        System.out.printf("Соискатель %s: Рассматриваю вакансию! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                name, companyName, vacancy.getTitle(), vacancy.getSalary());
    }
}