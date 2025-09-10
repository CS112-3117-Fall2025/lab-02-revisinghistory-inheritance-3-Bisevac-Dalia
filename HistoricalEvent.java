/**
 * HistoricalEvent.java - a model class that represents a given historical event
 *
 * Instance variables:
 *  - description : String
 *  - eventDay : Date (composition)
 *
 * Requirements implemented:
 *  - default constructor
 *  - full constructor (deep copies Date)
 *  - copy constructor (deep copy)
 *  - getters/setters
 *  - setAll()
 *  - toString() and equals()
 *
 * @author Dalia Bisevac
 * @version 1.0
 */
public class HistoricalEvent 
{
    
    //Instance variables
    private String description;
    private Date eventDay;
    
    //Constants (defaults)
    public static final String DEFAULT_DESCRIPTION = "";
    public static final Date DEFAULT_DATE = new Date();

    //Constructors

    /**
     * Default constructor
     */
    public HistoricalEvent() 
    {
        this.description = DEFAULT_DESCRIPTION;
        this.eventDay = new Date(DEFAULT_DATE);
    }
    
    /**
     * Full construcyor
     * 
     * @param description the actual text describing the event
     * @param eventDay the Date object that represents the day the event happened
     */
    public HistoricalEvent(String description, Date eventDay) 
    {
        this.setAll(description, eventDay);
    }

    /**
     * copy constructor
     * @param original used for the existing HistoricalEvent to copy
     */
    public HistoricalEvent(HistoricalEvent original) 
    {
        if (original == null) 
        {
            this.description = DEFAULT_DESCRIPTION;
            this.eventDay = new Date(DEFAULT_DATE);
        }
        else 
        {
            this.setAll(original.description, original.eventDay);
        }
    }
    
    //Setters/Mutators
    /**
     * sets the description
     * @param description the String description
     */
    public void setDescription(String description)
    {
        if (description == null) {
            this.description = "";
        } else {
            this.description = description;
        }
    }
    
    /**
     * sets the eventDay
     * @param eventDay the Date object
     */
    public void setEventDay(Date eventDay) 
    {
        if (eventDay == null) {
            this.eventDay = new Date(); // default
        } else {
            this.eventDay = new Date(eventDay);
        }
    }
    
    /**
     * sets all the instance variables with validation
     * @param description the text description
     * @param eventDay the Date object
     * @return returns true if set successfully
     */
    public boolean setAll(String description, Date eventDay) 
    {
        // accept even empty description; eventDay deep copied
        this.setDescription(description);
        this.setEventDay(eventDay);
        return true;
    }


    //Getters/Accessors

    /**
     * 
     * @return the description
     */
    public String getDescription() 
    {
        return this.description;
    }

    /**
     * @return returns a deep copy of the Date to ensure there is encapsulation
     */
    public Date getEventDay() 
    {
        return new Date(this.eventDay); // returns the deep copy
    }


    //Other Methods
    @Override
    public String toString() 
    {
        return "On " + this.eventDay.toString() + ": " + this.description;
    }

    @Override
    public boolean equals(Object other) 
    {
        if (other == null) 
        {
            return false;
        } 
        else if (!(other instanceof HistoricalEvent)) 
        {
            return false;
        } 
        else 
        {
            HistoricalEvent o = (HistoricalEvent) other;
            boolean descEqual = (this.description == null && o.description == null)
                                || (this.description != null && this.description.equals(o.description));
            boolean dateEqual = (this.eventDay == null && o.eventDay == null)
                                || (this.eventDay != null && this.eventDay.equals(o.eventDay));
            return descEqual && dateEqual;
        }
    }

}
