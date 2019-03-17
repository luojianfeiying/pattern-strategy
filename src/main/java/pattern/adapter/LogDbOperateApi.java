package pattern.adapter;

import sun.rmi.runtime.Log;

import java.util.List;

public interface LogDbOperateApi {

    void createLog(LogModel lm);

    void updateLog(LogModel lm);

    void deleteLog(LogModel lm);

    List<LogModel> getAllLog();
}
