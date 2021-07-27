package BooksDbPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BooksInsertCls {
    public static void main(String[] args) throws SQLException {


        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ORIENTDB", "1234");

        String sqlcommand = "INSERT INTO EMPLOYEE VALUES (ORIENT_SEQ.NEXTVAL,'MEHRAC','QURBANOV','BAKU',TO_DATE('1995/07/08', 'yyyy/mm/dd'),10061)";

        PreparedStatement pst = con.prepareStatement(sqlcommand);

        pst.execute();
    }
}