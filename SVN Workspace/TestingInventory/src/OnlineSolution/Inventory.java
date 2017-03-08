package OnlineSolution;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

/**
 * This is a simple 'storage' class for Inventory Items used for testing various
 * algorithms for <a href="http://www.reddit.com/r/javaexamples">/r/javaexamples
 * </a>
 * <p>All of the methods that use SQL assume a SQLite database named 'Inventory.db'
 * and a table named 'Inventory' defined in package class InventoryDBAccessor.java
 * and assumes a classpath for the sqlite-JDBC driver.
 * 
 * @author /u/Philboyd_Studge
 */
public class Inventory implements Comparable<Inventory>
{
    private String partnum;
    private String item;
    private String description;
    private int qty;
    private float price;

    /**
     * Default Constructor
     */
    public Inventory()
    {
        partnum = "";
        item = "";
        description = "";
        qty = 0;
        price = 0.0f;
    }

    /**
     * Constructor from SQL ResultSet
     * @param rs ResultSet for a single row from table
     * @throws SQLException 
     */
    public Inventory(ResultSet rs) throws SQLException
    {
        loadFromSQL(rs);
    }

    /**
     * Constructor
     * @param partnum Primary key part number - must be unique
     * @param item item name
     * @param description item description
     * @param qty quantity on hand
     * @param price price per unit
     */
    public Inventory(String partnum, String item, String description, int qty, float price)
    {
        this.partnum = partnum;
        this.item = item;
        this.description = description;
        this.qty = qty;
        this.price = price;
    }

    // getters/setters
    /**
     * get partnum
     * @return String
     */
    public String getPartnum() { return partnum; }
    /**
     * set partnum
     * @param partnum 
     */
    public void setPartnum(String partnum) { this.partnum = partnum; }
    /**
     * get description
     * @return String
     */
    public String getDescription() { return description; }
    /**
     * set description
     * @param description 
     */
    public void setDescription(String description) { this.description = description; }
    /**
     * get item
     * @return String
     */
    public String getItem()	{ return item; }
    /**
     * set item
     * @param item 
     */
    public void setItem(String item) { this.item = item; }
    /**
     * get qty
     * @return int
     */
    public int getQty() { return qty; }
    /**
     * set qty
     * @param qty 
     */
    public void setQty(int qty) { this.qty = qty; }
    /**
     * get price
     * @return float
     */
    public float getPrice() { return price; }
    /**
     * set price
     * @param price 
     */
    public void setPrice(float price) { this.price = price; }

    /**
     * Calculates total value of Inventory item
     * @return float 
     */
    public float getTotal()
    {
            return qty * price;
    }

    /**
     * Over-ridden toString method
     * @return String
     */
    @Override
    public String toString()
    {
        return    "=====================\nPart #:" + partnum + "\tItem: " 
                + item + "\n" + "Quantity: " + qty + "\n"
                + "Description: " + description + "\nPrice: " + price 
                + "\n====================\n";
    }

    /**
     * Returns a Comma-separated-value string
     * @return String
     */
    public String toCSVString()
    {
            return partnum + ", " + item + "," + description + "," + qty + "," + price;
    }
 
    /**
     * Get SQL Insert statement
     * creates a String to properly insert new object into the database
     * @return String
     */
    public String getSQLInsert()
    {
        return "INSERT INTO Inventory (partnum, item, description, qty, price)"
                + "VALUES ('" + partnum + "', '" + item + "', '" + description +
                "', " + qty + "," + price + ");";
    }

    /**
     * Get SQL Update statement   
     * creates a SQL command string to update object
     * part number is not update-able
     * @return String
     */
    public String getSQLUpdate()
    {
        return "UPDATE INVENTORY "
            + "SET item = '" + item + "', description = '" + description
            + "', qty = " + qty + ", price = " + price
            + " WHERE partnum ='" + partnum + "';";
    }

    /**
     * Attempts to take the first three letters of the first two words
     * of the <code>item</code> otherwise fills with random digits
     * item must be at least 3 letters long.
     * @return 6-digit long String
     */
    public String generatePartnum()
    {
        // TODO: Check uniqueness
        Random rand = new Random();
        String retval = "";
        String[] words = item.toUpperCase().split(" ");
        for (int i = 0; i < words.length; i++)
        {
            if (i > 1) break;
            if (words[i].length() < 3)
            {
                retval += words[i];
                for (int j = 0; j < 3 - words[i].length(); j++)
                {
                    retval += "" + rand.nextInt(10);
                }
            }
            else retval += words[i].substring(0,3);
            
        }
        return retval;
    }

    /**
     * loadFromSQL()
     * takes ResultSet from constructor and fills the instance variables
     * @param rs ResultSet from InventoryDBAccessor
     * @throws SQLException 
     */
    private void loadFromSQL(ResultSet rs) throws SQLException
    {
        partnum = rs.getString("partnum");
        item = rs.getString("item");
        description = rs.getString("description");
        qty = rs.getInt("qty");
        price = rs.getFloat("price");			
    }
    /**
     * Over-ridden compareTo() sorts by item name
     * @param obj Inventory object
     * @return int
     */
    @Override
    public int compareTo(Inventory obj)
    {
        return this.item.compareTo(obj.getItem());
    }

}