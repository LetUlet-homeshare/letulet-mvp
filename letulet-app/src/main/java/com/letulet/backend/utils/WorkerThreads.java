package com.letulet.backend.utils;

import com.letulet.utils.Log;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by stephan on 07/11/17.
 *
 * Provides threads for executing background tasks.
 *
 */
public class WorkerThreads {

	/**
	 * Maximum number of concurrent threads allowed (approximately).
	 */
	private static final int		MAX_THREADS	= 100;

	/**
	 * Provides a thread pool.
	 */
	private static ExecutorService threadPool	= Executors.newCachedThreadPool();

	/**
	 * Counter to restrict the number of concurrent threads.
	 */
	private static int				threadCount;

	/**
	 * Submits a task to the thread pool, assigns a name to the corresponding thread. Exceptions that are thrown by
	 * the {@link Runnable#run()} method of <code>task</code> are caught and logged.
	 *
	 * @param name name for the thread (useful for debugging purposes)
	 * @param task the task to execute
	 * @return a Future representing pending completion of the task, and whose <code>get()</code> method will return
	 * <code>null</code> upon completion; <code>null</code> if the task could not be submitted
	 */
	public static synchronized Future< ? > submit (final String name, final Runnable task) {

		// check if maximum number of threads has not been reached yet
		if (threadCount >= MAX_THREADS) {
            Log.warn (WorkerThreads.class,
			"could not submit background task: " + name);
			return null;
		}
		threadCount++;

		// submit task
		try {
			return threadPool.submit (new Runnable () {

				public void run () {

					try {
						Thread.currentThread ().setName (name); // set threads name
						task.run (); // run the task
						Thread.currentThread ().setName (name + " (done)"); // indicate that thread is done
					}
					catch (final Exception e) {
						Log.error (WorkerThreads.class,"unplanned exception in worker thread", e);
					}
					finally {
						// "release thread" after task is done
						threadCount--;
					}
				}
			});
		}
		catch (final RuntimeException e) {
			// "release thread" if an error occurred when submitting the task
			threadCount--;
			throw e;
		}
	}

	/**
	 * Submits a task to the thread pool, assigns a name to the corresponding thread.
	 *
	 * @param name name for the thread (useful for debugging purposes)
	 * @param task the task to execute
	 * @return a Future representing pending completion of the task, the Future's <code>get()</code> method will return
	 * the task's return value; <code>null</code> if the task could not be submitted
	 */
	public static synchronized <T> Future <T> submit (final String name, final Callable<T> task) {

		// check if maximum number of threads has not been reached yet
		if (threadCount >= MAX_THREADS) {
			Log.warn(WorkerThreads.class, "could not submit background task: " + name);
			return null;
		}
		threadCount++;

		// submit task
		try {
			return threadPool.submit (new Callable <T> () {

				public T call () throws Exception {

					try {
						Thread.currentThread ().setName (name); // set threads name
						return task.call (); // run the task
					}
					finally {
						// "release thread" after task is done
						threadCount--;
					}
				}
			});
		}
		catch (final RuntimeException e) {
			// "release thread" if an error occurred when submitting the task
			threadCount--;
			throw e;
		}
	}

}

