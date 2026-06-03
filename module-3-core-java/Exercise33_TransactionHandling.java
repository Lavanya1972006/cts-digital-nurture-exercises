import java.sql.*;

public class Exercise33_TransactionHandling {

    public static void transfer(
            Connection con,
            int from,
            int to,
            double amount) {

        try {

            con.setAutoCommit(false);

            PreparedStatement debit =
                    con.prepareStatement(
                            "UPDATE accounts SET balance=balance-? WHERE id=?");

            debit.setDouble(1, amount);
            debit.setInt(2, from);
            debit.executeUpdate();

            PreparedStatement credit =
                    con.prepareStatement(
                            "UPDATE accounts SET balance=balance+? WHERE id=?");

            credit.setDouble(1, amount);
            credit.setInt(2, to);
            credit.executeUpdate();

            con.commit();

            System.out.println("Transfer Successful");

        } catch (Exception e) {

            try {
                con.rollback();
                System.out.println("Transaction Rolled Back");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}