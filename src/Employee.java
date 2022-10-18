public class Employee {

    public String name;
    public double salary;
    public int workHours;
    public int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        double temp = salary;
        if (temp > 1000){
            temp *= 0.03;
        }
        return temp;
    }
    public double bonus() {
        double temp = salary;
        if (workHours > 40) {
            temp = (workHours-40) * 30;
        }
        return temp;
    }
    public double raiseSalary() {
        double temp = salary;
        int calismaYili = 2021 - hireYear;
        if ( calismaYili < 9 && calismaYili > 0) {
            temp *= 0.05;
        }else if (calismaYili > 9 && calismaYili < 20  ) {
            temp *= 0.1;
        }
        else temp *= 0.15;
        return temp;
    }

    @Override
    public String toString() {
        return "Adı : " + name +
                "\nMaaşı : " + salary +
                "\nÇalışma Saati : " + workHours +
                "\nVergi : " + tax() +
                "\nBonus : " + bonus() +
                "\nMaaş Artışı : " + raiseSalary() +
                "\nVergi ve Bonuslar ile Maaş : " + (salary - tax() +bonus()) ;
    }

}
