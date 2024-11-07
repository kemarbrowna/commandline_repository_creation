package BufferedReaderPackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

final public class BufferedConsoleReader 
{
    final public static void main(String[] args) throws IOException 
    {
        age();
        BufferedConsoleReader none_Static = new BufferedConsoleReader();
        none_Static.full_Name();
    }

    final public void full_Name() throws IOException
    {
        BufferedReader user_Input_Reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your Full Name?");
        final String full_Name;
        full_Name = user_Input_Reader.readLine();
        user_Input_Reader.skip(5);
        user_Input_Reader.mark(5);
        user_Input_Reader.reset();
        System.out.println("My Full Name is: " + full_Name);
        if (user_Input_Reader.ready()) 
        {
            System.out.println("I am ready.");
        }
        else 
        {
            System.out.println("I am not ready.");
        }
        user_Input_Reader.close();
    }

    final private static void age() throws IOException
    {
        BufferedReader user_Input_Age = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How old are you?");
        final int age;
        age = user_Input_Age.read();
        System.out.println("I am " + age + " years old.");
        user_Input_Age.close();
    }
};