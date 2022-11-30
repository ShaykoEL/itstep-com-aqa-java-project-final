package itstep_aqa_java_core_project_final.dao;

import java.util.List;

public abstract class FileDAO {
    abstract List readFile ();
    abstract boolean saveFile (List file);

}
