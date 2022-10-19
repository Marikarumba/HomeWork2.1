public class Main {


    public static void main(String[] args) {


        Human maxim = new Human(35,"Максим", "Минск", "бренд-менеджер");
        Human ann = new Human(29,"Аня", "Москва","методист образовательных программ");
        Human kate = new Human(28,"Катя", "Калининград", "продакт-менеджер");
        Human artem = new Human(27,"Артем", "Москва","директор по развитию бизнеса");
        Human vlad = new Human(21, "Владимир", "Казань", null);

        maxim.printHello();
        ann.printHello();
        kate.printHello();
        artem.printHello();
        vlad.printHello();
    }

}