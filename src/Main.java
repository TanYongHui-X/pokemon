//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //passes eevee, 25 to consutrctor #1
        Pokemon p1 = new Pokemon("Eevee", 25);
        System.out.println(p1.level);
        //ask user to give name n level
        //p1.level prints 25, p1 attack called
        p1.attack();
    }
}