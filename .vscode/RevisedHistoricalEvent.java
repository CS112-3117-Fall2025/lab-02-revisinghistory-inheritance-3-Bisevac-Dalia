/**
 * RevisedHistoricalEvent.java - extends the HistoricalEvent to provide a correct and expanded on historical account and a citation so I can cite sources and proof. It also includes a teach() method that will print both the original account of the event and the revised, and technically corrected, account along with a necessary citation.
 *
 * Instance variables:
 *  - revisedDescription : String
 *  - citation : String
 *
 * Included some getters, setters, setAll(), toString(), equals(), and teach() are implemented.
 *
 * @author 
 * @version 1.0
 */
public class RevisedHistoricalEvent extends HistoricalEvent {
   
    //Instance variables
    private String revisedDescription;
    private String citation;

    //Constants
    public static final String DEFAULT_REVISED = "";
    public static final String DEFAULT_CITATION = "";

    //Constructors
    public RevisedHistoricalEvent() 
    {
        super(); // sets the description and date default
        this.revisedDescription = DEFAULT_REVISED;
        this.citation = DEFAULT_CITATION;
    }


    /**
     * Full constructor
     *
     * @param description original description
     * @param eventDay Date object for the event
     * @param revisedDescription the revised description
     * @param citation citation 
     */
    public RevisedHistoricalEvent(String description, Date eventDay, String revisedDescription, String citation) 
    {
        super(description, eventDay);
        this.setAll(revisedDescription, citation, description, eventDay);
    }

    /**
     * Copy constructor (deep copy)
     *
     * @param original the RevisedHistoricalEvent to copy
     */
    public RevisedHistoricalEvent(RevisedHistoricalEvent original) 
    {
        if (original == null) {
            super.setAll(DEFAULT_DESCRIPTION, DEFAULT_DATE);
            this.revisedDescription = DEFAULT_REVISED;
            this.citation = DEFAULT_CITATION;
        } else {
            // Use getters which will ensure a deep copy
            super.setAll(original.getDescription(), original.getEventDay());
            this.revisedDescription = original.revisedDescription;
            this.citation = original.citation;
        }
    }
    

    //Setters/Mutators
    public void setRevisedDescription(String revisedDescription) 
    {
        this.revisedDescription = (revisedDescription == null) ? "" : revisedDescription;
    }

    public void setCitation(String citation) 
    {
        this.citation = (citation == null) ? "" : citation;
    }

    /**
     * Convenience setAll to update both parent and child fields
     *
     * @param revisedDescription the corrected description
     * @param citation line holding the citation for proof
     * @param originalDescription contains the original description
     * @param eventDay contains the Date
     * @return true if set, which technically in this case it's always true
     */
    public boolean setAll(String revisedDescription, String citation, String originalDescription, Date eventDay) 
    {
        super.setAll(originalDescription, eventDay);
        this.setRevisedDescription(revisedDescription);
        this.setCitation(citation);
        return true;
    }

    //Getters/Accessors
    public String getRevisedDescription() 
    {
        return this.revisedDescription;
    }

    public String getCitation() 
    {
        return this.citation;
    }

    //overrides the toString and equals
    @Override
    public String toString() 
    {
        //Combines the parent string with a short revised summary
        String parent = super.toString();
        return parent + "\n(Revised): " + this.revisedDescription + "\nSource: " + this.citation;
    }

    @Override
    public boolean equals(Object other) 
    {
        if (other == null) return false;
        if (!(other instanceof RevisedHistoricalEvent)) return false;
        RevisedHistoricalEvent o = (RevisedHistoricalEvent) other;
        boolean parentEqual = super.equals(o);
        boolean revisedEqual = (this.revisedDescription == null && o.revisedDescription == null)
                                || (this.revisedDescription != null && this.revisedDescription.equals(o.revisedDescription));
        boolean citationEqual = (this.citation == null && o.citation == null)
                                || (this.citation != null && this.citation.equals(o.citation));
        return parentEqual && revisedEqual && citationEqual;
    }

    /**
     * teach() - will print the original "history" and the revised corrected history afterwards
     */
    public void teach() {
        System.out.println("====================================================");
        System.out.println("REVISED HISTORICAL EVENT EXAMPLE:");
        System.out.println("====================================================");
        System.out.println();
        System.out.println("The following version of \\\"history\\\" was traditionally told:");
        System.out.println();
        //Print original version
        System.out.println(super.toString());
        System.out.println();
        System.out.println("By revising history, we ensure accurate recounting of events.");
        System.out.println("Here is the revised account:");
        System.out.println(this.revisedDescription);
        System.out.println();
        System.out.println("Source: " + this.citation);
    }

}
