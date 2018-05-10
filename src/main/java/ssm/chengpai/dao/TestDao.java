package ssm.chengpai.dao;

import java.util.List;

import ssm.chengpai.bean.Duty;

public interface TestDao {

	
  public List<Duty> selectList();
  
  public void update(Duty d);
}
