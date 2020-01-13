package org.ggyool.mapper;

import java.util.List;

import org.ggyool.domain.ProblemVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

//@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {org.ggyool.config.RootConfig.class} )
@Log4j
public class ProblemMapperTests {
	
	@Autowired
	private ProblemMapper mapper;
	
	//@Test
	public void insertTest() {
		ProblemVO vo = new ProblemVO();
		vo.setUser_id("ggyool2");
		vo.setUser_name("�����ٶ󸶹ٻ�");
		vo.setProblem_title("�׽�Ʈ ����4 ����");
		vo.setProblem_content("�׽�Ʈ ����4 ����");
		vo.setProblem_type('m');
		log.info("here:" + mapper.insert(vo));
		log.info("here:" + vo.getProblem_id());
	}
	
	//@Test
	public void readTest() {
		log.info(mapper.read(1));
	}
	
	//@Test
	public void updateTest() {
		ProblemVO vo = new ProblemVO();
		vo.setProblem_id(1);
		vo.setUser_id("ggyool2");
		vo.setUser_name("�����ٶ󸶹ٻ�");
		vo.setProblem_title("�׽�Ʈ ����1 ���� ����");
		vo.setProblem_content("�׽�Ʈ ����1 ���� ����");
		vo.setProblem_type('s');
		mapper.update(vo);
	}
	
	//@Test
	public void deleteTest() {
		mapper.delete(1);
	}
	
	//@Test 
	public void getListTest() { 
		List<ProblemVO> lst = mapper.getListAll();
		log.info(lst);
	}
	
}
