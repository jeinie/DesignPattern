import java.util.Date;

// 일정 관리를 위해 새롭게 생성되는 일정(Task) 클래스
public class Task {
    private final long id; // 일정에 대한 unique identifer
    private String summary = ""; // 일정에 대한 요약
    private String description = ""; // 일정에 대한 상세설명
    private boolean done = false; // 일정이 완료되었는 완료되지 않았는를 설명하는 변수
    private Date dueDate; // 해당 Task가 언제인지를 기록하는 변수

    // 생성자
    public Task(long id, String summary, String description, boolean done, Date dueDate) {
        this.id = id;
        this.summary = summary;
        this.description = description;
        this.done = done;
        this.dueDate = dueDate;
    }

    // Task 클래스 내부 각각의 변수에 대한 getter 및 setter 메소옴
    public long getId() {
        return id;
    }

    public String getSummary() {
        return summary;
    }

    public String getDescription() {
        return description;
    }

    public boolean isdone() {
        return done;
    }

    public Date getdueDate() {
        return dueDate;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setdone(boolean done) {
        this.done = done;
    }

    public void setdueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", summary='" + summary + '\'' +
                ", description='" + description + '\'' +
                ", done=" + done +
                ", dueDate=" + dueDate +
                '}';
    }
}
