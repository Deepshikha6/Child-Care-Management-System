/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CaretakerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author bhash
 */
public class CaretakerOrganization extends Organization {

    public CaretakerOrganization() {
        super(OrganizationType.Caretaker.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CaretakerRole());
        return roles;
    }
    
}
