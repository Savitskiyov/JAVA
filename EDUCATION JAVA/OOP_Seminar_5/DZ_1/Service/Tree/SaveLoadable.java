package OOP_Seminar_5.DZ_1.Service.Tree;

import java.io.IOException;

public interface SaveLoadable {
    void save() throws IOException;

    void load(String path) throws Exception;

    void load() throws Exception;
}