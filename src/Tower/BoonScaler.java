package Tower;

import java.util.Comparator;

public class BoonScaler {
    int Level;
    int Scaler;

    public BoonScaler(int level, int scaler) {
        Level = level;
        Scaler = scaler;
    }

    public int getLevel() {
        return Level;
    }

    public BoonScaler setLevel(int level) {
        Level = level;
        return this;
    }

    public int getScaler() {
        return Scaler;
    }

    public BoonScaler setScaler(int scaler) {
        Scaler = scaler;
        return this;
    }

    public class sortByLevel implements Comparator<BoonScaler>{
        @Override
        public int compare(BoonScaler o1,BoonScaler o2) {
            return Integer.compare(o1.getLevel(),o2.getLevel());
        }
    }
}
