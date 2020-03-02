package crud;

import java.util.List;
import java.util.Map;

public interface crud {
	Boolean insert(String name,String age,String sex);
	int update(String SId,String name,String age,String sex);
	int delete(String SId);
	List select();

}
