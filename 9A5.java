class University {
    String name = "ABC University";

    class Department {
        void showDepartment() {
            System.out.println("Department of Computer Science, " + name);
        }
    }

    static class ExamCell {
        static void conductExam() {
            System.out.println("Exams are being conducted by Exam Cell.");
        }
    }

    public static void main(String[] args) {
        University u = new University();
        University.Department d = u.new Department();
        d.showDepartment();
        University.ExamCell.conductExam();
    }
}
