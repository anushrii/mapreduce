My understanding of MapReduce : 

Map Reduce should come to mind when we think of processing large chunks of data. 
Processing this data really fast is key and this can be achieved using the MapReduce Algorithm. As processing power of personal computers is on a high, several of these can be put together to achieve an even larger capacity processing power. For achieving this, parallel computing is used which forms the foundation of Map Reduce. Simplest example would be to make words in a document as keys and the value can be anything based on the need of the hour. For; eg : frequency of occurence which is essentially the logic behind any search engine. If google wants to use a keyword as an input to look up documents it would (my guess) look into documents that have these keywords and rank these documents accordingly. 

Working of  a basic implementation : 

It has three parts to it. The first and last are the ones we can examine by various test documents. These are Map, Filter and Reduce. Map takes in these sevral documents and keys them based on words, characters etc. whatvere be the need. 

Filter, segregates these documents based on the values. 

Reduces gets the output of the algorithm , that can be word count, frequency of words , etc. 

This procedure needs to be fast and hence parrallel computers are used to do this. Thats in brief my understanding of MapReduce. 


My Implementation to get the frequency of a letter as occured as the first letter of a word, as the last letter of a word and total frequnecy in the entire document is as follows: 

MyMapper has an  overridden map method, this method takes on a document ID  and a document which is a string. Inside the method I call split on spaces on this string to get words. For each word I check whcih letter occurs as the first one , as the last one and all the letters that occur in the word. I emmit the letter with a string "1" if it occurs as the first, a string "2" if the letter occurs as the last and a "3" for generally counting its number of occurences.

MyReducer takes in a letter and the list of "counts" String (that was assigned to it in MyMapper) associated with it. I check for the frequency of diffrent counts ("1", "2", "3")associated with each letter and emit this frequency  and append  a string "Initial" with "1", "Final" with "2" and "total" with "3".  This basically  solves the purpose of my application.

The LetterCount class has the main method that uses a JFileChooser to select a text file and do this counting described above. 

I replace all the punctuation marks with empty strings before passing it to Mapreduce.execute() to get rid of unwanted appends to words. I use a Scanner to get the total number of words scanned per docuemnt. 

Finally to print the letters and their respective frequencies obtained in a sorted manner I create a string of sorted letters A-Z and do a character check(key-wise) in a loop for every result obtained and print these.

Thats the complete implementation. 




