package app.clase2.metodo;

public class Debug {

    public boolean debuggingOn = false;
    public final int LEVEL = 1;

    public Debug(boolean estado) {
        this.debuggingOn = estado;
    }

    public void print(String msg) {
        if (this.debuggingOn) {
            System.out.print(msg);
        }
    }
}
