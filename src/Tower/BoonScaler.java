package Tower;

import java.util.Comparator;

public class BoonScaler {
    int reqLevel;
    int Scaler;

    public BoonScaler(int level, int scaler) {
        reqLevel = level;
        Scaler = scaler;
    }

    public int getreqLevel() {
        return reqLevel;
    }

    public BoonScaler setreqLevel(int level) {
        reqLevel = level;
        return this;
    }

    public int getScaler() {
        return Scaler;
    }

    public BoonScaler setScaler(int scaler) {
        Scaler = scaler;
        return this;
    }

    public static class sortByreqLevel implements Comparator<BoonScaler>{
        @Override
        public int compare(BoonScaler o1,BoonScaler o2) {
            return Integer.compare(o1.getreqLevel(),o2.getreqLevel());
        }
    }
}
