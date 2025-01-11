public class DividePens {
    public static void main(String[] args) {
        // Total number of pens 
        int totalPens = 14;
        
        // Total number of students 
        int students = 3;
        
        // Calculating the number of pens each student gets
        int pensPerStudent = totalPens / students;
        
        // Calculating the remaining pens that cannot be distributed equally
        int remainingPens = totalPens % students;
        
   
        System.out.println("The Pen Per Student is " + pensPerStudent + 
                           " and the remaining pen not distributed is " + remainingPens);
    }
}
