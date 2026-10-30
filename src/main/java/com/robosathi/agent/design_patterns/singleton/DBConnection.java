package com.robosathi.agent.design_patterns.singleton;

public class DBConnection {

    private static DBConnection instance;

    // Private constructor prevents direct instantiation
    private DBConnection() {}

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }
}

/* Thread safe version
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DBConnection {
    private static DBConnection instance;
    private static Lock lock = new ReentrantLock();

    // Private constructor prevents direct instantiation
    private DBConnection() {}

    public static DBConnection getInstance() {
        // First check (no locking overhead if already initialized)
        if (instance == null) {
            lock.lock();
            // Second check (critical section)
            if (instance == null) {
                instance = new DBConnection();
            }
            lock.unlock();
        }
        return instance;
    }
}
*/


/* Multiton Thread safe version

package com.robosathi.agent.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DBConnection {
    // 1. Define the pool limit and a thread-safe list to hold instances
    private static final int MAX_POOL_SIZE = 10;
    private static final List<DBConnection> pool = new ArrayList<>(MAX_POOL_SIZE);

    // 2. Add a thread-safe counter to handle round-robin selection
    private static final AtomicInteger indexCounter = new AtomicInteger(0);
    private static final Lock lock = new ReentrantLock();

    // Private constructor prevents direct instantiation
    private DBConnection() {}

    public static DBConnection getInstance() {
        // Get the current safe index using round-robin math
        int index = Math.abs(indexCounter.getAndIncrement() % MAX_POOL_SIZE);

        // First check (thread-safe lookup without locking if the slot is occupied)
        if (pool.size() <= index || pool.get(index) == null) {
            lock.lock();
            try {
                // Ensure the list is padded up to the current index size safely
                while (pool.size() <= index) {
                    pool.add(null);
                }
                // Second check (critical section)
                if (pool.get(index) == null) {
                    pool.set(index, new DBConnection());
                }
            } finally {
                lock.unlock();
            }
        }
        return pool.get(index);
    }
}

*/
