public class Main {

    public static void main(String[] args ) {
        PersonTo p1 = new PersonTo(1.73);
        System.out.print(p1.getHøjde());
        System.out.println();

        p1.setHøjde(1.79);
        System.out.print("ny højde " + p1.getHøjde());

    }
}
