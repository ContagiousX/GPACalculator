import java.util.Scanner;

public class gpaCalc {

    public static Scanner scan = new Scanner(System.in);
    public static void main(String [] args)
    {

        int numOfCourses = askCourses();
        String [] grades = new String[numOfCourses];
        String [] level = new String[numOfCourses];
        double gpa = 0.00;

        for(int i = 0; i < numOfCourses; i++)
        {
            grades[i] = askGrade();
            System.out.println();
        }

        for(int i = 0; i < numOfCourses; i++)
        {
            level[i] = askLevel();
            System.out.println();
        }


        for(int i = 0; i < numOfCourses; i++)
        {
           gpa += regularGPAScale(grades[i],level[i]);
        }

        System.out.println(gpa / (double)numOfCourses);


    }

    public static int askCourses()
    { 
        System.out.println("How many courses?");
        return scan.nextInt();
    }

    public static String askGrade()
    {
        System.out.println("Whats your grade?");
        return scan.next().toUpperCase();
    }
    public static String askLevel()
    {
        System.out.println("Whats your level?(AP,H,I,R)");
        return scan.next().toUpperCase();
    }

    public static double regularGPAScale(String grade, String level)
    {
        if(level.equals("R"))
        {
            if(grade.equals("A+"))
                return 4.33;
            else if(grade.equals("A"))
                return 4.00;
            else if(grade.equals("A-"))
                return 3.67;
            else if(grade.equals("B+"))
                return 3.33;
            else if(grade.equals("B"))
                return 3.00;
            else if(grade.equals("B-"))
                return 2.67;
            else if(grade.equals("C+"))
                return 2.33;
            else if(grade.equals("C"))
                return 2.00;
            else if(grade.equals("C-"))
                return 1.67;
            else if(grade.equals("D"))
                return 1.00;
            else if(grade.equals("F"))
                return 0.00;
        }
        if(level.equals("I"))
        {
            if(grade.equals("A+"))
                return 5.33;
            else if(grade.equals("A"))
                return 5.00;
            else if(grade.equals("A-"))
                return 4.67;
            else if(grade.equals("B+"))
                return 4.33;
            else if(grade.equals("B"))
                return 4.00;
            else if(grade.equals("B-"))
                return 3.67;
            else if(grade.equals("C+"))
                return 3.33;
            else if(grade.equals("C"))
                return 3.00;
            else if(grade.equals("C-"))
                return 2.67;
            else if(grade.equals("D"))
                return 1.00;
            else if(grade.equals("F"))
                return 0.00;
        }
        if(level.equals("AP") || level.equals("H"))
        {
            if(grade.equals("A+"))
                return 6.33;
            else if(grade.equals("A"))
                return 6.00;
            else if(grade.equals("A-"))
                return 5.67;
            else if(grade.equals("B+"))
                return 5.33;
            else if(grade.equals("B"))
                return 5.00;
            else if(grade.equals("B-"))
                return 4.67;
            else if(grade.equals("C+"))
                return 4.33;
            else if(grade.equals("C"))
                return 4.00;
            else if(grade.equals("C-"))
                return 3.67;
            else if(grade.equals("D"))
                return 1.00;
            else if(grade.equals("F"))
                return 0.00;

        }

        return 0.00;
      
    }

    
}
