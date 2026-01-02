public class Stack {
 int[] arr=new int[6];
 int top;
 int size;

 public Stack(){
     top=-1;
        size=arr.length;

 }
 public void add(int x){
     if(top==size-1){
         System.out.println("Stack Overflow");
         return;
     }
     top++;
     arr[top]=x;
 }

 public void print(){
     for (int i = top; i >=0 ; i--) {
         System.out.println(arr[i]);
     }
 }
 public int pop(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return -1;
        }
        top--;
        return arr[top+1];
 }
 public int peek(){
     return arr[top];
 }

}
