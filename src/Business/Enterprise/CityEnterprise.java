/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author bhash
 */
public class CityEnterprise extends Enterprise {

    public CityEnterprise(String name, EnterpriseType type) {
        super(name, type.City);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       return null;
    }
    
}
