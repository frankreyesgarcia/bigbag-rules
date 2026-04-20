/**
 * Test file to verify the ExecutorService API transformation
 */
public class ExecutorServiceTest {
    
    public void testOldAPI() {
        // This should be transformed by our processor
        ExecutorService.getInstance().getExecutor(database).execute(statement);
        
        // Another example
        ExecutorService.getInstance().getExecutor(connection).execute(sqlStatement);
    }
    
    public void testNewAPI() {
        // This should NOT be transformed
        ExecutorService.getInstance().execute(database, statement);
    }
}