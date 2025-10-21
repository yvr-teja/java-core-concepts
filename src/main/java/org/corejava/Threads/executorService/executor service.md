###Executor service
>Ways of creating thread
>1. Extending the `Thread` class
>2. Implementing the `Runnable` interface
>3. Using a Lambda expression
>4. Using the `ExecutorService` framework

>How to create multiple threads?
> Using Thread class with for loop
> >Use for loop may be?
> Use ExecutorService (Thread Pool) — it efficiently manages multiple threads,
reuses them, and avoids performance issues.
> Looks like it may not scale!
>How about a pool of threads?
>ExecutorService to the rescue :)
>There are 4 types of ExecutorService
>1. SingleThreadExecutor
>2. FixedThreadPoolExecutor
>3. CachedThreadPool
>4. ScheduledExecutor
> Let's code these & understand their working!