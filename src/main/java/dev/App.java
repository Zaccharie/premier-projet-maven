package dev;

import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String asciiTitle = FigletFont.convertOneLine("Hello World");
        System.out.println( asciiTitle );
    }
}
