package com.geekster.UserManagementSystem.controller;

import com.geekster.UserManagementSystem.model.Management;
import com.geekster.UserManagementSystem.services.ManagementServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/p1/user-management")
public class ManagementController {

    private ManagementServices managementServices;

    public void ManagementServices(ManagementServices managementServices) {
        this.managementServices = managementServices;
    }

    @GetMapping("get-AllUser")
    public List<Management> findAllManagement() {
        return ManagementServices.getAllUser();
    }


    //http://localhost:8080/api/p1/user-management/find-management/id/3
    @GetMapping("/find-management/id/{id}")
    public Management findManagementById(@PathVariable("id") int id) {
        return ManagementServices.findManagementById(id);
    }


    //http://localhost:8080/api/p1/user-management/add-user
   // @PostMapping("/add-user")
   @RequestMapping(value = "/add-user",method = RequestMethod.POST)
    public void addManagementUser(@RequestBody Management management) {
       new  ManagementServices().addManagementUser(management);
    }

@PutMapping("/updateUserInfo/id/{id}")
public void updateManagementInfo(@PathVariable int id, @RequestBody Management management){
ManagementServices.updateManagementInfo(id,management);
}

@DeleteMapping("/deleteUser/id/{id}")
public void deleteUserManagement(@PathVariable int id){
        ManagementServices.deleteUserManagement(id);

}
}
