//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    User firstUser = new User("María",0.0);
    User secondUser = new User("Juan",0.0);

    firstUser.spendMoney(400.0);
    secondUser.spendMoney(1000.0);


    System.out.println(secondUser.compareTo(firstUser));


    }
}