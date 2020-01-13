package org.ggyool.mapper;

import java.util.List;

import org.ggyool.domain.ProblemVO;

public interface ProblemMapper {
	public ProblemVO read(int problem_id);
	public int insert(ProblemVO vo);
	public int update(ProblemVO vo); 
	public int delete(int problem_id);
	
	public List<ProblemVO> getListAll();
}
