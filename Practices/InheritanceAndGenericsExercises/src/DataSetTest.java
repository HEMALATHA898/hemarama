/**
 * This program tests the DataSet class.
 */
public class DataSetTest {
    public static void main(String[] args) {

        DataSet bankData = new DataSet();

        bankData.add(new BankAccount(0));
        bankData.add(new BankAccount(10000));
        bankData.add(new BankAccount(2000));

        System.out.println("Average balance = "
                + bankData.getAverage());

        Measurable max = bankData.getMaximum();

        // This is Polymorphism. getMeasure method is overrided from Measurable class in BankAccount
        System.out.println("Highest balance = "
                + max.getMeasure());


    }
}