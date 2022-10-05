public class DatabasePracticalFactory{
    public Database getDBConnection(SupportedDatabases supportedDatabases){
        return switch (supportedDatabases){
            case SQL ->  new SQLDatabase();
            case NOSQL -> new NoSQLDatabase();
            case POSTGRES -> new PostgressDatabse();
        };
    }
}
