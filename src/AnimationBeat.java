
public class AnimationBeat {
    //USE the SINGLETON pattern
    private long started;
    private long a; // length of phase a
    private long b; // length of phase b
    private long c; // length of phase c
    private static AnimationBeat uniqueBeat;
   
    private AnimationBeat() {
        started = System.currentTimeMillis();
        this.a = 5000;
        this.b = 500;
        this.c = 500;
    }

    public static AnimationBeat getInstance(){
        if(uniqueBeat == null){
            uniqueBeat = new AnimationBeat();
        }

        return uniqueBeat;
    }

    // returns which phase the animation is currently in
    public char inPhase() {
        long currTime = System.currentTimeMillis();
        long rem = (currTime - started) % (a + b + c);
        if (rem > a + b) {
            return 'c';
        } else if (rem > a) {
            return 'b';
        } else {
            return 'a';
        }
    }

    // returns a number (out of 100) showing the percentage completion of this phase
    public long phaseCompletion() { 
        long currTime = System.currentTimeMillis();
        long rem = (currTime - started) % (a + b + c);
        if (rem > a + b) {
            return ((rem -a - b) * 100) / c;
        } else if (rem > a) {
            return ((rem - a) * 100) / b;
        } else {
            return rem * 100 / a;
        }

    }
}