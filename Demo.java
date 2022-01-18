import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo{
    static void processStrings(List<String>strings,boolean skipHeader){

        Stream<String>stream = strings.stream();
        if(!skipHeader){
            stream.skip(0);
        }else{
            stream.skip(1);
        }

        stream.map(String::toUpperCase).forEach(System.out::print);
    }

    public static void main(String[] args) {

        System.out.println("calling the stream api to check strings");
        processStrings(Arrays.asList("Stream ","are ","cool"),false);
        //here Arrays.asList is for java8 for 9 you can use List.of()
        Demo d = new Demo();
        d.callingString("lama");
    }

    public  String callingString(String name){
        return name;
    }
}