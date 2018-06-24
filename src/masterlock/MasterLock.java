// Author: Zachary J. Zeitlin
// Concept: 
// Documentation: http://toool.nl/images/e/e5/The_New_Master_Lock_Combination_Padlock_V2.0.pdf
// No error checking present.


package masterlock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class MasterLock
{
    public static CombinationLock myLock;
    public static ArrayList<String> combinations;
    public static ArrayList<String> result;
    public static int maxLength;
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        combinations = new ArrayList<String>();
        result = new ArrayList<String>();
        while(true)
        {
            System.out.print("Enter combination (ex. UUDDLRLR): ");
            myLock = new CombinationLock(scanner.nextLine());
            System.out.print("Enter max combination length to search for (<12): ");
            maxLength = scanner.nextInt(); String crlf = scanner.nextLine();

            System.out.println("\nYour combination state: " + myLock + "\n");
            System.out.println("Populating list of possible solutions...");
            populateCombinations(maxLength);

            System.out.println("Narrowing list to combinations that result in the same state...\n");
            System.out.println(findSimilarCombinations(myLock));
            System.out.print("\nFinished: ");
            if(result.isEmpty())
                System.out.println("No alternate combinations found (for combinations less than "+ (maxLength+1) +" movements.");
            else
                System.out.println(result.size() + " alternate combinations found.");
            System.out.println("\n///////////////////////////////////////////////////////////////\n");
        }
    }

    public static void populateCombinations(int length)
    {
        for(int lcv=0; lcv<=length; lcv++)
            generate(lcv, "");
    }

    public static ArrayList<String> findSimilarCombinations(CombinationLock lock)
    {
        CombinationLock temp = new CombinationLock();
        for(String x : combinations)
        {
            temp.setCombination(x);
            if(temp.equals(lock))
                result.add(temp.toStringCombination());
        }

        // remove duplicates
        HashSet set = new HashSet(result);
        result.clear();
        result.addAll(set);
        return result;
    }

    private static void generate(int length, String part)
    {
        if (length <= 0)
        {
            combinations.add(part);
        } 
        else
        {
            generate(length-1, part + "U");
            generate(length-1, part + "R");
            generate(length-1, part + "D");
            generate(length-1, part + "L");
        }
    }

}