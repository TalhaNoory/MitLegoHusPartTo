
package DBAccessor;

/**
 * This class is used to check if the DBConnector can connect to the given database.
 */
public class ConnectionTest {
    public static void main(String[] args) {
        ConnectionTest t = new ConnectionTest();
        Connector d = t.getdb();
        System.out.println("Nåede så langt");
    }
    
    public Connector getdb(){
        try {
            Connector c = new Connector();
            return c;
        } catch (Exception ex) {
            System.out.println("Fejl ved forbindelse" + ex.getMessage());
        }
        return null;
    }
}
