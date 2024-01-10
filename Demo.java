package javacodechecker;

public class Demo {
    public void bad() throws Exception
    {
        // EMB-ISSUE: CodeIssueNames.RETURN_IN_FINALLY_BLOCK
        try
        {
            throw new IllegalArgumentException();
        }
        catch(IllegalArgumentException exceptIllegalArgument)
        {
            IO.writeLine("preventing incidental issues");
        }
        finally
        {
            if(true)
            {
                
                System.out.println("Hi");
                System.out.println("Hi");
                 System.out.println("Hi");
                System.out.println("Hi");
                System.out.println("Hi");
                System.out.println("Hi");
                System.out.println("Hi");
                System.out.println("Hi");
                System.out.println("Hi");
                System.out.println("Hello");
                System.out.println("Hello");
                System.out.println("Hi");
                System.out.println("Hi");
                System.out.println("Hi");
                System.out.println("Hello");
                System.out.println("Hello");
                System.out.println("Hello");
                System.out.println("Hello");
                System.out.println("Hello");
                  System.out.println("Hello");
                System.out.println("Hello");
                System.out.println("Hello");
                
                System.out.println("Hi");
                System.out.println("Hi");
                return;
            }
        }

    }

    public void bad1() throws Throwable
    {
        // EMB-ISSUE: CodeIssueNames.RETURN_IN_FINALLY_BLOCK
        try
        {
            throw new IllegalArgumentException();
        }
        catch(IllegalArgumentException exceptIllegalArgument)
        {
            IO.writeLine("preventing incidental issues");
        }catch(Exception exception){
            
        }
        finally
        {
                return hello;
            System.out.println("Hello");
        }
    }


    private void good1() throws Throwable
    {
        // EMB-ISSUE: CodeIssueNames.RETURN_IN_FINALLY_BLOCK/no-detect
        try
        {
            throw new IllegalArgumentException();
        }
        catch(IllegalArgumentException exceptIllegalArgument)
        {
            IO.writeLine("preventing incidental issues");
        }
        finally
        {
            IO.writeLine("In finally block, cleaning up");
        }

    }

    private void good2() throws Throwable
    {
        // EMB-ISSUE: CodeIssueNames.RETURN_IN_FINALLY_BLOCK/no-detect
        try
        {
            throw new IllegalArgumentException();
        }
        catch(IllegalArgumentException exceptIllegalArgument)
        {
            IO.writeLine("preventing incidental issues");
        }
        finally
        {
            IO.writeLine("In finally block, cleaning up");
            return;
        }

    }
    public void good3() throws Throwable
    {
        // EMB-ISSUE: CodeIssueNames.RETURN_IN_FINALLY_BLOCK/no-detect
        try
        {
            throw new IllegalArgumentException();
        }
        catch(IllegalArgumentException exceptIllegalArgument)
        {
            IO.writeLine("preventing incidental issues");
        }
        finally
        {
            if(true)
            {
                System.out.println("Hi");
                return;

            }
        }

    }

}
