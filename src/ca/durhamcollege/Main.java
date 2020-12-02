//Group:            15
//Name:             Ahmed Butt, Michai Pryce
//Student ID:       100770449, 100668094
//Last Modified:    December 2, 2020
//Project:          OOP3200-F2020-JavaLab3

package ca.durhamcollege;

public class Main
{
    public static void main(String[] args)
    {
        ExtendedWorkTicket extendedWorkTicket;

        //Displaying Default Constructor
        extendedWorkTicket = new ExtendedWorkTicket();
        System.out.println("\nDefault Constructor\n-------------------");
        System.out.println(extendedWorkTicket);

        //Displaying Parameterized Constructor
        System.out.println("\nParameterized Constructor\n-------------------------");
        extendedWorkTicket = new ExtendedWorkTicket(1, "1ABC", 2010,1,1, "Needs assistance.", true);
        System.out.println(extendedWorkTicket);

        //Displaying Parameterized Constructor that Accepts a WorkTicket
        System.out.println("\nParameterized Constructor (Accepts WorkTicket Object)\n-----------------------------------------------------");
        WorkTicket workTicket = new WorkTicket(2, "2ABC", 2020, 12, 2, "Maintenance required.");
        extendedWorkTicket = new ExtendedWorkTicket( workTicket,true);
        System.out.println(extendedWorkTicket);

        //Displaying isOpen
        System.out.println("\nmyOpen Value Using isOpen()\n---------------------------");
        System.out.println("Generating new ExtendedWorkTicket...");
        extendedWorkTicket = new ExtendedWorkTicket(3, "3ABC", 2016,5,5, "Check for bugs.", false);
        System.out.println("isOpen value: " + extendedWorkTicket.isOpen());

        //Opening and Displaying ExtendedWorkTicket using openTicket()
        System.out.println("\nOpening the new ExtendedWorkTicket\n----------------------------------");
        extendedWorkTicket.openTicket();
        System.out.println(extendedWorkTicket);

        //Closing and Displaying ExtendedWorkTicket using closeTicket()
        System.out.println("\nClosing Ticket\n--------------");
        extendedWorkTicket.closeTicket();
        System.out.println(extendedWorkTicket);

        //SetWorkTicket (fail and success)
        System.out.println("\nSetWorkTicket() (Fail)\n----------------------");
        if (extendedWorkTicket.SetWorkTicket(-1,"3ABC", 2020, 11, 18, "You shouldn't see this...", false))
        {
            System.out.println("Ticket has been set!\n");
        }
        else
        {
            System.out.println("Failed to set ticket.\n");
        }

        System.out.println("SetWorkTicket() (Success)\n-------------------------");
        if (extendedWorkTicket.SetWorkTicket(4,"4ABC", 2020, 12, 3, "Fix the issue.", false))
        {
            System.out.println("Ticket has been set!\n");
        }
        else
        {
            System.out.println("Failed to set ticket.\n");
        }

        //Displaying the ExtendedWorkTicket
        System.out.println(extendedWorkTicket);
    }
}

