public class Human {


    int age;
    int yearOfBirth;
    String name;
    String city;
    String job;

    public Human(int age, String name, String city, String job) {
        if (age>=0) {
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

        this.yearOfBirth = 2022 - age;

        if (job == null){
            this.job = "Информация не указана";
        }else {
            this.job = job;
        }
    }

    public void printHello(){
        System.out.println("Привет! Меня зовут "+name+". Я из города "+city+". " +
                "Я родился в "+yearOfBirth+" году. Я работаю на должности "+job+". Будем знакомы!");
    }

    }

