package OnlineSolution;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

class InventoryDBAccessor
{
    private final String JDBC_CONNECT = "jdbc:sqlite:Inventory.db";
    private final String JDBC_CLASS = "org.sqlite.JDBC";
    private final String DB_OPEN_SUCCESS = "Database connection opened successfully";
    private final String SQL_SELECT_ALL = "SELECT * FROM Inventory ORDER BY partnum ASC;";
    private final int SQL_DATABASE_ERROR = 1;

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    public InventoryDBAccessor()
    {
        try
        {
            connection = getConnection();
            statement = connection.createStatement();			
        }
        catch (SQLException e )
        {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            JOptionPane.showMessageDialog(null, "Database error : " + e.getMessage());
        }   
    }

    private Connection getConnection()
    {
        try
        {
            Class.forName(JDBC_CLASS);
            Connection c = DriverManager.getConnection(JDBC_CONNECT);
            System.out.println(DB_OPEN_SUCCESS);
            return c;
        }
        catch (ClassNotFoundException | SQLException e )
        {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            JOptionPane.showMessageDialog(null, "Database error : " + e.getMessage());
        }
        return null;
    }

    private void createTable()
    {
        try
        {
            String sql = "CREATE TABLE Inventory (partnum STRING (6)" +  
                    "UNIQUE ON CONFLICT FAIL PRIMARY KEY," +
                    "item STRING (100), description STRING (250)," + 
                    "qty INTEGER (6), price DOUBLE (8, 2));";

            // execute the statement string
            statement.executeUpdate(sql);                
        }
        catch ( SQLException e)
        {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            JOptionPane.showMessageDialog(null, "Database error : " + e.getMessage());                
        }


    }

    public ArrayList<Inventory> loadInventoryFromDB()
    {
        try
        {
            System.out.println("Loading data from table...");
            ArrayList<Inventory> invList = new ArrayList<>();

            resultSet = statement.executeQuery( SQL_SELECT_ALL );

            while (resultSet.next())
            {
                    invList.add(new Inventory(resultSet));
            }
            System.out.println("Loaded " + invList.size() + " records.");
            return invList;			
        }
        catch ( SQLException e)
        {
            if (e.getErrorCode() == SQL_DATABASE_ERROR)
            {
                createTable();
                loadInventoryFromDB();
            }
            else
            {
                System.err.println( e.getClass().getName() + ": " + e.getErrorCode() );
                JOptionPane.showMessageDialog(null, "Database error : " + e.getMessage());
            }
        }
        return null;
    }

    public void addToDB(Inventory item)
    {
            try
            {
                statement.executeUpdate(item.getSQLInsert());
            }
            catch ( SQLException e)
            {
                System.err.println( e.getClass().getName() + ": " + e.getMessage() );
                JOptionPane.showMessageDialog(null, "Database error : " + e.getMessage());
            }
    }

    public void updateDB(Inventory item)
    {
        try
        {
            statement.executeUpdate(item.getSQLUpdate());
        }
        catch ( SQLException e)
        {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            JOptionPane.showMessageDialog(null, "Database error : " + e.getMessage());
        }
    }

    public void deleteFromDB(String partnum)
    {
        try
        {
            statement.executeUpdate("DELETE from Inventory WHERE partnum ='" + partnum + "';");
        }
        catch ( SQLException e)
        {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            JOptionPane.showMessageDialog(null, "Database error : " + e.getMessage());
        }
    }

    public void close()
    {
        try
        {
            statement.close();
            connection.close();	
            System.out.println("Database successfully closed.");		
        }
        catch (SQLException e)
        {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            JOptionPane.showMessageDialog(null, "Database error : " + e.getMessage());
        }   
    }
}