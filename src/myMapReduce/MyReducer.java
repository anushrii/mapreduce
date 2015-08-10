package myMapReduce;

import java.util.Collections;
import java.util.List;

import mapReduce.Reducer;

public class MyReducer extends Reducer {

    @Override
    public void reduce(String letter, List<String> counts) {
    	int occurrences1 = Collections.frequency(counts, "1");
        emit(letter," Initial" + " " + occurrences1 );
    	int occurrences2 = Collections.frequency(counts, "2");
        emit(letter, " Final" +  " " +occurrences2 );
    	int occurrences3 = Collections.frequency(counts, "3");
        emit(letter, " Total" + " " + occurrences3);
    }
}
