
/*Ability to peak and pop from the Stack till it is empty 56->30->70*/
public class UC02_PopMethod {
    UC4_DeleteFirstElement obj = new UC4_DeleteFirstElement();

    public void push(int data){
        obj.addNode(data);
    }
    public void pop(){
        obj.DeleteFirst();
    }
    public void Display(){
        obj.display();
    }

    public static void main(String[] args) {
        UC02_PopMethod ll = new UC02_PopMethod();
        ll.push(56);
        ll.push(30);
        ll.push(70);
        ll.Display();
        ll.pop();
        ll.Display();

    }
}
