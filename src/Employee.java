public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    private double tax() {
        if (salary > 1000) {
            return salary * 0.03;
        }

        return 0;
    }

    private int bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        }

        return 0;
    }

    private double raiseSalary() {
        int experienceYear = 2021 - hireYear;
        if (experienceYear < 10) {
            return (salary - tax() + bonus()) * 0.05;
        }

        else if (experienceYear > 19) {
            return (salary - tax() + bonus()) * 0.15;
        }

        else {
            return (salary - tax() + bonus()) * 0.1;
        }
    }

    @Override
    public String toString() {
        return "Adı: " + name + "\n"
                + "maaşı: " + salary + "\n"
                + "Çalışma saati: " + workHours + "\n"
                + "Başlangıç Yılı: " + hireYear + "\n"
                + "vergi: " + tax() + "\n"
                + "bonus: " + bonus() + "\n"
                + "Maaş artışı: " + raiseSalary() + "\n"
                + "Vergi ve bonuslarla birlikte maaş: " + (salary - tax() + bonus()) + "\n"
                + "Toplam maaş: " + (salary - tax() + bonus() + raiseSalary());
    }
}
