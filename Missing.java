public class Missing{
    
       public void  find(char[] array){
         int inicio = array[0];
        
             for(int i = 0; i< array.length;i++){
                   
                   while((char)(inicio+1) == array[i+1]){
                        inicio += 1;
                        i++;
                    }
                
                inicio++;
                break;
                
               }
               
     System.out.println((char) inicio);
  }

     public static void main(String []args){
         Missing m = new Missing();
         char[] data = {'a','b','c','d','f'};
         m.find(data);
     }
}