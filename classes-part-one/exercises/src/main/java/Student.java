public class Student {
        private String name;

        public String getName() {
                return name;
        }

        private int studentId;

        public void setName(String name) {
                this.name = name;
        }

        public int getStudentId() {
                return studentId;
        }

        public void setStudentId(int studentId) {
                this.studentId = studentId;
        }

        public int getNumberOfCredits() {
                return numberOfCredits;
        }

        public void setNumberOfCredits(int numberOfCredits) {
                this.numberOfCredits = numberOfCredits;
        }

        public double getGpa() {
                return gpa;
        }

        public void setGpa(double gpa) {
                this.gpa = gpa;
        }

        private int numberOfCredits = 0;
        private double gpa = 0.0;

        // Drop your getters and setters below for the Student class.
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.

}
