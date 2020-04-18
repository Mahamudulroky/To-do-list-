package to.pkgdo.list;
import java.util.Date;
public class Task extends Date
{
	private int id; // getter
	private String taskName; //getter, setter maximum length of task name must be < 10
	private boolean isDone; // getter, setter
	private Date taskCreated, taskCompleted, deadline; // getter, setter
	private static int autoIncrementingId = 1;

	public Task(String taskName, Date deadline)
        {
		this.taskName = taskName;
		id = autoIncrementingId++;
		this.deadline = deadline;
		isDone = false;
		taskCreated = new Date();
	}
    //This is for Id
    public void setId(int ID)
    {
        this.id = ID;
    }

    public int getId() 
    {
        return id;
    }
    //This is for taskName

    public void setTaskName(String Name)
    {   
        if(taskName.length()<10)
        {
             this.taskName =Name;
        }

    }

    public String getTaskName() 
    {
        return taskName;
    }

    //This is for is Done

    public void setIsDone(boolean Done)
    {
        this.isDone = Done;
    }


    public boolean isIsDone()
    {
        return isDone;
    }

    //taskCreated


    public void setTaskCreated(Date Created) 
    {
        this.taskCreated = Created;
    }

    public Date getTaskCreated()
    {
        return taskCreated;
    }

    //Task Completed


    public void setTaskCompleted(Date Completed) 
    {
        this.taskCompleted = Completed;
    }


    public Date getTaskCompleted()
    {
        return taskCompleted;
    }

    //Deadline



    public void setDeadline(Date deadline)
    {
        this.deadline = deadline;
    }

    public Date getDeadline() 
    {
        return deadline;
    }



    public static void main(String[] args)
    {
       
    }

}