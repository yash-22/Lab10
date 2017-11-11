/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
public class Employee {

    /** Employee's name.*/
    private String name;
    /** Manager's name.*/
    private String manager;

    /**
     * Constructor for initialization.
     * @param name1 stores the name.
     * @param manager1 stores the manager details.
     */
    public Employee(final String name1, final String manager1) {
        this.name = name1;
        this.manager = manager1;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param name1 sets the name;
     */
    public void setName(final String name1) {
        this.name = name1;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param manager1 sets the manger name
     */
    public void setManager(final String manager1) {
        this.manager = manager1;
    }
}
