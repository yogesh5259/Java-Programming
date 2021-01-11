import java.sql.*;
import java.util.Date;

public class Import {
    public static void main(String[] args){
        //ArrayList list = new ArrayList();
        java.util.ArrayList l = new java.util.ArrayList();
       // Date date = new Date(); // reference to Date is ambiguous

       Date date = new Date();
       System.out.println(date.getClass().getName()); //java.util.Date

    }
}
