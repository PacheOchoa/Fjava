public class Multi {
    
    
   public void persi(int n) {
		int result = 0;
		while (n > 9) {
			int m = 1;
			for (char t : String.valueOf(n).toCharArray()) {
				m *= Integer.parseInt(String.valueOf(t));
			}
			n = m;
			result++;
		}
	     System.out.println(result);
    
   }
    
    public static void main(String args[]) {
        Multi hc = new Multi();
       hc.persi(39);
     
     
    }


}