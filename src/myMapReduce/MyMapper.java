package myMapReduce;

import mapReduce.Mapper;

public class MyMapper extends Mapper {
    
    @Override
    public void map(String documentID, String document) {
    	
        String[] words = document.split(" ");
        for (String word : words) {
        	  document.replaceAll( "[^A-Za-z0-9_]", "");
            word.replaceAll( "[a-z A-Z]", "");
        	if(word.startsWith("a")) emit("a", "1");
        	if(word.startsWith("b")) emit("b", "1");
        	if(word.startsWith("c")) emit("c", "1");
        	if(word.startsWith("d")) emit("d", "1");
        	if(word.startsWith("e")) emit("e", "1");
        	if(word.startsWith("f")) emit("f", "1");
        	if(word.startsWith("g")) emit("g", "1");
        	if(word.startsWith("h")) emit("h", "1");
        	if(word.startsWith("i")) emit("i", "1");
        	if(word.startsWith("j")) emit("j", "1");
        	if(word.startsWith("k")) emit("k", "1");
        	if(word.startsWith("l")) emit("l", "1");
        	if(word.startsWith("m")) emit("m", "1");
        	if(word.startsWith("n")) emit("n", "1");
        	if(word.startsWith("o")) emit("o", "1");
        	if(word.startsWith("p")) emit("p", "1");
        	if(word.startsWith("q")) emit("q", "1");
        	if(word.startsWith("r")) emit("r", "1");
        	if(word.startsWith("s")) emit("s", "1");
        	if(word.startsWith("t")) emit("t", "1");
        	if(word.startsWith("u")) emit("u", "1");
        	if(word.startsWith("v")) emit("v", "1");
        	if(word.startsWith("w")) emit("w", "1");
        	if(word.startsWith("x")) emit("x", "1");
        	if(word.startsWith("y")) emit("y", "1");
        	if(word.startsWith("z")) emit("z", "1");
        	
        	
        	
        	if(word.endsWith("a")) emit("a", "2");
        	if(word.endsWith("b")) emit("b", "2");
        	if(word.endsWith("c")) emit("c", "2");
        	if(word.endsWith("d")) emit("d", "2");
        	if(word.endsWith("e")) emit("e", "2");
        	if(word.endsWith("f")) emit("f", "2");
        	if(word.endsWith("g")) emit("g", "2");
        	if(word.endsWith("h")) emit("h", "2");
        	if(word.endsWith("i")) emit("i", "2");
        	if(word.endsWith("j")) emit("j", "2");
        	if(word.endsWith("k")) emit("k", "2");
        	if(word.endsWith("l")) emit("l", "2");
        	if(word.endsWith("m")) emit("m", "2");
        	if(word.endsWith("n")) emit("n", "2");
        	if(word.endsWith("o")) emit("o", "2");
        	if(word.endsWith("p")) emit("p", "2");
        	if(word.endsWith("q")) emit("q", "2");
        	if(word.endsWith("r")) emit("r", "2");
        	if(word.endsWith("s")) emit("s", "2");
        	if(word.endsWith("t")) emit("t", "2");
        	if(word.endsWith("u")) emit("u", "2");
        	if(word.endsWith("v")) emit("v", "2");
        	if(word.endsWith("w")) emit("w", "2");
        	if(word.endsWith("x")) emit("x", "2");
        	if(word.endsWith("y")) emit("y", "2");
        	if(word.endsWith("z")) emit("z", "2");
        	
        	for(char c: word.toCharArray()){
        		emit(Character.toString(c),"3");
        	}
        	
        }
    }
}