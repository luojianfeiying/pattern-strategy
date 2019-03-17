package pattern.adapter;

import java.io.*;
import java.util.List;

public class LogFileOperate implements LogFileOperateApi {

    private String logFilePathName = "AdapterLog.log";

    public LogFileOperate(String logFilePathName) {
        if(logFilePathName != null && logFilePathName.trim().length() > 0){
            this.logFilePathName = logFilePathName;
        }
    }

    public List<LogModel> readLogFile() {
        List<LogModel> list = null;
        ObjectInputStream oin = null;
        try{
            File f = new File(logFilePathName);
            if(f.exists()){
                oin = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)));
                list = (List<LogModel>) oin.readObject();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(oin != null){
                try{
                    oin.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
        return list;
    }

    public void writeLogFile(List<LogModel> list) {
        File f = new File(logFilePathName);
        ObjectOutputStream oos = null;
        try{
            oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)));
            oos.writeObject(list);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(oos != null){
                try{
                    oos.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
