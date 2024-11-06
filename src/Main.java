public class Main {
    public static void main(String[] args) {
    Author siera = new Author("Кэти", "Сьерра");
        Book learningJava = new Book("Изучаем Java", siera, 2015);
        learningJava.setYearBook(2020);
        System.out.println(siera.getFirstName() + " " + siera.getLastName());
        System.out.println("название: " + learningJava.getNameBook());
        System.out.println("год издания: " + learningJava.getYearBook());
        System.out.println();

        Author shildt = new Author("Gerbert", "Shildt");
        Book fullJava = new Book("Полное руководство", shildt, 2023);
        fullJava.setYearBook(fullJava.getYearBook() + 1);
        System.out.println(shildt.getFirstName() + " " + shildt.getLastName());
        System.out.println("название: " + fullJava.getNameBook());
        System.out.println("год издания: " + fullJava.getYearBook());
    }
}