import java.time.LocalDate;

public class Human {


    public int age;
    private int yearOfBirth;
    public String name;
    private String city;
    public String job;

    public Human(int age, String name, String city, String job) {
        if (age>=0 && age<120) {
            this.age = age;
        }else {
            this.age = Math.abs(age);
        }

        if (name == null){
            this.name = "Информация не указана";
        }else {
        this.name = name;
        }

        if (city == null){
            this.city = "Информация не указана";
        }else {
            this.city = city;
        }

        this.yearOfBirth = LocalDate.now().getYear() - age;

        if (yearOfBirth < 0){
            this.yearOfBirth = 0;
        }else {
            this.yearOfBirth = yearOfBirth;

            if (job == null){
                this.job = "Информация не указана";
            }else {
                this.job = job;
            }
        }
    }


    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth < 0){
            this.yearOfBirth = 0;
        }else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city == null){
            this.city = "Информация не указана";
        }else {
            this.city = city;
        }
        }


    public void printHello(){
        System.out.println("Привет! Меня зовут "+name+". Я из города "+city+". " +
                "Я родился в "+yearOfBirth+" году. Я работаю на должности "+job+". Будем знакомы!");
    }

    }

