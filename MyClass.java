public class MyClass {
    
    
    
    public void VerifyDigit(String data){
        String regex = "\\d+";
        if(data.matches(regex)){
         if(data.length() <5){
             System.out.println("true");
         }else{
         System.out.println("false");
     } 
     
     }else{
        System.out.println("false");
     }
    }
    
    
    public static void main(String args[]) {
     
      MyClass hc = new MyClass();
       hc.VerifyDigit("a234");
     
     
     
    }
}