import java.util.*;

/**
 * PA3: Searching & sorting in Java
 * <P>
 * This class implements a program that tests the movie ADT.
 * </P>
 * @author Brandon Soledad
 * @version 1.0
 */
public class Test 
{
   /**
     * This is the main method for this test program. Since this is a
     * simple test program, all of our code will be in the main method.
     * Typically this would be a bad design, but we are just testing out
     * some features of Java.
     * <P>
     * Algorithm<br>
     * 1. Instantiate eight objects of type Movie and add 
     *    them to the list movies.
     * 2. Print out the unsorted list of movies.
     * 3. Sort the list of movies using Collections.sort().
     * 4. Print out the sorted list of movies.
     * 5. Search for a particular movie in the list.
     * 6. Test your equals method.
     * </P>
     * @param             args       Contains the command line arguments.
     */
   public static void main(String[] args) 
   {
	  
      List<Movie> movies = new ArrayList<Movie>();
        
      /* 
       * 1. Instantiate eight objects of type Movie and add them
       *    to the list movies. 
       * I have created and added the first movie for you. :)
       */        
      Movie movie1 = new Movie( "Short Circuit", 1986 );
      Movie movie2 = new Movie("Pulp Fiction", 1994);
      Movie movie3 = new Movie("Pulp Fiction", 1994);
      Movie movie4 = new Movie("Interstellar", 2014);
      Movie movie5 = new Movie("The Godfather", 1972);
      Movie movie6 = new Movie("Avengers: Endgame", 2019);
      Movie movie7 = new Movie("Iron Man", 2008);
      Movie movie8 = new Movie("Avatar", 2009);
      /* The list is referenced to by the variable movies.  You can add to
       * the list by invoking the add method if ArrayList.
       */
      movies.add( movie1 );
      movies.add(movie2);
      movies.add(movie3);
      movies.add(movie4);
      movies.add(movie5);
      movies.add(movie6);
      movies.add(movie7);
      movies.add(movie8);

        
      /*
       * 2. Print out the unsorted list of movies.
       * This uses an iterator to "iterate" through the list.
       */
      System.out.println( "\n\nUnsorted List" );
      
      Iterator<Movie> iterator = movies.iterator();
  
      while( iterator.hasNext() )
      {
         // Note: This line of code will call toString of the Movie class.
         System.out.println( iterator.next() );
      }
        

      /*
       * 3. Sort the list of movies using Collections.sort().
       * Take a look at Collections.sort() in the API at
       * http://java.sun.com/j2se/1.5.0/docs/api/java/util/Collections.html#sort(java.util.List,%20java.util.Comparator)
       * You need to call Collections.sort() and pass it the list of movies.
       * SEE THE LAB HANDOUT FOR MORE INFORMATION.
       */
      
      // ADD CODE TO SORT HERE
      Collections.sort(movies);
        
        
      /*
       * 4. Print out the sorted list of movies.
       */
      System.out.println( "\n\nSorted List" );
      /* HINT: Use an iterator the same way I used one above when
       * the unsorted list of movies was printed.
       */
        
      // ADD CODE TO PRINT THE LIST HERE 
      System.out.println("The sorted list is: " + movies);
   
        
      /* 
       * 5. Search for a particular movie in the list.
       */
      System.out.println( "\n\nSearching" );
      Movie key = new Movie("Avatar", 2009);
      System.out.println( "Key is " + key );
        
      /*
       * Call Collections.binarySearch() to find the index of key.  
       * Make sure you test the value of index to see if it negative, 
       * which indicates that the key was not found in the list.
       */
      int index = Collections.binarySearch( movies, key );
        
      /* 
       * Print out whether the movie was found or not and the index
       * at which it was found.
       * HINT: If index is negative print a statement saying that the
       *       movie searched for is not in the list.  Otherwise, print
       *       out a statement telling that the movie was found in the list
       *       and give the index of the movie in the list as well.
       */
       
       // ADD CODE HERE
       if(index > 0){
    	   System.out.println("The movie was found at index: " + index);
       }
       else{
    	   System.out.println("The movie was not found");
       }
        
      /*
       * 6. Test your equals method.
       */
      System.out.println( "\n\nTesting Equals" );
      Movie someMovie = new Movie( "Short Circuit", 1986 );
      Movie anotherMovie = new Movie( "Short Circuit", 1986 );
        
      if(anotherMovie.equals(someMovie))
      {
         System.out.println("The movies are the same");
      }
        
      if( !anotherMovie.equals( anotherMovie ) )
      {
    	  System.out.println("The movies are not the same");
      }   
   }
}
