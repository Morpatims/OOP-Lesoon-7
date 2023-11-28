package ru.geekbrains.lesson7.observer;

public class Program {

    public static void main(String[] args) {
        Publisher publisher = new JobAgency();
        Company google = new Company("Google", publisher, 120000);
        Company yandex = new Company("Yandex", publisher, 95000);
        Company geekBrains = new Company("GeekBrains", publisher, 98000);

        Student student1 = new Student("Студент #1");
        Master master1 = new Master("Мастер #1");
        Master master2 = new Master("Мастер #2");
        JobSeeker jobSeeker1 = new JobSeeker("Соискатель #1");

        publisher.registerObserver(student1);
        publisher.registerObserver(master1);
        publisher.registerObserver(master2);
        publisher.registerObserver(jobSeeker1);

        for (int i = 0; i < 3; i++) {
            google.publishVacancy("Java Developer", JobType.FULL_TIME);
            yandex.publishVacancy("Web Developer", JobType.PART_TIME);
            geekBrains.publishVacancy("Intern", JobType.INTERNSHIP);
        }
    }
}
