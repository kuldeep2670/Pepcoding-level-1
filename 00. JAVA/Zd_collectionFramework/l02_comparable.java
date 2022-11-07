package Zd_collectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class l02_comparable implements Comparable<l02_comparable>{
    private String contactName;
    private String contactNumber;

    public String getContactName() {
        return contactName;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public l02_comparable(String contactName, String contactNumber) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
    }
    // @Override
    // public int compareTo(l02_comparable o){
    //     if(this.contactName.compareTo(o.contactName) == 0){
    //         return 0;
    //     } else if(this.contactName.compareTo(o.contactName) > 0){
    //         return 1;
    //     }else{
    //         return -1;
    //     }

    // }  
    @Override
    public int compareTo(l02_comparable o){
        if(this.contactNumber.compareTo(o.contactNumber) == 0){
            return 0;
        } else if(this.contactNumber.compareTo(o.contactNumber) > 0){
            return 1;
        }else{
            return -1;
        }

    }  
    public static void main(String[] args) {
        ArrayList<l02_comparable> cp = new ArrayList<>();
        cp.add(new l02_comparable("apple", "11233"));
        cp.add(new l02_comparable("bpple", "133"));
        cp.add(new l02_comparable("zpple", "1133"));
        cp.add(new l02_comparable("dpple", "113"));
        cp.add(new l02_comparable("sfple", "113"));
        
        Collections.sort(cp);
        for(l02_comparable obj: cp){
            System.out.println(obj.getContactName() + " " + obj.contactNumber);
        }

    
    }
    
}
