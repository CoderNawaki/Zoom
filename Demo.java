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
        processStrings(Arrays.asList("Stream ","are ","cool"),false);
    }
}