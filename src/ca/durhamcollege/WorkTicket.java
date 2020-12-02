//Group:            15
//Name:             Ahmed Butt, Michai Pryce
//Student ID:       100770449, 100668094
//Last Modified:    December 2, 2020
//Project:          OOP3200-F2020-JavaLab3

package ca.durhamcollege;

import java.time.*;

public class WorkTicket
{
    //DECLARATIONS
    int work_ticket_number;
    String client_id;
    LocalDate work_ticket_date;
    String description;

    //ACCESSORS & MUTATORS
    public int getWorkTicketNumber()
    {
        return work_ticket_number;
    }

    public void setWorkTicketNumber(int work_ticket_number)
    {
        try
        {
            if (work_ticket_number < 0) //if work_ticket_number less than 0, throw exception
            {
                throw new IllegalArgumentException();
            }
            else //work_ticket_number was valid, set to this
            {
                this.work_ticket_number = work_ticket_number;
            }
        }
        catch (IllegalArgumentException iae)
        {
            System.out.print(iae + " - Work ticket number is invalid.\n\n");
        }
    }

    public String getClientID()
    {
        return client_id;
    }

    public void setClientID(String client_id)
    {
        try
        {
            if (client_id.length() <= 1) //if client_id's length is less than or equal to 1, throw exception
            {
                throw new IllegalArgumentException();
            }
            else //client_id was valid, set to this
            {
                this.client_id = client_id;
            }
        }
        catch (IllegalArgumentException iae)
        {
            System.out.print(iae + " - Client ID is invalid.\n\n");
        }
    }

    public LocalDate getWorkTicketDate()
    {
        return work_ticket_date;
    }

    public void setWorkTicketDate(int year, int month, int day)
    {
        try
        {
            if (year < 2000 || year > 2099) //if year not in range
            {
                throw new IllegalArgumentException();
            }
            else if (month < 1 || month > 12) //if month makes no sense
            {
                throw new IllegalArgumentException();
            }
            else if (day < 1 || day > 31) //if day makes no sense
            {
                throw new IllegalArgumentException();
            }
            else //valid year, month, day
            {
                LocalDate work_ticket_date = LocalDate.of(year, month, day);
                this.work_ticket_date = work_ticket_date;
            }
        }
        catch (IllegalArgumentException iae)
        {
            System.out.print(iae + " - Work ticket date is invalid.\n\n");
        }
        catch (Exception e)
        {
            System.out.print(e + " - Work ticket date is invalid.\n\n");
        }
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        try
        {
            if (description.length() <= 1) //if description's length is less than or equal to 1, throw exception
            {
                throw new IllegalArgumentException();
            }
            else //description was valid, set to this
            {
                this.description = description;
            }
        }
        catch (IllegalArgumentException iae)
        {
            System.out.print(iae + " - Description is invalid.\n\n");
        }
    }

    //DEFAULT & PARAMETERIZED CONSTRUCTORS
    WorkTicket()
    {
        this.work_ticket_number = 0;
        this.client_id = null;
        this.work_ticket_date = null;
        this.description = null;
    }

    WorkTicket(int work_ticket_number, String client_id, int year, int month, int day, String description)
    {
        SetWorkTicket(work_ticket_number, client_id, year, month, day, description);
    }

    WorkTicket(int work_ticket_number, String client_id, LocalDate work_ticket_date, String description)
    {
        this.work_ticket_number = work_ticket_number;
        this.client_id = client_id;
        this.work_ticket_date = work_ticket_date;
        this.description = description;
    }

    boolean SetWorkTicket(int work_ticket_number, String client_id, int year, int month, int day, String description)
    {
        boolean isValid = true;

        setWorkTicketNumber(work_ticket_number);
        setClientID(client_id);
        setWorkTicketDate(year, month, day);
        setDescription(description);

        if (this.work_ticket_number != work_ticket_number || this.client_id != client_id || //if one or more setters didn't set (invalid data)
                this.work_ticket_date == null || this.description != description)
        {
            isValid = false; //set isValid to false
        }

        return isValid;
    }

    @Override
    public String toString()
    {
        return  "Work Ticket #: " + work_ticket_number + "\n" +
                "Client ID:     " + client_id + "\n" +
                "Date:          " + work_ticket_date + "\n" +
                "Description:   " + description;
    }
}