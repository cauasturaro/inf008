class ClassRoom {
    private String code;
    private int capacity;
    private Status status;

    public ClassRoom(String code, int capacity, Status status) {
        this.code = code;
        this.capacity = capacity;
        this.status = status;
    }
}

enum Status { Full, Free }

class Booking {
    private ClassRoom classroom;
    private String teacher;

    public Booking(ClassRoom classRoom, String teacher) {
        this.classroom = classRoom;
        this.teacher = teacher;
    }

    public void changeClassroom(ClassRoom classRoom) {
        this.classroom = classRoom;
    }

}

public class questao1 {
    ClassRoom classRoom = new ClassRoom("102223214", 40, Status.Free);
    ClassRoom sameClassroom = classRoom; // reference copy (classRoom)

    // New object
    ClassRoom classRoom2 = new ClassRoom("343233214", 50, Status.Free);
}


