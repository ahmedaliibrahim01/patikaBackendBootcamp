public class Employee {
    String name, surname;
    double salary;
    int workHours;
    int hireYear;
    int raiseSalary = 0;
    int bonus;
    double tax = 0;
    Employee(String name, String surname, double salary, int workHours, int hireYear){
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        if (salary > 1000){
            tax = salary * 0.03;
        }else {
            tax = 0;
        }
        return tax;
    }

    double bonus(){
        if(workHours > 40){
            bonus = workHours - 40;
            bonus = bonus * 30;
        }else {
            bonus = 0;
        }
        return bonus;
    }

    int raiseSalary(){
        int thisYear = 2021;
        if (thisYear - hireYear < 10){
            raiseSalary = (int) (this.salary*0.05);
        } else if ((thisYear - hireYear > 9) || (thisYear - hireYear < 20)) {
            raiseSalary = (int) (this.salary*0.10);
        }
        if (thisYear - hireYear > 19){
            raiseSalary = (int) (this.salary*0.15);
        }
        return raiseSalary;
    }
    void print(){
        System.out.println("Adı                                 : " + this.name +" " + this.surname);
        System.out.println("Maaş                                : " + this.salary);
        System.out.println("Çalışma Saati                       : " + this.workHours);
        System.out.println("Başlangıç Yılı                      : " + this.hireYear);
        System.out.println("Vergi                               : " + this.tax());
        System.out.println("Bonus                               : " + this.bonus());
        System.out.println("Maaş Artışı                         : " + this.raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (bonus()  + salary - tax()));
        System.out.println("Toplam Maaş                         : " + (bonus()  + salary - tax() + raiseSalary()));

    }
}
