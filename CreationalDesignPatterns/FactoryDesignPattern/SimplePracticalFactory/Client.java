public class Client {
    public static void main(String[] args) {
        DatabasePracticalFactory databasePracticalFactory = new DatabasePracticalFactory();
        Database sql = databasePracticalFactory.getDBConnection(SupportedDatabases.SQL);
        System.out.println(sql instanceof SQLDatabase);
        Database nosql = databasePracticalFactory.getDBConnection(SupportedDatabases.NOSQL);
        System.out.println(nosql instanceof NoSQLDatabase);
        Database postgres = databasePracticalFactory.getDBConnection(SupportedDatabases.POSTGRES);
        System.out.println(postgres instanceof PostgressDatabse);
    }
}
