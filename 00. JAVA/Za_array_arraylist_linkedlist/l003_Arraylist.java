//Arraylist is like an array but there is no size limit. We can add or remove elements anytime.
// So, it is much more flexible than the traditional array.
// It inherits the abstract list class and implements list interface

package Za_array_arraylist_linkedlist;

import java.util.ArrayList;


class ShoppingCart{
    
    private ArrayList<String> shoppingCart = new ArrayList<>();

    public void addItem(String item){
        shoppingCart.add(item);
    }

    public void printList(){
        System.out.println("There are " + shoppingCart.size() + " items in your cart");
        for(int i = 0;i< shoppingCart.size(); i++){
            System.out.println("Item " + (i+1) + " :" + shoppingCart.get(i));
        }
    }

    public void modifyCart(int pos, String newItem){
        shoppingCart.set(pos, newItem);
        System.out.println(" shopping item " + (pos+1) + "has been modified");
    }

    public void removeItem(int pos){
        String itemName = shoppingCart.get(pos);
        shoppingCart.remove(pos);
        System.out.println(itemName + " is removed");
    }

    public void searchItem(String item){
        int pos = shoppingCart.indexOf(item);
        if(pos >= 0 ){
            System.out.println(item + " found at pos: " + pos);
        }
        else
            System.out.println(item + " not found!!!");
    }
}
public class l003_Arraylist {
    
    public static ShoppingCart shopCart = new ShoppingCart();
    
    public static void main(String [] args){
        shopCart.addItem("milk");
        shopCart.addItem("ghee");
        shopCart.addItem("lassi");
        shopCart.addItem("paneer");
        shopCart.addItem("cheese");

        shopCart.printList();
        shopCart.searchItem("milk");

        shopCart.modifyCart(0, "cow milk");

        shopCart.removeItem(2);
        shopCart.printList();
    }
}
