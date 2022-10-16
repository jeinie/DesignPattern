import java.util.Date;

public class TaskBuilder {

    private final long id; // 일정에 대한 unique identifer
    private String summary = ""; // 일정에 대한 요약
    private String description = ""; // 일정에 대한 상세설명
    private boolean done = false; // 일정이 완료되었는 완료되지 않았는를 설명하는 변수
    private Date dueDate; // 해당 Task가 언제인지를 기록하는 변수

    /*
    public TaskBuilder(long id, String summary, String description, boolean done, Date dueDate) {
        this.id = id;
        this.summary = summary;
        this.description = description;
        this.done = done;
        this.dueDate = dueDate;
    }
     */

    public TaskBuilder(long id) {
        this.id = id;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    // TaskBuilder 객체가 보유한 값들을 활용하여 최종적으로 Task 객체를 만드는 메소드
    public Task build() {
        return new Task(id, summary, description, done, dueDate);
    }
}
