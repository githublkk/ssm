package ssm.chengpai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

import ssm.chengpai.bean.Duty;
import ssm.chengpai.dao.TestDao;

@org.springframework.stereotype.Service
public class Service {
	@Autowired
	private TestDao dao;
	@Cacheable("sampleCache1")
	public List<Duty> list(){
		return dao.selectList();
				
	
	}
	@CacheEvict("sampleCache1")
	public void update(Duty d) {
	dao.update(d);
	}
}
