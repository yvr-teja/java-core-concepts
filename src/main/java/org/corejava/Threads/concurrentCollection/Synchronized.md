                ||============================||
                ||  Concurrent Collections    ||
                ||============================||
#   Most of the Java collections are not thread safe
#   Ways to make collections thread safe
        => Use Collections.synchronize() method
        => Use the concurrent collections which are synchronized

#   Downsides of using the Collections.synchronized() approach
        =>Coarse grained locking
            * It is a synchronization strategy where a single lock protects a large section of code or an entire object, reducing concurrency but simplifying thread safety.
        =>Limited functionality
            * Collections.synchronized() provides only basic thread safety and lacks advanced concurrency features like non-blocking operations or iterators.
            * It only offers basic synchronization and lacks advanced concurrency utilities like those in java.util.concurrent
        =>No Fail Fast Iterators
            * Collections wrapped with Collections.synchronized() do not provide fail-fast iterators, making concurrent modification harder to detect.
        =>Performance Overhead
            * Using Collections.synchronized() slows things down because every thread has to wait its turn to access the collection, so performance drops when many threads are working at once.


                ||============================||
                ||        Countdown Latch     ||
                ||============================||

    =>  A CountDownLatch lets one or more threads wait until a set of operations in other threads completes. You initialize it with a count; each completing task calls `countDown()`, 
        and waiting threads call `await()` to block until the count reaches zero. It’s one-shot (can’t be reset) and is great for coordinating start-up or ensuring all workers finish
        before proceeding.
#   Introduction to countdown latch
#   When to use countdown latch

#   Is it functionally similar to join?
    1. Purpose
    2. Usage
#   Can we reset the count?
#   How does Cyclic Barrier work under the hood?


                ||============================||
                ||        Blocking Queue      ||
                ||============================||
                        

#   Introduction to Blocking Queuel
    > Blocking Queue Interfaces
       => BlockingQueue
            1. BlockingDeque
            2. TransferQueue
#   Major implementations
    => ArrayBlockingQueue
    => LinkedBlockingQueue
    => PriorityBlockingQueue
    => DelayQueue
    => SynchronousQueue

# Blocking Queue Operations
=> put(E e)
=> take()
=> offer(E e)
=> poll()
=> peek( )

        
                ||============================||
                ||        Cyclic Barrier      ||
                ||============================||
#   Introduction to Cyclic Barrier
#   How does Cyclic Barrier work under the hood?


                ||============================||
                ||        Exchanger           ||
                ||============================||


#   Introduction to Exchanger
    > What is Exchanger in Java?
    > Why and when to use Exchangers?
    > ELI5

#   Exchanger implementation in Java

#   Comparing Queue with Exchanger
    > Exchanger
        -> Point to Point communication
        -> Simplicity for two threads
        -> Synchronous
        -> Symmetrical exchange
    > Queue
        -> One to many communication
        -> Asynchronous
        -> Buffering
        -> Non symmetrical exchange
#   Similarity to Synchronous Queue


                ||============================||
                ||        Concurrent Map      ||
                ||============================||
# Introduction to Concurrent Map
> What is ConcurrentMap?
> Why do we need ConcurrentMap?
Concurrent Map Implementations
> ConcurrentHashMap
> ConcurrentSkipListMap
> ConcurrentLinkedHashMap
> ConcurrentNavigableMap

# Internal implementation and working of Concurrent Map
-> Adding an element to concurrent hash map
1. Hashing and Determining Segment
2. Acquiring Lock
3. Insertion in Segment
4. Releasing Lock

-> Fetching an element from concurrent hash map
1. Hashing and Determining Segment
2. Acquiring Lock
3. Searching in Segment
4. Releasing Lock