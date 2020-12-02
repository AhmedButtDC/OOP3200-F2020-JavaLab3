//Group:            15
//Name:             Ahmed Butt, Michai Pryce
//Student ID:       100770449, 100668094
//Last Modified:    December 2, 2020
//Project:          OOP3200-F2020-JavaLab3

package ca.durhamcollege;

public class ExtendedWorkTicket extends WorkTicket
{
    //DECLARATIONS
    boolean myOpen;

    //ACCESSOR
    public boolean isOpen()
    {
        return myOpen;
    }

    //MUTATORS
    public void openTicket()
    {
        myOpen = true;
    }

    public void closeTicket()
    {
        myOpen = false;
    }

    //DEFAULT & PARAMETERIZED CONSTRUCTORS
    ExtendedWorkTicket()
    {
        this.myOpen = true;
    }

    ExtendedWorkTicket(int work_ticket_number, String client_id, int year, int month, int day, String description, boolean myOpen)
    {
        WorkTicket workTicket = new WorkTicket(work_ticket_number, client_id, year, month, day, description);
        this.work_ticket_number = workTicket.getWorkTicketNumber();
        this.client_id = workTicket.getClientID();
        this.work_ticket_date = workTicket.getWorkTicketDate();
        this.description = workTicket.getDescription();
        this.myOpen = myOpen;
    }

    ExtendedWorkTicket(WorkTicket workTicket, boolean myOpen)
    {
        this.work_ticket_number = workTicket.work_ticket_number;
        this.client_id = workTicket.client_id;
        this.work_ticket_date = workTicket.work_ticket_date;
        this.description = workTicket.description;
        this.myOpen = myOpen;
    }

    boolean SetWorkTicket(int work_ticket_number, String client_id, int year, int month, int day, String description, boolean myOpen)
    {
        boolean isValid = false;
        if (SetWorkTicket(work_ticket_number, client_id, year, month, day, description))
        {
            this.myOpen = myOpen;
            isValid = true;
        }
        return isValid;
    }

    @Override
    public String toString()
    {
        String openedOrClosed;
        if (myOpen)
        {
            openedOrClosed = "OPEN";
        }
        else
        {
            openedOrClosed = "CLOSED";
        }
        return  "Work Ticket #: " + work_ticket_number + "\n" +
                "Client ID:     " + client_id + "\n" +
                "Date:          " + work_ticket_date + "\n" +
                "Description:   " + description + "\n" +
                "Ticket:        " + openedOrClosed;
    }
}
