public class Loop {

    public static void main(String [] args){
        String avengers[]={"C.A","IronMAn","Hulk","Thor","Loki","Cap.MArvel"};
        for(int i=0; i<=5; i=i+1){ //forward direction
            System.out.println(avengers[i]);
        }
        System.out.println();
        for(int i=5; i>=0; i=i-1){ //backword direction
            System.out.println(avengers[i]);
        }

        String Bike[]={"Ninja","ABC","DEF","IjK","KLM","NOP"};
        System.out.println();
        for(int i=0; i<=Bike.length-1; i=i+1){ //forward direction
            System.out.println(Bike[i]);
        }
        System.out.println();
        for(int i=Bike.length-1;  i>=0;  i=i-1){ //backword direction
            System.out.println(Bike[i]);
        }
    }
}