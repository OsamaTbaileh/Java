

public class Test {

    public static void main (String[] args){
        Test t=new Test();
        t.reverse("jhg kjehrgk kheg kheg");
    }

        public String reverse (String input){
            String [] splitted = input.split(" ");
            String result = "";
            for(int i=splitted.length-1; i>=0; i--){
                result += splitted[i]+"  ";
            }
            System.out.println(result);
            return result;
    }
}