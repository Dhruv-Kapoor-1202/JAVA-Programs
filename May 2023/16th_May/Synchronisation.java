/*
Sync : 
- execution tym is more bcoz if a thread is executing no other thread can be executed
- used for security purpose
- used in web apps like bank application
Non Sync : 
- execution tym is less
*/

class Callme {
    synchronized public void display(String str) throws Exception {
        System.out.print("[ " + str);
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        System.out.println(" ]");
    }
}

class Caller implements Runnable {
    Thread t;
    Callme target;
    String name;

    Caller(Callme target, String name) {
        this.name = name;
        this.target = target;
        t = new Thread(this, name);
        t.start();
    }

    public void run() {
        try {
            target.display(name);
        } catch (Exception e) {
        }
        // target.display(name);
    }
}

class Synchronisation {
    public static void main(String[] args) {
        Callme target = new Callme();
        new Caller(target, "Hello");
        new Caller(target, "World");
        new Caller(target, "Sync");
    }
}