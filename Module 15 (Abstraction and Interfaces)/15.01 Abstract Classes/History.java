
/**
 * History class that tells how much pages left to read, extends Homework class.
 *
 * @author James Young
 * @version Jan 22, 2020
 */
public class History extends Homework
{
    /**
     * Constructor call Homework's constructor
     */
    public History()
    {
        super();
    }
    
    /**
     * Abstract method for creating an assignment, parameter number of pages
     */
    public void createAssignment(int p) {
                setPagesRead(p);
                setType("History");
    }
        
    /**
     * Method lists the homework type and the number of pages
     */
    public String toString(){
        return getType() + "- read " + getPagesRead() + " pages.";
    }
}
