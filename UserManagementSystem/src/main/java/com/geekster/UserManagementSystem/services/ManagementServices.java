package com.geekster.UserManagementSystem.services;

import com.geekster.UserManagementSystem.model.Management;

import java.util.ArrayList;
import java.util.List;

public class ManagementServices {

private static List<Management>managements =new ArrayList<>();
private static int userCount = 0;
static {
managements.add(new Management(++userCount,"Vishal","vishu0444","Prayagraj","8433316675"));
    managements.add(new Management(++userCount,"Sachin","sachin0415","Lucknow","8000316675"));
    managements.add(new Management(++userCount,"Poonam","poonam1505","Allahabad","7387888184"));
    managements.add(new Management(++userCount,"Ranjeet","ranj0424","Delhi","8433311175"));
    managements.add(new Management(++userCount,"Alok","alok0455","Mumbai","9936221826"));
}

    public static List<Management> getAllUser() {
        return managements;
    }

    public static Management findManagementById(int id){
    for (Management management:managements){
        if (management.getUserId()==id){
            return management;
        }
    }
    return null;
    }

    public static void updateManagementInfo(int id, Management management) {
for(int i=0;i<managements.size();i++){
    Management management1 = managements.get(i);
    if (management1.getUserId()==id){
        managements.set(i,management);
        return;
    }
}
    }

    public static void deleteUserManagement(int id) {
    for (int i=0;i<managements.size();i++){
        Management management2 = managements.get(i);
        if (management2.getUserId()==id){
            managements.remove(i);
            return;
        }
    }
    }

    public   void addManagementUser(Management management) {
    managements.add(management);
    }



//    public static List<Management> findManagementById(int id) {
//        Predicate<? super Management> predicate = management -> management.getUserId()==id;
//        Management management = managements.stream().filter(predicate).findFirst().get();
//        return management;
//
//    }

//    public List<Management>findAllManagement(){
//
//}
}
