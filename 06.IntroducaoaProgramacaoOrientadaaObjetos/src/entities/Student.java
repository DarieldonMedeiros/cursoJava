package entities;

public class Student {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double finalGrade(){
        return grade1 + grade2 + grade3;
    }

    public double missingPoints() {
        if (finalGrade() >= 60) {
            return 0;
        }
        else {
            return 60 - finalGrade();
        }
    }

    public String toString() {
        String aux;
        if (finalGrade() >= 60) {
            aux = "FINAL GRADE = "
                    + String.format("%.2f", finalGrade())
                    + "\nPASS";
        }
        else {
            aux = "FINAL GRADE = "
                    + String.format("%.2f", finalGrade())
                    + "\nFAILED \nMISSING "
                    + String.format("%.2f", missingPoints())
                    + " POINTS";
        }
        return aux;
    }
}
