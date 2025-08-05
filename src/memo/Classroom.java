package memo;

public class Classroom {
    // 🔸 필드: 학생 배열을 저장할 공간
    Student[] students;

    // 🔸 생성자: 학생 배열을 전달받아서 이 클래스에 저장
    public Classroom(Student[] students) {
        this.students = students;
    }

    // 🔸 메서드: 저장된 학생들의 이름을 출력
    public void printStudents() {
        System.out.print("학생 목록: ");
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i].name);
            if(i!=students.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    // 🔸 Student 클래스: 학생 한 명의 정보를 저장
    static class Student {
        String name;

        // 생성자: 이름을 전달받아 저장
        public Student(String name) {
            this.name = name;
        }
    }

    // 🔸 실행용 main 메서드
    public static void main(String[] args) {
        // 학생 3명을 생성해서 배열로 만듦
        Student[] arr = {
                new Student("민수"),
                new Student("지영"),
                new Student("철수")
        };


        // 학생 배열을 가진 교실을 생성
        Classroom c = new Classroom(arr);

        // 학생 이름 출력
        c.printStudents();
    }
}
