/**
 * The stopwatch class measures the amount of time it takes
 * To run certain method, such as quicksort and mergesort
 * @author Ethan Hartfield
 * 11/3/2022
 */
 public class Stopwatch{
    private long startTime;
    private long stopTime;
    public static final double MICRO_PER_SEC = 10000.0;

    /**
     * The start method starts the stopwatch
     */
    public void start(){
        startTime = System.nanoTime();
    }

    /**
     * The stop method stops the stopwatch
     */
    public void stop(){
        stopTime = System.nanoTime();
    }

    /**
     * The time method finds the elapsed time in microseconds
     * @return The time recorded on the stopwatch in microseconds
     */
    public double time(){
        return (stopTime-startTime)/MICRO_PER_SEC;
    }
    /**
     * The toString method returns the elapsed time in microseconds
     * @return The elapsed time in microseconds
     */
    public String toString(){
        return "elapsed time: " + time() + " microseconds.";
    }

    /**
     * The timeInNanoseconds returnds the elapsed time in nanoseconds
     * @return The time recorded on the stopwatch in nanoseconds
     */
    public long timeInNanoseconds(){
        return (stopTime-startTime);
    }
    
 }
