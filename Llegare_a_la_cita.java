public class Main {
  public static void main(String[] args) {
    String[] a = {"n","s","n","s","n","s","n","s","n","s"};
    char[] walk = {'w','e','w','e','w','e','w','e','w','e'};
    int count = walk.length;
    System.out.println(count);
    
    int n = 0;
    int s = 0;
    int w = 0;
    int e = 0;
    for(int i = 0; i < count; i++){
    	if (walk[i] == 'w'){
        w++;
        }
        else if (walk[i] == 'n'){
        n++;
        }
        else if(walk[i] == 's'){
        s++;
        }
        else if(walk[i] == 'e'){
        e++;
        }
    }
    if(count == 10){
    	if(n == s && w == e){
        	System.out.println("Yo creo que llego");
        }
        else{
        	System.out.println("Me voy a perder");
        }
    }
    else{
    	System.out.println("No podre llegar joder!");
    }
  }
}
