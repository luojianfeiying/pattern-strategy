package pattern.adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterTest {

    public static void main(String[] args) {
        LogModel lm = new LogModel();
        lm.setLogId("001");
        lm.setOperateUser("peijian");
        lm.setOperateTime("2019-03-17 16:00:00");
        lm.setLogContent("XXX");
        List<LogModel> list = new ArrayList<LogModel>();
        list.add(lm);
        LogFileOperateApi logFileApi = new LogFileOperate("");
        LogDbOperateApi logDbApi = new Adapter(logFileApi);
        logDbApi.createLog(lm);
        List<LogModel> logModels = logDbApi.getAllLog();
    }
}
