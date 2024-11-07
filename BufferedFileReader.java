package BufferedReaderPackage;
import java.io.*;

final public class BufferedFileReader 
{
    final public static void main(String[] args) throws IOException 
    {
        BufferedFileReader file_Reader;
        file_Reader = new BufferedFileReader();
        file_Reader.user_Credentials();
        mark_Reset_Example();
    }

    final public void user_Credentials() 
    {
        try 
        {
            BufferedReader user_Input;
            user_Input = new BufferedReader(new FileReader("user_Details.txt"));
            final String user_Details_Container;
            user_Details_Container = user_Input.readLine();
            while (user_Details_Container != null) 
            {
                System.out.println(user_Details_Container);
                if (user_Details_Container.contains("Brown"))
                {
                    break;
                }
            }
            user_Input.close();
        } catch (IOException error_Handler)
        {
            error_Handler.printStackTrace();
        }
    }

    final private static void mark_Reset_Example()
    {
        try 
        {
            BufferedReader user_Input;
            user_Input = new BufferedReader(new FileReader("reset_Mark.txt"));
            System.out.println("First Line: " + user_Input.readLine());
            user_Input.mark(1000);
            System.out.println("Second Line: " + user_Input.readLine());
            user_Input.reset();
            System.out.println("Reset to second line: " + user_Input.readLine());
            user_Input.close();
        } catch (IOException exception_Handler)
        {
            exception_Handler.printStackTrace();
        }
    }
};