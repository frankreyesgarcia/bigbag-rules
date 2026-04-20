public class TestExecutorService {
    public void testMethod() {
        // This pattern should be replaced by our transformation
        ExecutorService.getInstance().getExecutor(database).execute(statement);
        
        // Another example
        ExecutorService.getInstance().getExecutor(connection).execute(sqlStatement);
    }
}