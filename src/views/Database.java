/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.util.ArrayList;

public class Database {

    public static ArrayList<CustomerDTO> customerTable = new ArrayList();
    
    static {
        customerTable.add(new 
        CustomerDTO("Nimal", "Colombo", 2500, "Rajagiriya"));
        customerTable.add(new 
        CustomerDTO("Amal", "Colombo", 2500, "Rajagiriya"));
        customerTable.add(new 
        CustomerDTO("Bandara", "Galle", 2500, "Rajagiriya"));
        customerTable.add(new 
        CustomerDTO("Jayantha", "Colombo", 2500, "Rajagiriya"));
        customerTable.add(new 
        CustomerDTO("Vishwa", "Panadura", 2500, "Rajagiriya"));
        customerTable.add(new 
        CustomerDTO("Kalpana", "Colombo", 2500, "Rajagiriya"));
        customerTable.add(new 
        CustomerDTO("Nilanthi", "Kandy", 2500, "Rajagiriya"));
        customerTable.add(new 
        CustomerDTO("Ruwanthi", "Colombo", 2500, "Rajagiriya"));
        customerTable.add(new 
        CustomerDTO("Saman", "Colombo", 2500, "Rajagiriya"));
        customerTable.add(new 
        CustomerDTO("Ayesha", "Colombo", 2500, "Rajagiriya"));
        
    }
}
