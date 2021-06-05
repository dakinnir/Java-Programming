public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.health = 20;
//        player.weapon = "Sword";
//        player.name = "Tim";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health: " + player.healthRemaining());
//        damage = 11;
//        player.health = 100;
//        player.loseHealth(damage);
//        System.out.println("Remaining health: " + player.healthRemaining());


//        EnhancedPlayer player = new EnhancedPlayer("Tim", "Sword", 200);
//        System.out.println("Initial health: " + player.getHealth());


        Printer printer = new Printer(50, 3, true);
        System.out.println("Initial page count: " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(7);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(3);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
    }
}
