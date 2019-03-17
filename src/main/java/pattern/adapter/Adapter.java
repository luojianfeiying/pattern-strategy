package pattern.adapter;

import java.util.List;

public class Adapter implements LogDbOperateApi{

    private LogFileOperateApi adaptee;

    public Adapter(LogFileOperateApi adaptee) {
        this.adaptee = adaptee;
    }

    public void createLog(LogModel lm) {
        List<LogModel> list = adaptee.readLogFile();
        list.add(lm);
        adaptee.writeLogFile(list);
    }

    public void updateLog(LogModel lm) {

    }

    public void deleteLog(LogModel lm) {
        List<LogModel> list = adaptee.readLogFile();
        list.remove(lm);
        adaptee.writeLogFile(list);
    }

    public List<LogModel> getAllLog() {
        return adaptee.readLogFile();
    }
}
