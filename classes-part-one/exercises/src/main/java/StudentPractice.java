public class StudentPractice {
    public static void main(String[] args){
        //insantiate your Student class below

        Student student = new Student("MatteBlack", 12345, 1, 4.0);
    }
    public class Course {
        private String topic;
        private Teacher instructor;
        private ArrayList<Student> enrolledStudents;
    }

    public class Teacher {
        public String firstName;
        public String lastName;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public int getNumOfYears() {
            return numOfYears;
        }

        public void setNumOfYears(int numOfYears) {
            this.numOfYears = numOfYears;
        }

        public String subject;
        public int numOfYears;
    }
}
