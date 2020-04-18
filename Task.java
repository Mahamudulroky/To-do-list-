package to.pkgdo.list;
import java.util.Date;
public class Task extends Date
{
	private int id; // getter
	private String taskName; //getter, setter maximum length of task name must be < 10
	private boolean isDone; // getter, setter
	private Date taskCreated, taskCompleted, deadline; // getter, setter
	private static int autoIncrementingId = 1;

	public Task(String taskName, Date deadline) {
		this.taskName = taskName;
		id = autoIncrementingId++;
		this.deadline = deadline;
		isDone = false;
		taskCreated = new Date();
	}

	// write the getters and setters
}
    public static void main(String[] args)
    {
        // TODO code application logic here
    }
    
}
