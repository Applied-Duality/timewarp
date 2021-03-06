package co.paralleluniverse.vtime;

public final class Clock_ {
    private Clock_() {
    }

    public static long System_currentTimeMillis() {
        return VirtualClock.get().System_currentTimeMillis();
    }

    public static long System_nanoTime() {
        return VirtualClock.get().System_nanoTime();
    }

    public static void Object_wait(Object obj, long timeout) throws InterruptedException {
        VirtualClock.get().Object_wait(obj, timeout);
    }

    public static void Object_wait(Object obj, long timeout, int nanos) throws InterruptedException {
        VirtualClock.get().Object_wait(obj, timeout, nanos);
    }

    public static void Thread_sleep(long millis) throws InterruptedException {
        VirtualClock.get().Thread_sleep(millis);
    }

    public static void Thread_sleep(long millis, int nanos) throws InterruptedException {
        VirtualClock.get().Thread_sleep(millis, nanos);
    }

    public static void Unsafe_park(boolean isDeadline, long timeout) {
        VirtualClock.get().Unsafe_park(isDeadline, timeout);
    }
}
